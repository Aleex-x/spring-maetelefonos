package com.coppel.ecommerce.getinfomaetelefonos.config;

import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.ConexionBaseXML;
import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.XmlBase.Clases.InnerClases.BasicDataSourceXml;
import com.coppel.ecommerce.getinfomaetelefonos.config.xmlbase.XmlBase.Conexiones.Conexion;
import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
  private static final String CONN_DB2 = "connCoppelDB2";

  @Value("${datasource.min.idle}")
  private Integer minIdle;

  @Value("${datasource.max.idle}")
  private Integer maxIdle;

  @Value("${datasource.max.total}")
  private Integer maxTotal;

  @Value("${datasource.max.open.prepared.statements}")
  private Integer maxOpenPreparedStatements;

  @Bean
  @Primary
  public DataSource getDataSource() throws Exception {
    Conexion conexion = ConexionBaseXML.getConexionByName(CONN_DB2);
    System.out.println(conexion.toString());
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
    dataSource.setUrl("jdbc:db2://"+conexion.getHost()+":"+conexion.getPort()+"/"+conexion.getBd());
    dataSource.setUsername(conexion.getUser());
    dataSource.setPassword(conexion.getPassword());
    /*
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("com.ibm.db2.jcc.DB2Driver");
    dataSourceBuilder.url(
            "jdbc:db2://"+conexion.getHost()+":"+conexion.getPort()+"/"+conexion.getBd());
    dataSourceBuilder.username(conexion.getUser());*/
    //dataSourceBuilder.password(conexion.getPassword());
    //dataSourceBuilder.url("jdbc:db2://10.28.114.87:60006/coppeldb");
    //dataSourceBuilder.username("DB2INST1");

    BasicDataSourceXml dataSourceConf = ConexionBaseXML.getPoolConfigConexion();

    if (dataSourceConf != null) {
        dataSource.setMinIdle(
                dataSourceConf.getMinIdle() != null ? dataSourceConf.getMinIdle() : minIdle);
        dataSource.setMaxIdle(
                dataSourceConf.getMaxIdle() != null ? dataSourceConf.getMaxIdle() : maxIdle);
        dataSource.setMaxTotal(
                dataSourceConf.getMaxTotal() != null ? dataSourceConf.getMaxTotal() : maxTotal);
        dataSource
                .setMaxOpenPreparedStatements(dataSourceConf.getMaxOpenPreparedStatements() != null
                        ? dataSourceConf.getMaxOpenPreparedStatements()
                        : maxOpenPreparedStatements);
    }

    return dataSource;
  }
}
