package com.AlumnosPortatiles.project.app;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
@ComponentScan("com.AlumnosPortatiles.project")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages = "com.AlumnosPortatiles.project.app.repositories")
public class AppContextConfig {

	
	@Autowired
	private Environment enviroment;
	
	
	@Bean
    public DataSource dataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	
    	dataSource.setDriverClassName(enviroment.getProperty("spring.datasource.driverClassName"));
		dataSource.setUrl(enviroment.getProperty("spring.datasource.url"));
		dataSource.setUsername(enviroment.getProperty("spring.datasource.username"));
		dataSource.setPassword(enviroment.getProperty("spring.datasource.password"));
        
		return dataSource;
    }
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setPackagesToScan(new String[] {
			// Alumno.class.getPackage().getName()
			"com.AlumnosPortatiles.project.app.entities"
	    });
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.POSTGRESQL);
		vendorAdapter.setDatabasePlatform(enviroment.getProperty("hibernate.dialect"));
		vendorAdapter.setGenerateDdl(enviroment.getProperty("hibernate.generateDdl", Boolean.class));
		vendorAdapter.setShowSql(enviroment.getProperty("hibernate.show_sql", Boolean.class));
		entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
		
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", enviroment.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", enviroment.getProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", enviroment.getProperty("hibernate.format_sql"));
        jpaProperties.put("hibernate.dialect", enviroment.getRequiredProperty("hibernate.dialect"));
        jpaProperties.setProperty("hibernate.cache.use_second_level_cache", enviroment.getProperty("hibernate.cache.use_second_level_cache"));
        jpaProperties.setProperty("hibernate.cache.use_query_cache", enviroment.getProperty("hibernate.cache.use_query_cache"));
        entityManagerFactory.setJpaProperties(jpaProperties);
		
		return entityManagerFactory;
	}
	
	
	@Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        
        return transactionManager;
    }
	
}