/* package com.byzthr.hibernate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@ConfigurationProperties(prefix = "hibernate")
//@EnableTransactionManagement
public class HibernateConfig {

    @NonNull
    private final Properties hibernateProperties() {
        Properties hibProperties = new Properties();
        hibProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        hibProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return hibProperties;
    }

    @Bean
    @NonNull
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Drivers");
        dataSource.setUrl("Server=byzthr-ubuntu;Database=cars;Uid=byzthr;Pwd=7072");
        dataSource.setUsername("byzthr");
        dataSource.setPassword("7072");
        return dataSource;
    }

    @Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.byzthr.hibernate.model");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

}
 */