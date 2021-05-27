
package com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conexiones">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conexion" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="jdbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WebServices">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="websevice" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Clases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="clases">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="urlRedireccionCat">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sms">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="caracterespermitidos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="llavepublica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="llaveprivada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="crearCuentas">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="flagCrearCuentaGV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="flagCrearCuentaNL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="timeoutServicio">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ccuenta">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                                 &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="memberService">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                                 &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="strikeIron">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                                 &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="urlEnvironmentCredit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="urlEnvironmentContado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="jks">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="keyStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="keyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="trustStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="trustStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="jobenvio">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="num_hilo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ecommerce">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                       &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="strikeiron">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="status">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="v6" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                                 &lt;element name="v5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="sources">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="source">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="prioridad">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="primera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="segunda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="timeoutws" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="proxy">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="accertify">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="default_proxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="exacttarget">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BancoppelConfig">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="trans_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="trans_ccta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="proveedorCorreoExacttarget" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="proveedorCorreoEmarsys" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="nombreEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tokenEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ecomexperts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="folderMove" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="folderdownload" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="tipoarchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="urlCancelacion" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sliderapp">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="proxyConfig">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="proxycatalogoproductos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="EcommSync">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="grant_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="client_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="warehouseid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="listaprecio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="listaprecioespecial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="timeoutValidacionCorreosElectronico" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="BasicDataSource">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="MinIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="MaxIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="MaxOpenPreparedStatements" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="MaxTotal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ServerBodegaRopaDisponible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="clase">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="credencialesFedex" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="userCredencialKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="userCredencialPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="meterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="customerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="shipperCodePostal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="activoConsultaDisponibilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="credencialesDhl" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="credencialesMercadoLibre" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="clientIdML" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="clientSecretML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyHostML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="proxyPortML" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="credencialesBancoppel" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="agent_trans_type_code_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="agent_trans_type_code_user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="piConfig" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="versionRopa" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="versionMuebles" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xmls">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xml">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"conexiones", "webServices", "clases", "xmls"})
@XmlRootElement(name = "base")
public class XmlBase {

  @XmlElement(name = "Conexiones", required = true)
  protected Conexiones conexiones;
  @XmlElement(name = "WebServices", required = true)
  protected WebServices webServices;
  @XmlElement(name = "Clases", required = true)
  protected Clases clases;
  @XmlElement(required = true)
  protected Xmls xmls;

  /**
   * Gets the value of the conexiones property.
   *
   * @return possible object is {@link Conexiones }
   *
   */
  public Conexiones getConexiones() {
    return conexiones;
  }

  /**
   * Sets the value of the conexiones property.
   *
   * @param value allowed object is {@link Conexiones }
   *
   */
  public void setConexiones(Conexiones value) {
    this.conexiones = value;
  }

  /**
   * Gets the value of the webServices property.
   *
   * @return possible object is {@link WebServices }
   *
   */
  public WebServices getWebServices() {
    return webServices;
  }

  /**
   * Sets the value of the webServices property.
   *
   * @param value allowed object is {@link WebServices }
   *
   */
  public void setWebServices(WebServices value) {
    this.webServices = value;
  }

  /**
   * Gets the value of the clases property.
   *
   * @return possible object is {@link Clases }
   *
   */
  public Clases getClases() {
    return clases;
  }

  /**
   * Sets the value of the clases property.
   *
   * @param value allowed object is {@link Clases }
   *
   */
  public void setClases(Clases value) {
    this.clases = value;
  }

  /**
   * Gets the value of the xmls property.
   *
   * @return possible object is {@link Xmls }
   *
   */
  public Xmls getXmls() {
    return xmls;
  }

  /**
   * Sets the value of the xmls property.
   *
   * @param value allowed object is {@link Xmls }
   *
   */
  public void setXmls(Xmls value) {
    this.xmls = value;
  }


