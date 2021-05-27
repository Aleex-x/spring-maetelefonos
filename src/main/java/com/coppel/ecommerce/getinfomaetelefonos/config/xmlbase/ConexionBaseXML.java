package com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase;

import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.XmlBase.Clases.InnerClases;
import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.XmlBase.Clases.InnerClases.BasicDataSourceXml;
import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.XmlBase.Conexiones.Conexion;
import com.coppel.ecommerce.getinfomaetelefonos.exception.own.ConfigurationException;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

public class ConexionBaseXML {

  private static final String PATH_XML_BASE =
      System.getenv("CONF_PATH") + File.separator + "XML_BASE.xml";
  private static XmlBase XML_BASE = configXmlBase();

  private ConexionBaseXML() {} // No instantiation outside the class.

  private static XmlBase configXmlBase() {
    if(null != System.getenv("CONF_PATH")) {
      if (XML_BASE == null) { // Only will be loaded and parsed one time.
        try {
          JAXBContext jaxbContext = JAXBContext.newInstance(XmlBase.class);
          Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
          File xmlFile = new File(PATH_XML_BASE);
          if (!xmlFile.exists()) {
            throw new ConfigurationException(
                "El archivo de configuración XML_BASE ruta " + PATH_XML_BASE + " no existe");
          }
          XML_BASE = (XmlBase) jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
          throw new ConfigurationException(e);
        }
      }
    } else {
      throw new ConfigurationException("La variable de ambiente CONF_PATH no existe");      
    }

    return XML_BASE;
  }

  public static final Conexion getConexionByName(final String nameBD) {
    if(XML_BASE == null) {
      throw new ConfigurationException("No se pudo obtener información del archivo XML_BASE.xml");
    }
    if (nameBD == null || nameBD.trim().equals("")) {
      throw new ConfigurationException("nameBD no puede ser vacío");
    }
    List<Conexion> conns =
        XML_BASE.conexiones.conexion.subList(0, XML_BASE.conexiones.conexion.size());
    Conexion namedConn = null;

    for (Conexion conn : conns) {
      if (nameBD.equals(conn.getName())) {
        namedConn = conn;
        break;
      }
    }

    if (namedConn == null) {
      throw new ConfigurationException("La conexion [" + nameBD + "] no existe en el archivo ");
    } else {
      String password = namedConn.getPassword();

      try {
        namedConn.setPassword(Desencriptar(password, nameBD));
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    return namedConn;
  }

  public static final BasicDataSourceXml getPoolConfigConexion() {
    List<Object> clases =
        XML_BASE.clases.clasesOrClase.subList(0, XML_BASE.clases.clasesOrClase.size());
    BasicDataSourceXml basicDataSource = null;
    for (Object clz : clases) {
      if (clz instanceof InnerClases) {
        InnerClases innerClase = ((InnerClases) clz);
        if ("JKS".equals(innerClase.getName())) {
          basicDataSource = ((InnerClases) clz).getBasicDataSource();
          break;
        }
      }
    }

    if (basicDataSource == null) {
      throw new ConfigurationException("basicDataSource no existe en el archivo ");
    }
    return basicDataSource;
  }

  private static String Desencriptar(String textoEncriptado, String secretKey) throws Exception {
    String base64EncryptedString = "";

    try {
      byte[] message = Base64.decodeBase64(textoEncriptado);
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
      byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
      SecretKey key = new SecretKeySpec(keyBytes, "DESede");

      Cipher decipher = Cipher.getInstance("DESede");
      decipher.init(Cipher.DECRYPT_MODE, key);

      byte[] plainText = decipher.doFinal(message);

      base64EncryptedString = new String(plainText, "UTF-8");

    } catch (Exception ex) {
      System.out.println(ex);
    }
    return base64EncryptedString;
  }
}