  /**
   * <p>
   * Java class for anonymous complex type.
   *
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;choice maxOccurs="unbounded" minOccurs="0">
   *         &lt;element name="clases">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="urlRedireccionCat">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="sms">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="caracterespermitidos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="llavepublica" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="llaveprivada" type="{http://www.w3.org/2001/XMLSchema}long"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="crearCuentas">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="flagCrearCuentaGV" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="flagCrearCuentaNL" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="timeoutServicio">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="ccuenta">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                       &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="memberService">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                       &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="strikeIron">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                       &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="urlEnvironmentCredit" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="urlEnvironmentContado" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="jks">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="keyStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="keyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="trustStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="trustStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="jobenvio">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="num_hilo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="ecommerce">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                             &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="strikeiron">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
   *                             &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="status">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="v6" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                       &lt;element name="v5" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="sources">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="source">
   *                                         &lt;complexType>
   *                                           &lt;complexContent>
   *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                               &lt;sequence>
   *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                                 &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                               &lt;/sequence>
   *                                               &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                             &lt;/restriction>
   *                                           &lt;/complexContent>
   *                                         &lt;/complexType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="prioridad">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="primera" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="segunda" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="timeoutws" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                           &lt;/choice>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="proxy">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="accertify">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="default_proxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="exacttarget">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="BancoppelConfig">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="trans_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="trans_ccta" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="proveedorCorreoExacttarget" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                   &lt;element name="proveedorCorreoEmarsys" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                   &lt;element name="nombreEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="tokenEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="ecomexperts">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="folderMove" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="folderdownload" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="tipoarchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="urlCancelacion" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="sliderapp">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="proxyConfig">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="proxycatalogoproductos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                   &lt;element name="EcommSync">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="grant_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="client_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="warehouseid" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="listaprecio" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="listaprecioespecial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="timeoutValidacionCorreosElectronico" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                   &lt;element name="BasicDataSource">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="MinIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="MaxIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="MaxOpenPreparedStatements" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="MaxTotal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="ServerBodegaRopaDisponible" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="clase">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="credencialesFedex" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="userCredencialKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="userCredencialPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="meterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
   *                             &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
   *                             &lt;element name="customerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="shipperCodePostal" type="{http://www.w3.org/2001/XMLSchema}int"/>
   *                             &lt;element name="activoConsultaDisponibilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="credencialesDhl" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="credencialesMercadoLibre" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="clientIdML" type="{http://www.w3.org/2001/XMLSchema}long"/>
   *                             &lt;element name="clientSecretML" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyHostML" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="proxyPortML" type="{http://www.w3.org/2001/XMLSchema}short"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="credencialesBancoppel" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="agent_trans_type_code_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="agent_trans_type_code_user" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="piConfig" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="versionRopa" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="versionMuebles" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/choice>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   *
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"clasesOrClase"})
  public static class Clases {

    @XmlElements({@XmlElement(name = "clases", type = InnerClases.class),
        @XmlElement(name = "clase", type = Clase.class)})
    protected List<Object> clasesOrClase;

    /**
     * Gets the value of the clasesOrClase property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the clasesOrClase property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getClasesOrClase().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link InnerClases }
     * {@link Clase }
     *
     *
     */
    public List<Object> getClasesOrClase() {
      if (clasesOrClase == null) {
        clasesOrClase = new ArrayList<Object>();
      }
      return this.clasesOrClase;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="credencialesFedex" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="userCredencialKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="userCredencialPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="meterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="customerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="shipperCodePostal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="activoConsultaDisponibilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="credencialesDhl" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="credencialesMercadoLibre" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="clientIdML" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="clientSecretML" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyHostML" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyPortML" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="credencialesBancoppel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="agent_trans_type_code_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="agent_trans_type_code_user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="piConfig" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="versionRopa" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="versionMuebles" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"credencialesFedex", "credencialesDhl",
        "credencialesMercadoLibre", "credencialesBancoppel", "piConfig"})
    public static class Clase {

      protected CredencialesFedex credencialesFedex;
      protected CredencialesDhl credencialesDhl;
      protected CredencialesMercadoLibre credencialesMercadoLibre;
      protected CredencialesBancoppel credencialesBancoppel;
      protected PiConfig piConfig;
      @XmlAttribute(name = "name")
      protected String name;

      /**
       * Gets the value of the credencialesFedex property.
       *
       * @return possible object is {@link CredencialesFedex }
       *
       */
      public CredencialesFedex getCredencialesFedex() {
        return credencialesFedex;
      }

      /**
       * Sets the value of the credencialesFedex property.
       *
       * @param value allowed object is {@link CredencialesFedex }
       *
       */
      public void setCredencialesFedex(CredencialesFedex value) {
        this.credencialesFedex = value;
      }

      /**
       * Gets the value of the credencialesDhl property.
       *
       * @return possible object is {@link CredencialesDhl }
       *
       */
      public CredencialesDhl getCredencialesDhl() {
        return credencialesDhl;
      }

      /**
       * Sets the value of the credencialesDhl property.
       *
       * @param value allowed object is {@link CredencialesDhl }
       *
       */
      public void setCredencialesDhl(CredencialesDhl value) {
        this.credencialesDhl = value;
      }

      /**
       * Gets the value of the credencialesMercadoLibre property.
       *
       * @return possible object is {@link CredencialesMercadoLibre }
       *
       */
      public CredencialesMercadoLibre getCredencialesMercadoLibre() {
        return credencialesMercadoLibre;
      }

      /**
       * Sets the value of the credencialesMercadoLibre property.
       *
       * @param value allowed object is {@link CredencialesMercadoLibre }
       *
       */
      public void setCredencialesMercadoLibre(CredencialesMercadoLibre value) {
        this.credencialesMercadoLibre = value;
      }

      /**
       * Gets the value of the credencialesBancoppel property.
       *
       * @return possible object is {@link CredencialesBancoppel }
       *
       */
      public CredencialesBancoppel getCredencialesBancoppel() {
        return credencialesBancoppel;
      }

      /**
       * Sets the value of the credencialesBancoppel property.
       *
       * @param value allowed object is {@link CredencialesBancoppel }
       *
       */
      public void setCredencialesBancoppel(CredencialesBancoppel value) {
        this.credencialesBancoppel = value;
      }

      /**
       * Gets the value of the piConfig property.
       *
       * @return possible object is {@link PiConfig }
       *
       */
      public PiConfig getPiConfig() {
        return piConfig;
      }

      /**
       * Sets the value of the piConfig property.
       *
       * @param value allowed object is {@link PiConfig }
       *
       */
      public void setPiConfig(PiConfig value) {
        this.piConfig = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setName(String value) {
        this.name = value;
      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="agent_trans_type_code_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="agent_trans_type_code_user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"userName", "userPass", "ipOrigen", "ipDestino",
          "agentTransTypeCodeLogin", "agentTransTypeCodeUser", "agentCd"})
      public static class CredencialesBancoppel {

        @XmlElement(name = "user_name", required = true)
        protected String userName;
        @XmlElement(name = "user_pass", required = true)
        protected String userPass;
        @XmlElement(name = "ip_origen", required = true)
        protected String ipOrigen;
        @XmlElement(name = "ip_destino", required = true)
        protected String ipDestino;
        @XmlElement(name = "agent_trans_type_code_login", required = true)
        protected String agentTransTypeCodeLogin;
        @XmlElement(name = "agent_trans_type_code_user", required = true)
        protected String agentTransTypeCodeUser;
        @XmlElement(name = "agent_cd", required = true)
        protected String agentCd;

        /**
         * Gets the value of the userName property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserName() {
          return userName;
        }

        /**
         * Sets the value of the userName property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserName(String value) {
          this.userName = value;
        }

        /**
         * Gets the value of the userPass property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserPass() {
          return userPass;
        }

        /**
         * Sets the value of the userPass property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserPass(String value) {
          this.userPass = value;
        }

        /**
         * Gets the value of the ipOrigen property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIpOrigen() {
          return ipOrigen;
        }

        /**
         * Sets the value of the ipOrigen property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIpOrigen(String value) {
          this.ipOrigen = value;
        }

        /**
         * Gets the value of the ipDestino property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIpDestino() {
          return ipDestino;
        }

        /**
         * Sets the value of the ipDestino property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIpDestino(String value) {
          this.ipDestino = value;
        }

        /**
         * Gets the value of the agentTransTypeCodeLogin property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getAgentTransTypeCodeLogin() {
          return agentTransTypeCodeLogin;
        }

        /**
         * Sets the value of the agentTransTypeCodeLogin property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setAgentTransTypeCodeLogin(String value) {
          this.agentTransTypeCodeLogin = value;
        }

        /**
         * Gets the value of the agentTransTypeCodeUser property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getAgentTransTypeCodeUser() {
          return agentTransTypeCodeUser;
        }

        /**
         * Sets the value of the agentTransTypeCodeUser property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setAgentTransTypeCodeUser(String value) {
          this.agentTransTypeCodeUser = value;
        }

        /**
         * Gets the value of the agentCd property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getAgentCd() {
          return agentCd;
        }

        /**
         * Sets the value of the agentCd property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setAgentCd(String value) {
          this.agentCd = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"siteId", "password", "proxyHost", "proxyPort"})
      public static class CredencialesDhl {

        @XmlElement(required = true)
        protected String siteId;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String proxyHost;
        @XmlElement(required = true)
        protected String proxyPort;

        /**
         * Gets the value of the siteId property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getSiteId() {
          return siteId;
        }

        /**
         * Sets the value of the siteId property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setSiteId(String value) {
          this.siteId = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

        /**
         * Gets the value of the proxyHost property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyHost() {
          return proxyHost;
        }

        /**
         * Sets the value of the proxyHost property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyHost(String value) {
          this.proxyHost = value;
        }

        /**
         * Gets the value of the proxyPort property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyPort() {
          return proxyPort;
        }

        /**
         * Sets the value of the proxyPort property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyPort(String value) {
          this.proxyPort = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="userCredencialKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="userCredencialPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="meterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
       *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
       *         &lt;element name="customerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="shipperCodePostal" type="{http://www.w3.org/2001/XMLSchema}int"/>
       *         &lt;element name="activoConsultaDisponibilidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "",
          propOrder = {"activo", "userCredencialKey", "userCredencialPassword", "meterNumber",
              "accountNumber", "customerTransactionId", "shipperCodePostal",
              "activoConsultaDisponibilidad"})
      public static class CredencialesFedex {

        @XmlElement(required = true)
        protected String activo;
        @XmlElement(required = true)
        protected String userCredencialKey;
        @XmlElement(required = true)
        protected String userCredencialPassword;
        protected int meterNumber;
        protected int accountNumber;
        @XmlElement(required = true)
        protected String customerTransactionId;
        protected int shipperCodePostal;
        @XmlElement(required = true)
        protected String activoConsultaDisponibilidad;

        /**
         * Gets the value of the activo property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getActivo() {
          return activo;
        }

        /**
         * Sets the value of the activo property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setActivo(String value) {
          this.activo = value;
        }

        /**
         * Gets the value of the userCredencialKey property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserCredencialKey() {
          return userCredencialKey;
        }

        /**
         * Sets the value of the userCredencialKey property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserCredencialKey(String value) {
          this.userCredencialKey = value;
        }

        /**
         * Gets the value of the userCredencialPassword property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserCredencialPassword() {
          return userCredencialPassword;
        }

        /**
         * Sets the value of the userCredencialPassword property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserCredencialPassword(String value) {
          this.userCredencialPassword = value;
        }

        /**
         * Gets the value of the meterNumber property.
         *
         */
        public int getMeterNumber() {
          return meterNumber;
        }

        /**
         * Sets the value of the meterNumber property.
         *
         */
        public void setMeterNumber(int value) {
          this.meterNumber = value;
        }

        /**
         * Gets the value of the accountNumber property.
         *
         */
        public int getAccountNumber() {
          return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         *
         */
        public void setAccountNumber(int value) {
          this.accountNumber = value;
        }

        /**
         * Gets the value of the customerTransactionId property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getCustomerTransactionId() {
          return customerTransactionId;
        }

        /**
         * Sets the value of the customerTransactionId property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setCustomerTransactionId(String value) {
          this.customerTransactionId = value;
        }

        /**
         * Gets the value of the shipperCodePostal property.
         *
         */
        public int getShipperCodePostal() {
          return shipperCodePostal;
        }

        /**
         * Sets the value of the shipperCodePostal property.
         *
         */
        public void setShipperCodePostal(int value) {
          this.shipperCodePostal = value;
        }

        /**
         * Gets the value of the activoConsultaDisponibilidad property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getActivoConsultaDisponibilidad() {
          return activoConsultaDisponibilidad;
        }

        /**
         * Sets the value of the activoConsultaDisponibilidad property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setActivoConsultaDisponibilidad(String value) {
          this.activoConsultaDisponibilidad = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="clientIdML" type="{http://www.w3.org/2001/XMLSchema}long"/>
       *         &lt;element name="clientSecretML" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyHostML" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyPortML" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "",
          propOrder = {"clientIdML", "clientSecretML", "proxyHostML", "proxyPortML"})
      public static class CredencialesMercadoLibre {

        protected long clientIdML;
        @XmlElement(required = true)
        protected String clientSecretML;
        @XmlElement(required = true)
        protected String proxyHostML;
        protected short proxyPortML;

        /**
         * Gets the value of the clientIdML property.
         *
         */
        public long getClientIdML() {
          return clientIdML;
        }

        /**
         * Sets the value of the clientIdML property.
         *
         */
        public void setClientIdML(long value) {
          this.clientIdML = value;
        }

        /**
         * Gets the value of the clientSecretML property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getClientSecretML() {
          return clientSecretML;
        }

        /**
         * Sets the value of the clientSecretML property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setClientSecretML(String value) {
          this.clientSecretML = value;
        }

        /**
         * Gets the value of the proxyHostML property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyHostML() {
          return proxyHostML;
        }

        /**
         * Sets the value of the proxyHostML property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyHostML(String value) {
          this.proxyHostML = value;
        }

        /**
         * Gets the value of the proxyPortML property.
         *
         */
        public short getProxyPortML() {
          return proxyPortML;
        }

        /**
         * Sets the value of the proxyPortML property.
         *
         */
        public void setProxyPortML(short value) {
          this.proxyPortML = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="versionRopa" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="versionMuebles" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"version", "versionRopa", "versionMuebles"})
      public static class PiConfig {

        protected byte version;
        protected byte versionRopa;
        protected byte versionMuebles;

        /**
         * Gets the value of the version property.
         *
         */
        public byte getVersion() {
          return version;
        }

        /**
         * Sets the value of the version property.
         *
         */
        public void setVersion(byte value) {
          this.version = value;
        }

        /**
         * Gets the value of the versionRopa property.
         *
         */
        public byte getVersionRopa() {
          return versionRopa;
        }

        /**
         * Sets the value of the versionRopa property.
         *
         */
        public void setVersionRopa(byte value) {
          this.versionRopa = value;
        }

        /**
         * Gets the value of the versionMuebles property.
         *
         */
        public byte getVersionMuebles() {
          return versionMuebles;
        }

        /**
         * Sets the value of the versionMuebles property.
         *
         */
        public void setVersionMuebles(byte value) {
          this.versionMuebles = value;
        }

      }

    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="urlRedireccionCat">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="caracterespermitidos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="llavepublica" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="llaveprivada" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="crearCuentas">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="flagCrearCuentaGV" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="flagCrearCuentaNL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="timeoutServicio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ccuenta">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="memberService">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="strikeIron">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="urlEnvironmentCredit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="urlEnvironmentContado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="jks">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="keyStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="keyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="trustStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="trustStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="jobenvio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="num_hilo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ecommerce">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="strikeiron">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="status">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="v6" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="v5" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sources">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="source">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="prioridad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="primera" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="segunda" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="timeoutws" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="proxy">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="accertify">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="default_proxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="exacttarget">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BancoppelConfig">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="trans_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="trans_ccta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="proveedorCorreoExacttarget" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="proveedorCorreoEmarsys" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nombreEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tokenEmpresaMemberService" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ecomexperts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="folderMove" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="folderdownload" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tipoarchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="urlCancelacion" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sliderapp">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="proxyConfig">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="proxycatalogoproductos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="EcommSync">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="grant_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="client_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="warehouseid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="listaprecio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="listaprecioespecial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="timeoutValidacionCorreosElectronico" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="BasicDataSource">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MinIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="MaxIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="MaxOpenPreparedStatements" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="MaxTotal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ServerBodegaRopaDisponible" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "",
        propOrder = {"urlRedireccionCat", "sms", "crearCuentas", "timeoutServicio",
            "urlEnvironmentCredit", "urlEnvironmentContado", "jks", "jobenvio", "ecommerce",
            "strikeiron", "proxy", "accertify", "exacttarget", "bancoppelConfig",
            "proveedorCorreoExacttarget", "proveedorCorreoEmarsys", "nombreEmpresaMemberService",
            "tokenEmpresaMemberService", "ecomexperts", "sliderapp", "proxyConfig",
            "proxycatalogoproductos", "ecommSync", "timeoutValidacionCorreosElectronico",
            "basicDataSource", "serverBodegaRopaDisponible"})
    public static class InnerClases {

      @XmlElement(required = true)
      protected UrlRedireccionCat urlRedireccionCat;
      @XmlElement(required = true)
      protected Sms sms;
      @XmlElement(required = true)
      protected CrearCuentas crearCuentas;
      @XmlElement(required = true)
      protected TimeoutServicio timeoutServicio;
      @XmlElement(required = true)
      protected String urlEnvironmentCredit;
      @XmlElement(required = true)
      protected String urlEnvironmentContado;
      @XmlElement(required = true)
      protected Jks jks;
      @XmlElement(required = true)
      protected Jobenvio jobenvio;
      @XmlElement(required = true)
      protected Ecommerce ecommerce;
      @XmlElement(required = true)
      protected Strikeiron strikeiron;
      @XmlElement(required = true)
      protected Proxy proxy;
      @XmlElement(required = true)
      protected Accertify accertify;
      @XmlElement(required = true)
      protected Exacttarget exacttarget;
      @XmlElement(name = "BancoppelConfig", required = true)
      protected BancoppelConfig bancoppelConfig;
      protected byte proveedorCorreoExacttarget;
      protected byte proveedorCorreoEmarsys;
      @XmlElement(required = true)
      protected String nombreEmpresaMemberService;
      @XmlElement(required = true)
      protected String tokenEmpresaMemberService;
      @XmlElement(required = true)
      protected Ecomexperts ecomexperts;
      @XmlElement(required = true)
      protected Sliderapp sliderapp;
      @XmlElement(required = true)
      protected ProxyConfig proxyConfig;
      protected byte proxycatalogoproductos;
      @XmlElement(name = "EcommSync", required = true)
      protected EcommSync ecommSync;
      protected short timeoutValidacionCorreosElectronico;
      @XmlElement(name = "BasicDataSource", required = true)
      protected BasicDataSourceXml basicDataSource;
      @XmlElement(name = "ServerBodegaRopaDisponible", required = true)
      protected String serverBodegaRopaDisponible;
      @XmlAttribute(name = "name")
      protected String name;

      /**
       * Gets the value of the urlRedireccionCat property.
       *
       * @return possible object is {@link UrlRedireccionCat }
       *
       */
      public UrlRedireccionCat getUrlRedireccionCat() {
        return urlRedireccionCat;
      }

      /**
       * Sets the value of the urlRedireccionCat property.
       *
       * @param value allowed object is {@link UrlRedireccionCat }
       *
       */
      public void setUrlRedireccionCat(UrlRedireccionCat value) {
        this.urlRedireccionCat = value;
      }

      /**
       * Gets the value of the sms property.
       *
       * @return possible object is {@link Sms }
       *
       */
      public Sms getSms() {
        return sms;
      }

      /**
       * Sets the value of the sms property.
       *
       * @param value allowed object is {@link Sms }
       *
       */
      public void setSms(Sms value) {
        this.sms = value;
      }

      /**
       * Gets the value of the crearCuentas property.
       *
       * @return possible object is {@link CrearCuentas }
       *
       */
      public CrearCuentas getCrearCuentas() {
        return crearCuentas;
      }

      /**
       * Sets the value of the crearCuentas property.
       *
       * @param value allowed object is {@link CrearCuentas }
       *
       */
      public void setCrearCuentas(CrearCuentas value) {
        this.crearCuentas = value;
      }

      /**
       * Gets the value of the timeoutServicio property.
       *
       * @return possible object is {@link TimeoutServicio }
       *
       */
      public TimeoutServicio getTimeoutServicio() {
        return timeoutServicio;
      }

      /**
       * Sets the value of the timeoutServicio property.
       *
       * @param value allowed object is {@link TimeoutServicio }
       *
       */
      public void setTimeoutServicio(TimeoutServicio value) {
        this.timeoutServicio = value;
      }

      /**
       * Gets the value of the urlEnvironmentCredit property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getUrlEnvironmentCredit() {
        return urlEnvironmentCredit;
      }

      /**
       * Sets the value of the urlEnvironmentCredit property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setUrlEnvironmentCredit(String value) {
        this.urlEnvironmentCredit = value;
      }

      /**
       * Gets the value of the urlEnvironmentContado property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getUrlEnvironmentContado() {
        return urlEnvironmentContado;
      }

      /**
       * Sets the value of the urlEnvironmentContado property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setUrlEnvironmentContado(String value) {
        this.urlEnvironmentContado = value;
      }

      /**
       * Gets the value of the jks property.
       *
       * @return possible object is {@link Jks }
       *
       */
      public Jks getJks() {
        return jks;
      }

      /**
       * Sets the value of the jks property.
       *
       * @param value allowed object is {@link Jks }
       *
       */
      public void setJks(Jks value) {
        this.jks = value;
      }

      /**
       * Gets the value of the jobenvio property.
       *
       * @return possible object is {@link Jobenvio }
       *
       */
      public Jobenvio getJobenvio() {
        return jobenvio;
      }

      /**
       * Sets the value of the jobenvio property.
       *
       * @param value allowed object is {@link Jobenvio }
       *
       */
      public void setJobenvio(Jobenvio value) {
        this.jobenvio = value;
      }

      /**
       * Gets the value of the ecommerce property.
       *
       * @return possible object is {@link Ecommerce }
       *
       */
      public Ecommerce getEcommerce() {
        return ecommerce;
      }

      /**
       * Sets the value of the ecommerce property.
       *
       * @param value allowed object is {@link Ecommerce }
       *
       */
      public void setEcommerce(Ecommerce value) {
        this.ecommerce = value;
      }

      /**
       * Gets the value of the strikeiron property.
       *
       * @return possible object is {@link Strikeiron }
       *
       */
      public Strikeiron getStrikeiron() {
        return strikeiron;
      }

      /**
       * Sets the value of the strikeiron property.
       *
       * @param value allowed object is {@link Strikeiron }
       *
       */
      public void setStrikeiron(Strikeiron value) {
        this.strikeiron = value;
      }

      /**
       * Gets the value of the proxy property.
       *
       * @return possible object is {@link Proxy }
       *
       */
      public Proxy getProxy() {
        return proxy;
      }

      /**
       * Sets the value of the proxy property.
       *
       * @param value allowed object is {@link Proxy }
       *
       */
      public void setProxy(Proxy value) {
        this.proxy = value;
      }

      /**
       * Gets the value of the accertify property.
       *
       * @return possible object is {@link Accertify }
       *
       */
      public Accertify getAccertify() {
        return accertify;
      }

      /**
       * Sets the value of the accertify property.
       *
       * @param value allowed object is {@link Accertify }
       *
       */
      public void setAccertify(Accertify value) {
        this.accertify = value;
      }

      /**
       * Gets the value of the exacttarget property.
       *
       * @return possible object is {@link Exacttarget }
       *
       */
      public Exacttarget getExacttarget() {
        return exacttarget;
      }

      /**
       * Sets the value of the exacttarget property.
       *
       * @param value allowed object is {@link Exacttarget }
       *
       */
      public void setExacttarget(Exacttarget value) {
        this.exacttarget = value;
      }

      /**
       * Gets the value of the bancoppelConfig property.
       *
       * @return possible object is {@link BancoppelConfig }
       *
       */
      public BancoppelConfig getBancoppelConfig() {
        return bancoppelConfig;
      }

      /**
       * Sets the value of the bancoppelConfig property.
       *
       * @param value allowed object is {@link BancoppelConfig }
       *
       */
      public void setBancoppelConfig(BancoppelConfig value) {
        this.bancoppelConfig = value;
      }

      /**
       * Gets the value of the proveedorCorreoExacttarget property.
       *
       */
      public byte getProveedorCorreoExacttarget() {
        return proveedorCorreoExacttarget;
      }

      /**
       * Sets the value of the proveedorCorreoExacttarget property.
       *
       */
      public void setProveedorCorreoExacttarget(byte value) {
        this.proveedorCorreoExacttarget = value;
      }

      /**
       * Gets the value of the proveedorCorreoEmarsys property.
       *
       */
      public byte getProveedorCorreoEmarsys() {
        return proveedorCorreoEmarsys;
      }

      /**
       * Sets the value of the proveedorCorreoEmarsys property.
       *
       */
      public void setProveedorCorreoEmarsys(byte value) {
        this.proveedorCorreoEmarsys = value;
      }

      /**
       * Gets the value of the nombreEmpresaMemberService property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getNombreEmpresaMemberService() {
        return nombreEmpresaMemberService;
      }

      /**
       * Sets the value of the nombreEmpresaMemberService property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setNombreEmpresaMemberService(String value) {
        this.nombreEmpresaMemberService = value;
      }

      /**
       * Gets the value of the tokenEmpresaMemberService property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getTokenEmpresaMemberService() {
        return tokenEmpresaMemberService;
      }

      /**
       * Sets the value of the tokenEmpresaMemberService property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setTokenEmpresaMemberService(String value) {
        this.tokenEmpresaMemberService = value;
      }

      /**
       * Gets the value of the ecomexperts property.
       *
       * @return possible object is {@link Ecomexperts }
       *
       */
      public Ecomexperts getEcomexperts() {
        return ecomexperts;
      }

      /**
       * Sets the value of the ecomexperts property.
       *
       * @param value allowed object is {@link Ecomexperts }
       *
       */
      public void setEcomexperts(Ecomexperts value) {
        this.ecomexperts = value;
      }

      /**
       * Gets the value of the sliderapp property.
       *
       * @return possible object is {@link Sliderapp }
       *
       */
      public Sliderapp getSliderapp() {
        return sliderapp;
      }

      /**
       * Sets the value of the sliderapp property.
       *
       * @param value allowed object is {@link Sliderapp }
       *
       */
      public void setSliderapp(Sliderapp value) {
        this.sliderapp = value;
      }

      /**
       * Gets the value of the proxyConfig property.
       *
       * @return possible object is {@link ProxyConfig }
       *
       */
      public ProxyConfig getProxyConfig() {
        return proxyConfig;
      }

      /**
       * Sets the value of the proxyConfig property.
       *
       * @param value allowed object is {@link ProxyConfig }
       *
       */
      public void setProxyConfig(ProxyConfig value) {
        this.proxyConfig = value;
      }

      /**
       * Gets the value of the proxycatalogoproductos property.
       *
       */
      public byte getProxycatalogoproductos() {
        return proxycatalogoproductos;
      }

      /**
       * Sets the value of the proxycatalogoproductos property.
       *
       */
      public void setProxycatalogoproductos(byte value) {
        this.proxycatalogoproductos = value;
      }

      /**
       * Gets the value of the ecommSync property.
       *
       * @return possible object is {@link EcommSync }
       *
       */
      public EcommSync getEcommSync() {
        return ecommSync;
      }

      /**
       * Sets the value of the ecommSync property.
       *
       * @param value allowed object is {@link EcommSync }
       *
       */
      public void setEcommSync(EcommSync value) {
        this.ecommSync = value;
      }

      /**
       * Gets the value of the timeoutValidacionCorreosElectronico property.
       *
       */
      public short getTimeoutValidacionCorreosElectronico() {
        return timeoutValidacionCorreosElectronico;
      }

      /**
       * Sets the value of the timeoutValidacionCorreosElectronico property.
       *
       */
      public void setTimeoutValidacionCorreosElectronico(short value) {
        this.timeoutValidacionCorreosElectronico = value;
      }

      /**
       * Gets the value of the basicDataSource property.
       *
       * @return possible object is {@link BasicDataSourceXml }
       *
       */
      public BasicDataSourceXml getBasicDataSource() {
        return basicDataSource;
      }

      /**
       * Sets the value of the basicDataSource property.
       *
       * @param value allowed object is {@link BasicDataSourceXml }
       *
       */
      public void setBasicDataSource(BasicDataSourceXml value) {
        this.basicDataSource = value;
      }

      /**
       * Gets the value of the serverBodegaRopaDisponible property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getServerBodegaRopaDisponible() {
        return serverBodegaRopaDisponible;
      }

      /**
       * Sets the value of the serverBodegaRopaDisponible property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setServerBodegaRopaDisponible(String value) {
        this.serverBodegaRopaDisponible = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setName(String value) {
        this.name = value;
      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="default_proxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"user", "password", "defaultProxy"})
      public static class Accertify {

        @XmlElement(required = true)
        protected String user;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(name = "default_proxy", required = true)
        protected String defaultProxy;

        /**
         * Gets the value of the user property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUser() {
          return user;
        }

        /**
         * Sets the value of the user property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUser(String value) {
          this.user = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

        /**
         * Gets the value of the defaultProxy property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getDefaultProxy() {
          return defaultProxy;
        }

        /**
         * Sets the value of the defaultProxy property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setDefaultProxy(String value) {
          this.defaultProxy = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="ip_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="ip_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="user_pass" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="agent_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="trans_login" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="trans_ccta" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"ipOrigen", "ipDestino", "userName", "userPass", "agentCd",
          "transLogin", "transCcta"})
      public static class BancoppelConfig {

        @XmlElement(name = "ip_origen", required = true)
        protected String ipOrigen;
        @XmlElement(name = "ip_destino", required = true)
        protected String ipDestino;
        @XmlElement(name = "user_name", required = true)
        protected String userName;
        @XmlElement(name = "user_pass", required = true)
        protected String userPass;
        @XmlElement(name = "agent_cd", required = true)
        protected String agentCd;
        @XmlElement(name = "trans_login", required = true)
        protected String transLogin;
        @XmlElement(name = "trans_ccta", required = true)
        protected String transCcta;

        /**
         * Gets the value of the ipOrigen property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIpOrigen() {
          return ipOrigen;
        }

        /**
         * Sets the value of the ipOrigen property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIpOrigen(String value) {
          this.ipOrigen = value;
        }

        /**
         * Gets the value of the ipDestino property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIpDestino() {
          return ipDestino;
        }

        /**
         * Sets the value of the ipDestino property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIpDestino(String value) {
          this.ipDestino = value;
        }

        /**
         * Gets the value of the userName property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserName() {
          return userName;
        }

        /**
         * Sets the value of the userName property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserName(String value) {
          this.userName = value;
        }

        /**
         * Gets the value of the userPass property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUserPass() {
          return userPass;
        }

        /**
         * Sets the value of the userPass property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUserPass(String value) {
          this.userPass = value;
        }

        /**
         * Gets the value of the agentCd property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getAgentCd() {
          return agentCd;
        }

        /**
         * Sets the value of the agentCd property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setAgentCd(String value) {
          this.agentCd = value;
        }

        /**
         * Gets the value of the transLogin property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTransLogin() {
          return transLogin;
        }

        /**
         * Sets the value of the transLogin property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTransLogin(String value) {
          this.transLogin = value;
        }

        /**
         * Gets the value of the transCcta property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTransCcta() {
          return transCcta;
        }

        /**
         * Sets the value of the transCcta property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTransCcta(String value) {
          this.transCcta = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="MinIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="MaxIdle" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="MaxOpenPreparedStatements" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="MaxTotal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "",
          propOrder = {"minIdle", "maxIdle", "maxOpenPreparedStatements", "maxTotal"})
      public static class BasicDataSourceXml {

        @XmlElement(name = "MinIdle")
        protected Integer minIdle;
        @XmlElement(name = "MaxIdle")
        protected Integer maxIdle;
        @XmlElement(name = "MaxOpenPreparedStatements")
        protected Integer maxOpenPreparedStatements;
        @XmlElement(name = "MaxTotal")
        protected Integer maxTotal;

        /**
         * Gets the value of the minIdle property.
         *
         */
        public Integer getMinIdle() {
          return minIdle;
        }

        /**
         * Sets the value of the minIdle property.
         *
         */
        public void setMinIdle(Integer value) {
          this.minIdle = value;
        }

        /**
         * Gets the value of the maxIdle property.
         *
         */
        public Integer getMaxIdle() {
          return maxIdle;
        }

        /**
         * Sets the value of the maxIdle property.
         *
         */
        public void setMaxIdle(Integer value) {
          this.maxIdle = value;
        }

        /**
         * Gets the value of the maxOpenPreparedStatements property.
         *
         */
        public Integer getMaxOpenPreparedStatements() {
          return maxOpenPreparedStatements;
        }

        /**
         * Sets the value of the maxOpenPreparedStatements property.
         *
         */
        public void setMaxOpenPreparedStatements(Integer value) {
          this.maxOpenPreparedStatements = value;
        }

        /**
         * Gets the value of the maxTotal property.
         *
         */
        public Integer getMaxTotal() {
          return maxTotal;
        }

        /**
         * Sets the value of the maxTotal property.
         *
         */
        public void setMaxTotal(Integer value) {
          this.maxTotal = value;
        }


        @Override
        public String toString() {
          return "BasicDataSource [minIdle=" + minIdle + ", maxIdle=" + maxIdle
              + ", maxOpenPreparedStatements=" + maxOpenPreparedStatements + ", maxTotal="
              + maxTotal + "]";
        }
      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="flagCrearCuentaGV" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="flagCrearCuentaNL" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"flagCrearCuentaGV", "flagCrearCuentaNL"})
      public static class CrearCuentas {

        @XmlElement(required = true)
        protected String flagCrearCuentaGV;
        @XmlElement(required = true)
        protected String flagCrearCuentaNL;

        /**
         * Gets the value of the flagCrearCuentaGV property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFlagCrearCuentaGV() {
          return flagCrearCuentaGV;
        }

        /**
         * Sets the value of the flagCrearCuentaGV property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFlagCrearCuentaGV(String value) {
          this.flagCrearCuentaGV = value;
        }

        /**
         * Gets the value of the flagCrearCuentaNL property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFlagCrearCuentaNL() {
          return flagCrearCuentaNL;
        }

        /**
         * Sets the value of the flagCrearCuentaNL property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFlagCrearCuentaNL(String value) {
          this.flagCrearCuentaNL = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="folderMove" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="folderdownload" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="tipoarchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="urlCancelacion" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"server", "port", "user", "password", "folderRead",
          "folderMove", "folderdownload", "tipoarchivo", "urlCancelacion"})
      public static class Ecomexperts {

        @XmlElement(required = true)
        protected String server;
        protected byte port;
        @XmlElement(required = true)
        protected String user;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String folderRead;
        @XmlElement(required = true)
        protected String folderMove;
        @XmlElement(required = true)
        protected String folderdownload;
        @XmlElement(required = true)
        protected String tipoarchivo;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String urlCancelacion;

        /**
         * Gets the value of the server property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getServer() {
          return server;
        }

        /**
         * Sets the value of the server property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setServer(String value) {
          this.server = value;
        }

        /**
         * Gets the value of the port property.
         *
         */
        public byte getPort() {
          return port;
        }

        /**
         * Sets the value of the port property.
         *
         */
        public void setPort(byte value) {
          this.port = value;
        }

        /**
         * Gets the value of the user property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUser() {
          return user;
        }

        /**
         * Sets the value of the user property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUser(String value) {
          this.user = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

        /**
         * Gets the value of the folderRead property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFolderRead() {
          return folderRead;
        }

        /**
         * Sets the value of the folderRead property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFolderRead(String value) {
          this.folderRead = value;
        }

        /**
         * Gets the value of the folderMove property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFolderMove() {
          return folderMove;
        }

        /**
         * Sets the value of the folderMove property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFolderMove(String value) {
          this.folderMove = value;
        }

        /**
         * Gets the value of the folderdownload property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFolderdownload() {
          return folderdownload;
        }

        /**
         * Sets the value of the folderdownload property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFolderdownload(String value) {
          this.folderdownload = value;
        }

        /**
         * Gets the value of the tipoarchivo property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTipoarchivo() {
          return tipoarchivo;
        }

        /**
         * Sets the value of the tipoarchivo property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTipoarchivo(String value) {
          this.tipoarchivo = value;
        }

        /**
         * Gets the value of the urlCancelacion property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUrlCancelacion() {
          return urlCancelacion;
        }

        /**
         * Sets the value of the urlCancelacion property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUrlCancelacion(String value) {
          this.urlCancelacion = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="grant_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="client_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="warehouseid" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="listaprecio" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="listaprecioespecial" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"clientId", "grantType", "clientSecret", "flag",
          "warehouseid", "listaprecio", "listaprecioespecial"})
      public static class EcommSync {

        @XmlElement(name = "client_id", required = true)
        protected String clientId;
        @XmlElement(name = "grant_type", required = true)
        protected String grantType;
        @XmlElement(name = "client_secret", required = true)
        protected String clientSecret;
        protected byte flag;
        @XmlElement(required = true)
        protected String warehouseid;
        @XmlElement(required = true)
        protected String listaprecio;
        @XmlElement(required = true)
        protected String listaprecioespecial;

        /**
         * Gets the value of the clientId property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getClientId() {
          return clientId;
        }

        /**
         * Sets the value of the clientId property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setClientId(String value) {
          this.clientId = value;
        }

        /**
         * Gets the value of the grantType property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getGrantType() {
          return grantType;
        }

        /**
         * Sets the value of the grantType property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setGrantType(String value) {
          this.grantType = value;
        }

        /**
         * Gets the value of the clientSecret property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getClientSecret() {
          return clientSecret;
        }

        /**
         * Sets the value of the clientSecret property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setClientSecret(String value) {
          this.clientSecret = value;
        }

        /**
         * Gets the value of the flag property.
         *
         */
        public byte getFlag() {
          return flag;
        }

        /**
         * Sets the value of the flag property.
         *
         */
        public void setFlag(byte value) {
          this.flag = value;
        }

        /**
         * Gets the value of the warehouseid property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getWarehouseid() {
          return warehouseid;
        }

        /**
         * Sets the value of the warehouseid property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setWarehouseid(String value) {
          this.warehouseid = value;
        }

        /**
         * Gets the value of the listaprecio property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getListaprecio() {
          return listaprecio;
        }

        /**
         * Sets the value of the listaprecio property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setListaprecio(String value) {
          this.listaprecio = value;
        }

        /**
         * Gets the value of the listaprecioespecial property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getListaprecioespecial() {
          return listaprecioespecial;
        }

        /**
         * Sets the value of the listaprecioespecial property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setListaprecioespecial(String value) {
          this.listaprecioespecial = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="storeID" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *         &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"storeID", "langId"})
      public static class Ecommerce {

        protected short storeID;
        protected byte langId;

        /**
         * Gets the value of the storeID property.
         *
         */
        public short getStoreID() {
          return storeID;
        }

        /**
         * Sets the value of the storeID property.
         *
         */
        public void setStoreID(short value) {
          this.storeID = value;
        }

        /**
         * Gets the value of the langId property.
         *
         */
        public byte getLangId() {
          return langId;
        }

        /**
         * Sets the value of the langId property.
         *
         */
        public void setLangId(byte value) {
          this.langId = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"user", "password"})
      public static class Exacttarget {

        @XmlElement(required = true)
        protected String user;
        @XmlElement(required = true)
        protected String password;

        /**
         * Gets the value of the user property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUser() {
          return user;
        }

        /**
         * Sets the value of the user property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUser(String value) {
          this.user = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="keyStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="keyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="trustStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="trustStorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"keyStore", "keyStorePassword", "trustStore",
          "trustStorePassword", "user", "password"})
      public static class Jks {

        @XmlElement(required = true)
        protected String keyStore;
        @XmlElement(required = true)
        protected String keyStorePassword;
        @XmlElement(required = true)
        protected String trustStore;
        @XmlElement(required = true)
        protected String trustStorePassword;
        @XmlElement(required = true)
        protected String user;
        @XmlElement(required = true)
        protected String password;

        /**
         * Gets the value of the keyStore property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getKeyStore() {
          return keyStore;
        }

        /**
         * Sets the value of the keyStore property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setKeyStore(String value) {
          this.keyStore = value;
        }

        /**
         * Gets the value of the keyStorePassword property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getKeyStorePassword() {
          return keyStorePassword;
        }

        /**
         * Sets the value of the keyStorePassword property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setKeyStorePassword(String value) {
          this.keyStorePassword = value;
        }

        /**
         * Gets the value of the trustStore property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTrustStore() {
          return trustStore;
        }

        /**
         * Sets the value of the trustStore property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTrustStore(String value) {
          this.trustStore = value;
        }

        /**
         * Gets the value of the trustStorePassword property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTrustStorePassword() {
          return trustStorePassword;
        }

        /**
         * Sets the value of the trustStorePassword property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTrustStorePassword(String value) {
          this.trustStorePassword = value;
        }

        /**
         * Gets the value of the user property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUser() {
          return user;
        }

        /**
         * Sets the value of the user property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUser(String value) {
          this.user = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="num_hilo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"numHilo"})
      public static class Jobenvio {

        @XmlElement(name = "num_hilo")
        protected byte numHilo;

        /**
         * Gets the value of the numHilo property.
         *
         */
        public byte getNumHilo() {
          return numHilo;
        }

        /**
         * Sets the value of the numHilo property.
         *
         */
        public void setNumHilo(byte value) {
          this.numHilo = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"isProxy", "proxyHost", "proxyPort"})
      public static class Proxy {

        @XmlElement(required = true)
        protected String isProxy;
        @XmlElement(required = true)
        protected String proxyHost;
        @XmlElement(required = true)
        protected String proxyPort;

        /**
         * Gets the value of the isProxy property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIsProxy() {
          return isProxy;
        }

        /**
         * Sets the value of the isProxy property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIsProxy(String value) {
          this.isProxy = value;
        }

        /**
         * Gets the value of the proxyHost property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyHost() {
          return proxyHost;
        }

        /**
         * Sets the value of the proxyHost property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyHost(String value) {
          this.proxyHost = value;
        }

        /**
         * Gets the value of the proxyPort property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyPort() {
          return proxyPort;
        }

        /**
         * Sets the value of the proxyPort property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyPort(String value) {
          this.proxyPort = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="isProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"isProxy", "proxyHost", "proxyPort"})
      public static class ProxyConfig {

        @XmlElement(required = true)
        protected String isProxy;
        @XmlElement(required = true)
        protected String proxyHost;
        protected short proxyPort;

        /**
         * Gets the value of the isProxy property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIsProxy() {
          return isProxy;
        }

        /**
         * Sets the value of the isProxy property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIsProxy(String value) {
          this.isProxy = value;
        }

        /**
         * Gets the value of the proxyHost property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getProxyHost() {
          return proxyHost;
        }

        /**
         * Sets the value of the proxyHost property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setProxyHost(String value) {
          this.proxyHost = value;
        }

        /**
         * Gets the value of the proxyPort property.
         *
         */
        public short getProxyPort() {
          return proxyPort;
        }

        /**
         * Sets the value of the proxyPort property.
         *
         */
        public void setProxyPort(short value) {
          this.proxyPort = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"server", "port", "user", "password", "folderRead"})
      public static class Sliderapp {

        @XmlElement(required = true)
        protected String server;
        protected byte port;
        @XmlElement(required = true)
        protected String user;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String folderRead;

        /**
         * Gets the value of the server property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getServer() {
          return server;
        }

        /**
         * Sets the value of the server property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setServer(String value) {
          this.server = value;
        }

        /**
         * Gets the value of the port property.
         *
         */
        public byte getPort() {
          return port;
        }

        /**
         * Sets the value of the port property.
         *
         */
        public void setPort(byte value) {
          this.port = value;
        }

        /**
         * Gets the value of the user property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUser() {
          return user;
        }

        /**
         * Sets the value of the user property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUser(String value) {
          this.user = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getPassword() {
          return password;
        }

        /**
         * Sets the value of the password property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setPassword(String value) {
          this.password = value;
        }

        /**
         * Gets the value of the folderRead property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFolderRead() {
          return folderRead;
        }

        /**
         * Sets the value of the folderRead property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFolderRead(String value) {
          this.folderRead = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="caracterespermitidos" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="llavepublica" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="llaveprivada" type="{http://www.w3.org/2001/XMLSchema}long"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"caracterespermitidos", "llavepublica", "llaveprivada"})
      public static class Sms {

        protected byte caracterespermitidos;
        @XmlElement(required = true)
        protected String llavepublica;
        protected long llaveprivada;

        /**
         * Gets the value of the caracterespermitidos property.
         *
         */
        public byte getCaracterespermitidos() {
          return caracterespermitidos;
        }

        /**
         * Sets the value of the caracterespermitidos property.
         *
         */
        public void setCaracterespermitidos(byte value) {
          this.caracterespermitidos = value;
        }

        /**
         * Gets the value of the llavepublica property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getLlavepublica() {
          return llavepublica;
        }

        /**
         * Sets the value of the llavepublica property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setLlavepublica(String value) {
          this.llavepublica = value;
        }

        /**
         * Gets the value of the llaveprivada property.
         *
         */
        public long getLlaveprivada() {
          return llaveprivada;
        }

        /**
         * Sets the value of the llaveprivada property.
         *
         */
        public void setLlaveprivada(long value) {
          this.llaveprivada = value;
        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;choice maxOccurs="unbounded" minOccurs="0">
       *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="status">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="v6" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                   &lt;element name="v5" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="sources">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="source">
       *                     &lt;complexType>
       *                       &lt;complexContent>
       *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                           &lt;sequence>
       *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                             &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                           &lt;/sequence>
       *                           &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                         &lt;/restriction>
       *                       &lt;/complexContent>
       *                     &lt;/complexType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="prioridad">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="primera" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="segunda" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="timeoutws" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *       &lt;/choice>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"useridOrPasswordOrTimeout"})
      public static class Strikeiron {

        @XmlElementRefs({
            @XmlElementRef(name = "sources", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "timeoutws", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "prioridad", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "password", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "userid", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "timeout", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "status", type = JAXBElement.class, required = false)})
        protected List<JAXBElement<?>> useridOrPasswordOrTimeout;

        /**
         * Gets the value of the useridOrPasswordOrTimeout property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any
         * modification you make to the returned list will be present inside the JAXB object. This
         * is why there is not a <CODE>set</CODE> method for the useridOrPasswordOrTimeout property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getUseridOrPasswordOrTimeout().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link JAXBElement
         * }{@code <}{@link Sources }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >} {@link JAXBElement
         * }{@code <}{@link Prioridad }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement
         * }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link Byte }{@code >}
         * {@link JAXBElement
         * }{@code <}{@link Status }{@code >}
         *
         *
         */
        public List<JAXBElement<?>> getUseridOrPasswordOrTimeout() {
          if (useridOrPasswordOrTimeout == null) {
            useridOrPasswordOrTimeout = new ArrayList<JAXBElement<?>>();
          }
          return this.useridOrPasswordOrTimeout;
        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="primera" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="segunda" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"primera", "segunda"})
        public static class Prioridad {

          @XmlElement(required = true)
          protected String primera;
          @XmlElement(required = true)
          protected String segunda;

          /**
           * Gets the value of the primera property.
           *
           * @return possible object is {@link String }
           *
           */
          public String getPrimera() {
            return primera;
          }

          /**
           * Sets the value of the primera property.
           *
           * @param value allowed object is {@link String }
           *
           */
          public void setPrimera(String value) {
            this.primera = value;
          }

          /**
           * Gets the value of the segunda property.
           *
           * @return possible object is {@link String }
           *
           */
          public String getSegunda() {
            return segunda;
          }

          /**
           * Sets the value of the segunda property.
           *
           * @param value allowed object is {@link String }
           *
           */
          public void setSegunda(String value) {
            this.segunda = value;
          }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="source">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"source"})
        public static class Sources {

          @XmlElement(required = true)
          protected Source source;

          /**
           * Gets the value of the source property.
           *
           * @return possible object is
           *         {@link Source }
           *
           */
          public Source getSource() {
            return source;
          }

          /**
           * Sets the value of the source property.
           *
           * @param value allowed object is
           *        {@link Source }
           *
           */
          public void setSource(Source value) {
            this.source = value;
          }


          /**
           * <p>
           * Java class for anonymous complex type.
           *
           * <p>
           * The following schema fragment specifies the expected content contained within this
           * class.
           *
           * <pre>
           * &lt;complexType>
           *   &lt;complexContent>
           *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *       &lt;sequence>
           *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
           *         &lt;element name="validar" type="{http://www.w3.org/2001/XMLSchema}string"/>
           *       &lt;/sequence>
           *       &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" />
           *     &lt;/restriction>
           *   &lt;/complexContent>
           * &lt;/complexType>
           * </pre>
           *
           *
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(name = "", propOrder = {"name", "validar"})
          public static class Source {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String validar;
            @XmlAttribute(name = "pais")
            protected String pais;

            /**
             * Gets the value of the name property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getName() {
              return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setName(String value) {
              this.name = value;
            }

            /**
             * Gets the value of the validar property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getValidar() {
              return validar;
            }

            /**
             * Sets the value of the validar property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setValidar(String value) {
              this.validar = value;
            }

            /**
             * Gets the value of the pais property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getPais() {
              return pais;
            }

            /**
             * Sets the value of the pais property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setPais(String value) {
              this.pais = value;
            }

          }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="v6" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="v5" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"v6", "v5"})
        public static class Status {

          protected short v6;
          protected short v5;

          /**
           * Gets the value of the v6 property.
           *
           */
          public short getV6() {
            return v6;
          }

          /**
           * Sets the value of the v6 property.
           *
           */
          public void setV6(short value) {
            this.v6 = value;
          }

          /**
           * Gets the value of the v5 property.
           *
           */
          public short getV5() {
            return v5;
          }

          /**
           * Sets the value of the v5 property.
           *
           */
          public void setV5(short value) {
            this.v5 = value;
          }

        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="ccuenta">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                   &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="memberService">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                   &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="strikeIron">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                   &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"ccuenta", "memberService", "strikeIron"})
      public static class TimeoutServicio {

        @XmlElement(required = true)
        protected Ccuenta ccuenta;
        @XmlElement(required = true)
        protected MemberService memberService;
        @XmlElement(required = true)
        protected StrikeIron strikeIron;

        /**
         * Gets the value of the ccuenta property.
         *
         * @return possible object is {@link Ccuenta }
         *
         */
        public Ccuenta getCcuenta() {
          return ccuenta;
        }

        /**
         * Sets the value of the ccuenta property.
         *
         * @param value allowed object is
         *        {@link Ccuenta }
         *
         */
        public void setCcuenta(Ccuenta value) {
          this.ccuenta = value;
        }

        /**
         * Gets the value of the memberService property.
         *
         * @return possible object is
         *         {@link MemberService }
         *
         */
        public MemberService getMemberService() {
          return memberService;
        }

        /**
         * Sets the value of the memberService property.
         *
         * @param value allowed object is
         *        {@link MemberService }
         *
         */
        public void setMemberService(
            MemberService value) {
          this.memberService = value;
        }

        /**
         * Gets the value of the strikeIron property.
         *
         * @return possible object is {@link StrikeIron }
         *
         */
        public StrikeIron getStrikeIron() {
          return strikeIron;
        }

        /**
         * Sets the value of the strikeIron property.
         *
         * @param value allowed object is
         *        {@link StrikeIron }
         *
         */
        public void setStrikeIron(StrikeIron value) {
          this.strikeIron = value;
        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"timeout", "readTimeout"})
        public static class Ccuenta {

          protected short timeout;
          protected short readTimeout;

          /**
           * Gets the value of the timeout property.
           *
           */
          public short getTimeout() {
            return timeout;
          }

          /**
           * Sets the value of the timeout property.
           *
           */
          public void setTimeout(short value) {
            this.timeout = value;
          }

          /**
           * Gets the value of the readTimeout property.
           *
           */
          public short getReadTimeout() {
            return readTimeout;
          }

          /**
           * Sets the value of the readTimeout property.
           *
           */
          public void setReadTimeout(short value) {
            this.readTimeout = value;
          }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"timeout", "readTimeout"})
        public static class MemberService {

          protected short timeout;
          protected short readTimeout;

          /**
           * Gets the value of the timeout property.
           *
           */
          public short getTimeout() {
            return timeout;
          }

          /**
           * Sets the value of the timeout property.
           *
           */
          public void setTimeout(short value) {
            this.timeout = value;
          }

          /**
           * Gets the value of the readTimeout property.
           *
           */
          public short getReadTimeout() {
            return readTimeout;
          }

          /**
           * Sets the value of the readTimeout property.
           *
           */
          public void setReadTimeout(short value) {
            this.readTimeout = value;
          }

        }


        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="readTimeout" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"timeout", "readTimeout"})
        public static class StrikeIron {

          protected short timeout;
          protected short readTimeout;

          /**
           * Gets the value of the timeout property.
           *
           */
          public short getTimeout() {
            return timeout;
          }

          /**
           * Sets the value of the timeout property.
           *
           */
          public void setTimeout(short value) {
            this.timeout = value;
          }

          /**
           * Gets the value of the readTimeout property.
           *
           */
          public short getReadTimeout() {
            return readTimeout;
          }

          /**
           * Sets the value of the readTimeout property.
           *
           */
          public void setReadTimeout(short value) {
            this.readTimeout = value;
          }

        }

      }


      /**
       * <p>
       * Java class for anonymous complex type.
       *
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"url"})
      public static class UrlRedireccionCat {

        @XmlElement(required = true)
        protected String url;

        /**
         * Gets the value of the url property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getUrl() {
          return url;
        }

        /**
         * Sets the value of the url property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setUrl(String value) {
          this.url = value;
        }

      }

    }

    @Override
    public String toString() {
      return "Clases [clasesOrClase=" + clasesOrClase + "]";
    }
  }


  /**
   * <p>
   * Java class for anonymous complex type.
   *
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="conexion" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="bd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
   *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
   *                   &lt;element name="jdbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   *
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"conexion"})
  public static class Conexiones {

    protected List<Conexion> conexion;

    /**
     * Gets the value of the conexion property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the conexion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getConexion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Conexion }
     *
     *
     */
    public List<Conexion> getConexion() {
      if (conexion == null) {
        conexion = new ArrayList<Conexion>();
      }
      return this.conexion;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jdbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"host", "bd", "port", "user", "password", "timeout", "jdbc"})
    public static class Conexion {

      protected String host;
      protected String bd;
      protected Integer port;
      protected String user;
      protected String password;
      protected Integer timeout;
      protected String jdbc;
      @XmlAttribute(name = "name")
      protected String name;

      /**
       * Gets the value of the host property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getHost() {
        return host;
      }

      /**
       * Sets the value of the host property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setHost(String value) {
        this.host = value;
      }

      /**
       * Gets the value of the bd property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getBd() {
        return bd;
      }

      /**
       * Sets the value of the bd property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setBd(String value) {
        this.bd = value;
      }

      /**
       * Gets the value of the port property.
       *
       * @return possible object is {@link Integer }
       *
       */
      public Integer getPort() {
        return port;
      }

      /**
       * Sets the value of the port property.
       *
       * @param value allowed object is {@link Integer }
       *
       */
      public void setPort(Integer value) {
        this.port = value;
      }

      /**
       * Gets the value of the user property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getUser() {
        return user;
      }

      /**
       * Sets the value of the user property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setUser(String value) {
        this.user = value;
      }

      /**
       * Gets the value of the password property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getPassword() {
        return password;
      }

      /**
       * Sets the value of the password property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setPassword(String value) {
        this.password = value;
      }

      /**
       * Gets the value of the timeout property.
       *
       * @return possible object is {@link Integer }
       *
       */
      public Integer getTimeout() {
        return timeout;
      }

      /**
       * Sets the value of the timeout property.
       *
       * @param value allowed object is {@link Integer }
       *
       */
      public void setTimeout(Integer value) {
        this.timeout = value;
      }

      /**
       * Gets the value of the jdbc property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getJdbc() {
        return jdbc;
      }

      /**
       * Sets the value of the jdbc property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setJdbc(String value) {
        this.jdbc = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setName(String value) {
        this.name = value;
      }


      @Override
      public String toString() {
        return "Conexion [name=" + name + ", host=" + host + ", bd=" + bd + ", port=" + port
            + ", user=" + user + ", password=" + password + ", timeout=" + timeout + ", jdbc="
            + jdbc + "]";
      }
    }

    @Override
    public String toString() {
      return "Conexiones [conexion=" + conexion + "]";
    }
  }


  /**
   * <p>
   * Java class for anonymous complex type.
   *
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="websevice" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   *
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"websevice"})
  public static class WebServices {

    protected List<Websevice> websevice;

    /**
     * Gets the value of the websevice property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the websevice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getWebsevice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Websevice }
     *
     *
     */
    public List<Websevice> getWebsevice() {
      if (websevice == null) {
        websevice = new ArrayList<Websevice>();
      }
      return this.websevice;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"host"})
    public static class Websevice {

      @XmlElement(required = true)
      protected String host;
      @XmlAttribute(name = "name")
      protected String name;

      /**
       * Gets the value of the host property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getHost() {
        return host;
      }

      /**
       * Sets the value of the host property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setHost(String value) {
        this.host = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return possible object is {@link String }
       *
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value allowed object is {@link String }
       *
       */
      public void setName(String value) {
        this.name = value;
      }

    }

  }


  /**
   * <p>
   * Java class for anonymous complex type.
   *
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="xml">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   *
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"xml"})
  public static class Xmls {

    @XmlElement(required = true)
    protected Xml xml;

    /**
     * Gets the value of the xml property.
     *
     * @return possible object is {@link Xml }
     *
     */
    public Xml getXml() {
      return xml;
    }

    /**
     * Sets the value of the xml property.
     *
     * @param value allowed object is {@link Xml }
     *
     */
    public void setXml(Xml value) {
      this.xml = value;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"host"})
    public static class Xml {

      @XmlElement(required = true)
      @XmlSchemaType(name = "anyURI")
      protected String host;
      @XmlAttribute(name = "name")
      protected String name;

      /**
       * Gets the value of the host property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getHost() {
        return host;
      }

      /**
       * Sets the value of the host property.
       * 
       * @param value allowed object is {@link String }
       * 
       */
      public void setHost(String value) {
        this.host = value;
      }

      /**
       * Gets the value of the name property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       * 
       * @param value allowed object is {@link String }
       * 
       */
      public void setName(String value) {
        this.name = value;
      }

    }

  }


  @Override
  public String toString() {
    return "Base [conexiones=" + conexiones + ", clases=" + clases + "]";
  }

}
