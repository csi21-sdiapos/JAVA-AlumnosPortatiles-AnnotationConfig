# Repetición del proyecto de AlumnosPortatiles con Vistas y Anotaciones (sin context.xml)

- [Repetición del proyecto de AlumnosPortatiles con Vistas y Anotaciones (sin context.xml)](#repetición-del-proyecto-de-alumnosportatiles-con-vistas-y-anotaciones-sin-contextxml)
- [0. pom.xml](#0-pomxml)
- [1. src/main/resources --\> application.properties](#1-srcmainresources----applicationproperties)
- [2. webapp](#2-webapp)
	- [2.1. config](#21-config)
		- [header.jsp](#headerjsp)
	- [2.2. css](#22-css)
	- [2.3. js](#23-js)
	- [2.4. META-INF](#24-meta-inf)
	- [2.5. views](#25-views)
	- [2.6. WEB-INF](#26-web-inf)
	- [2.7. index.jsp](#27-indexjsp)
- [3. Project Annotation Configuration](#3-project-annotation-configuration)
	- [3.1. com.AlumnosPortatiles.project --\> ServletInitializerConfig.java](#31-comalumnosportatilesproject----servletinitializerconfigjava)
	- [3.2. com.AlumnosPortatiles.project.app --\> AppContextConfig.java](#32-comalumnosportatilesprojectapp----appcontextconfigjava)
	- [3.3. com.AlumnosPortatiles.project.web --\> WebContextConfig.java](#33-comalumnosportatilesprojectweb----webcontextconfigjava)
- [4. Entities](#4-entities)
	- [4.1. com.AlumnosPortatiles.project.app.entities --\> Alumno.java](#41-comalumnosportatilesprojectappentities----alumnojava)
	- [4.2. com.AlumnosPortatiles.project.app.entities --\> Portatil.java](#42-comalumnosportatilesprojectappentities----portatiljava)
- [5. Repositories](#5-repositories)
	- [5.1. Interfaces](#51-interfaces)
		- [5.1.1. com.AlumnosPortatiles.project.app.repositories.interfaces --\> IAlumnoRepository.java](#511-comalumnosportatilesprojectapprepositoriesinterfaces----ialumnorepositoryjava)
		- [5.1.2. com.AlumnosPortatiles.project.app.repositories.interfaces --\> IPortatilRepository.java](#512-comalumnosportatilesprojectapprepositoriesinterfaces----iportatilrepositoryjava)
	- [5.2. Implementations](#52-implementations)
- [6. DTO](#6-dto)
	- [6.1. Models](#61-models)
		- [6.1.1. com.AlumnosPortatiles.project.web.dto.models --\> AlumnoDTO.java](#611-comalumnosportatilesprojectwebdtomodels----alumnodtojava)
		- [6.1.2. com.AlumnosPortatiles.project.web.dto.models --\> PortatilDTO.java](#612-comalumnosportatilesprojectwebdtomodels----portatildtojava)
	- [6.2. Interfaces](#62-interfaces)
		- [6.2.1. com.AlumnosPortatiles.project.web.dto.interfaces --\> IAlumnoToDTO.java](#621-comalumnosportatilesprojectwebdtointerfaces----ialumnotodtojava)
		- [6.2.2. com.AlumnosPortatiles.project.web.dto.interfaces --\> IAlumnoToDAO.java](#622-comalumnosportatilesprojectwebdtointerfaces----ialumnotodaojava)
		- [6.2.3. com.AlumnosPortatiles.project.web.dto.interfaces --\> IPortatilToDTO.java](#623-comalumnosportatilesprojectwebdtointerfaces----iportatiltodtojava)
		- [6.2.4. com.AlumnosPortatiles.project.web.dto.interfaces --\> IPortatilToDAO.java](#624-comalumnosportatilesprojectwebdtointerfaces----iportatiltodaojava)
	- [6.3. Implementations](#63-implementations)
		- [6.3.1. com.AlumnosPortatiles.project.web.dto.implementations --\> AlumnoToDTOimpl.java](#631-comalumnosportatilesprojectwebdtoimplementations----alumnotodtoimpljava)
		- [6.3.2. com.AlumnosPortatiles.project.web.dto.implemenations --\> AlumnoToDAOimpl.java](#632-comalumnosportatilesprojectwebdtoimplemenations----alumnotodaoimpljava)
		- [6.3.3. com.AlumnosPortatiles.project.web.dto.implemenations --\> PortatilToDTOimpl.java](#633-comalumnosportatilesprojectwebdtoimplemenations----portatiltodtoimpljava)
		- [6.3.4. com.AlumnosPortatiles.project.web.dto.implemenations --\> PortatilToDAOimpl.java](#634-comalumnosportatilesprojectwebdtoimplemenations----portatiltodaoimpljava)
- [7. Services](#7-services)
	- [7.1. Interfaces](#71-interfaces)
		- [7.1.1. com.AlumnosPortatiles.project.web.services.interfaces --\> IAlumnoService.java](#711-comalumnosportatilesprojectwebservicesinterfaces----ialumnoservicejava)
		- [7.1.2. com.AlumnosPortatiles.project.web.services.interfaces --\> IPortatilService.java](#712-comalumnosportatilesprojectwebservicesinterfaces----iportatilservicejava)
	- [7.2. Implementations](#72-implementations)
		- [7.2.1. com.AlumnosPortatiles.project.web.services.implementations --\> AlumnoServiceImpl.java](#721-comalumnosportatilesprojectwebservicesimplementations----alumnoserviceimpljava)
		- [7.2.2. com.AlumnosPortatiles.project.web.services.implementations --\> PortatilServiceImpl.java](#722-comalumnosportatilesprojectwebservicesimplementations----portatilserviceimpljava)
- [8. Controllers and Views](#8-controllers-and-views)
	- [8.1. Index](#81-index)
		- [8.1.1. com.AlumnosPortatiles.project.web.controllers.interfaces --\> IIndexController.java](#811-comalumnosportatilesprojectwebcontrollersinterfaces----iindexcontrollerjava)
		- [8.1.2. com.AlumnosPortatiles.project.web.controllers.implementations --\> IndexControllerImpl.java](#812-comalumnosportatilesprojectwebcontrollersimplementations----indexcontrollerimpljava)
		- [8.1.3. webapp --\> index.jsp](#813-webapp----indexjsp)
	- [8.2. Portátiles](#82-portátiles)
		- [8.2.1. com.AlumnosPortatiles.project.web.controllers.interfaces --\> IPortatilesController.java](#821-comalumnosportatilesprojectwebcontrollersinterfaces----iportatilescontrollerjava)
		- [8.2.2. com.AlumnosPortatiles.project.web.controllers.implementations --\> PortatilesControllerImpl.java](#822-comalumnosportatilesprojectwebcontrollersimplementations----portatilescontrollerimpljava)
		- [8.2.3. webapp/views/ --\> portatiles.jsp](#823-webappviews----portatilesjsp)
	- [8.3. Alumnos](#83-alumnos)
		- [8.3.1. com.AlumnosPortatiles.project.web.controllers.interfaces --\> IAlumnosController.java](#831-comalumnosportatilesprojectwebcontrollersinterfaces----ialumnoscontrollerjava)
		- [8.3.2. com.AlumnosPortatiles.project.web.controllers.implementations --\> AlumnosControllerImpl.java](#832-comalumnosportatilesprojectwebcontrollersimplementations----alumnoscontrollerimpljava)
		- [8.3.3. webapp/views/ --\> alumnos.jsp](#833-webappviews----alumnosjsp)
	- [8.4. Create Form Portátiles](#84-create-form-portátiles)
		- [8.4.1. com.AlumnosPortatiles.project.web.controllers.interfaces --\> ICreateFormPortatilController.java](#841-comalumnosportatilesprojectwebcontrollersinterfaces----icreateformportatilcontrollerjava)
		- [8.4.2. com.AlumnosPortatiles.project.web.controllers.implementations --\> CreateFormPortatilControllerImpl.java](#842-comalumnosportatilesprojectwebcontrollersimplementations----createformportatilcontrollerimpljava)
		- [8.4.3. webapp/views/ --\> createFormPortatil.jsp](#843-webappviews----createformportatiljsp)
	- [8.5. Create Form Alumnos](#85-create-form-alumnos)
		- [8.5.1. com.AlumnosPortatiles.project.web.controllers.interfaces --\> ICreateFormAlumnoController.java](#851-comalumnosportatilesprojectwebcontrollersinterfaces----icreateformalumnocontrollerjava)
		- [8.5.2. com.AlumnosPortatiles.project.web.controllers.implementations --\> CreateFormAlumnoControllerImpl.java](#852-comalumnosportatilesprojectwebcontrollersimplementations----createformalumnocontrollerimpljava)
		- [8.5.3. webapp/views/ --\> createFormAlumno.jsp](#853-webappviews----createformalumnojsp)
- [Pruebas de Ejecución](#pruebas-de-ejecución)
	- [Prueba de ejecución 1 --\> Conexión icicial con la BBDD autocreando las tablas](#prueba-de-ejecución-1----conexión-icicial-con-la-bbdd-autocreando-las-tablas)
	- [Prueba de ejecución 2 --\> Probando el insert de Portatil (.save()) y el select de Portatil (.findAll())](#prueba-de-ejecución-2----probando-el-insert-de-portatil-save-y-el-select-de-portatil-findall)
	- [Prueba de ejecución 3 --\> Probando el delete de Portatil](#prueba-de-ejecución-3----probando-el-delete-de-portatil)
	- [Prueba de ejecución 4 --\> Probando el insert de Alumno asignando un portátil](#prueba-de-ejecución-4----probando-el-insert-de-alumno-asignando-un-portátil)
	- [Prueba de ejecución 5 --\> Probando el delete de Alumno](#prueba-de-ejecución-5----probando-el-delete-de-alumno)
	- [Prueba de ejecución 6 --\> Probando la funcionalidad de buscar un portátil por el ID de un alumno, y viceversa](#prueba-de-ejecución-6----probando-la-funcionalidad-de-buscar-un-portátil-por-el-id-de-un-alumno-y-viceversa)
- [Webgrafía](#webgrafía)
	- [⭐ Guía completa de ejemplo de proyecto web de Spring MVC paso a paso (parte 5)](#-guía-completa-de-ejemplo-de-proyecto-web-de-spring-mvc-paso-a-paso-parte-5)
	- [⭐ Spring Data JPA Tutorial: Annotation Configuration](#-spring-data-jpa-tutorial-annotation-configuration)
	- [⭐ Spring MVC 5 + Spring Data JPA + Hibernate 5 + JSP (Tutorial)](#-spring-mvc-5--spring-data-jpa--hibernate-5--jsp-tutorial)
	- [⭐ Database and JPA Configuration without persistence.xml using JavaConfig](#-database-and-jpa-configuration-without-persistencexml-using-javaconfig)
	- [Simplified Web Configuration with Spring MVC](#simplified-web-configuration-with-spring-mvc)
	- [Spring MVC annotation config example with JavaConfig](#spring-mvc-annotation-config-example-with-javaconfig)
	- [Pragmatically Spring MVC example without using XML](#pragmatically-spring-mvc-example-without-using-xml)
	- [How to Access EntityManager with Spring Data](#how-to-access-entitymanager-with-spring-data)
	- [JPA/Hibernate Persistence Context](#jpahibernate-persistence-context)
	- [CrudRepository Example](#crudrepository-example)
	- [JpaRepository Example (es lo mismo que el CrudRepository pero lo he visto más en SpringBoot)](#jparepository-example-es-lo-mismo-que-el-crudrepository-pero-lo-he-visto-más-en-springboot)
	- [Curiosidad extra: Cómo declarar e inicializar EntityManager sin contexto.xml](#curiosidad-extra-cómo-declarar-e-inicializar-entitymanager-sin-contextoxml)
- [Errores](#errores)
	- [org.springframework.web.context.ContextLoaderListener](#orgspringframeworkwebcontextcontextloaderlistener)
		- [Explicación y Solución --\> Opción 1](#explicación-y-solución----opción-1)
		- [Explicación y Solución --\> Opción 2](#explicación-y-solución----opción-2)


# 0. pom.xml

```xml
<properties>
    <failOnMissingWebXml>false</failOnMissingWebXml>
  	<java-version>18</java-version>
    <maven.compiler.source>18</maven.compiler.source>
    <maven.compiler.target>18</maven.compiler.target>
  	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  	<postgresql.connector.version>42.5.1</postgresql.connector.version>
  	<org.springframework.version>5.0.6.RELEASE</org.springframework.version>
	<org.springframework.data.version>2.0.7.RELEASE</org.springframework.data.version>
  	<hibernate.version>5.2.17.Final</hibernate.version>
<!--<hibernate.validator>5.4.1.Final</hibernate.validator>-->
  	<jsp.version>2.3.3</jsp.version>
  	<jstl.version>1.2.1</jstl.version>
  	<tld.version>1.2.5</tld.version>
  	<servlets.version>4.0.1</servlets.version>
  </properties>
  
  <dependencies>
    <!-- ********************************* Spring Framework ************************************* -->
  	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-core</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>

	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context-support</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>
		
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-beans</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>
<!--
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-web</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>
-->	
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-webmvc</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>

	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-jdbc</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>
	
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>

	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-orm</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>
	
	<dependency>
	    <groupId>org.springframework.data</groupId>
	    <artifactId>spring-data-jpa</artifactId>
	    <version>${org.springframework.data.version}</version>
	</dependency>
	
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-test</artifactId>
	    <version>${org.springframework.version}</version>
	    <scope>test</scope>
	</dependency>
  	
  	<!-- ********************************* JUnit ************************************* -->
  	<dependency>
  		<groupId>junit</groupId>
  		<artifactId>junit</artifactId>
  		<version>4.12</version>
  		<scope>test</scope>
  	</dependency>
  	
  	<!-- ********************************* Javax ************************************* -->
  	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>javax.servlet-api</artifactId> <!-- This artifact was moved to: jakarta.servlet » jakarta.servlet-api -->
	    <version>${servlets.version}</version>
	    <scope>provided</scope>
	</dependency>
	
	<dependency>
     	<groupId>javax.servlet.jsp</groupId>
        <artifactId>javax.servlet.jsp-api</artifactId>
        <version>${jsp.version}</version>
        <scope>provided</scope>
    </dependency>
    
    <dependency>
  		<groupId>javax.servlet.jsp.jstl</groupId>
  		<artifactId>javax.servlet.jsp.jstl-api</artifactId>
  		<version>${jstl.version}</version>
  	</dependency>

	<dependency>
	    <groupId>javax.xml.bind</groupId>
	    <artifactId>jaxb-api</artifactId>
	    <version>2.3.1</version>
	</dependency>

	<dependency>
	    <groupId>org.javassist</groupId>
	    <artifactId>javassist</artifactId>
	    <version>3.29.2-GA</version>
	</dependency>

	<dependency>
	    <groupId>javax.persistence</groupId>
	    <artifactId>javax.persistence-api</artifactId>
	    <version>2.2</version>
	</dependency>
  	
  	<!-- ********************************* PostgreSQL ************************************* -->
	<dependency>
	    <groupId>org.postgresql</groupId>
	    <artifactId>postgresql</artifactId>
	    <version>42.5.1</version>
	</dependency>
	
	<!-- ********************************* Hibernate ************************************* -->
	<dependency>
	    <groupId>org.hibernate</groupId>
	    <artifactId>hibernate-core</artifactId>
	    <version>${hibernate.version}</version>
	</dependency>
		
	<dependency>
	    <groupId>org.hibernate</groupId>
	    <artifactId>hibernate-entitymanager</artifactId>
	    <version>${hibernate.version}</version>
	</dependency>
<!--	
	<dependency>
       	<groupId>org.hibernate</groupId>
        <artifactId>hibernate-validator</artifactId>
        <version>${hibernate.validator}</version>
    </dependency>
-->
  	<!-- ********************************* TagLibs ************************************* -->
  	<dependency>
  		<groupId>org.apache.taglibs</groupId>
  		<artifactId>taglibs-standard-impl</artifactId>
  		<version>${tld.version}</version>
  	</dependency>
  	
  	<!-- ********************************* MapStruct ************************************* -->
	<dependency>
	    <groupId>org.mapstruct</groupId>
	    <artifactId>mapstruct</artifactId>
	    <version>1.5.3.Final</version>
	</dependency>
	
	<dependency>
	    <groupId>org.mapstruct</groupId>
	    <artifactId>mapstruct-processor</artifactId>
	    <version>1.5.3.Final</version>
	</dependency>
  </dependencies>
  
  <build>
  	<testSourceDirectory>src/java/test</testSourceDirectory>
  	
    <pluginManagement>
  		<plugins>
	  		<plugin>
		    	<artifactId>maven-clean-plugin</artifactId>
		        <version>3.2.0</version>
		 	</plugin>
		      
	        <plugin>
		        <groupId>org.apache.maven.plugins</groupId>
		        <artifactId>maven-war-plugin</artifactId>
		        <version>3.3.2</version>
		        <configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
		    </plugin>
	        
	        <plugin>
		        <groupId>org.apache.maven.plugins</groupId>
		        <artifactId>maven-compiler-plugin</artifactId>
		        <version>3.10.1</version>
		        <configuration>
		        	<source>18</source>
		          	<target>18</target>
		          
		          	<annotationProcessorPaths>
	                	<path>
	                    	<groupId>org.mapstruct</groupId>
						    <artifactId>mapstruct-processor</artifactId>
						    <version>1.5.3.Final</version>
	                	</path>
	            	</annotationProcessorPaths>
		        </configuration>
			</plugin>
		      
		    <plugin>
		    	<groupId>org.apache.maven.plugins</groupId>
		        <artifactId>maven-surefire-plugin</artifactId>
		        <version>3.0.0-M7</version>
		    </plugin>
		      
		    <plugin>
	        	<artifactId>maven-install-plugin</artifactId>
	          	<version>3.0.1</version>
	        </plugin>
	        
	        <plugin>
	          <artifactId>maven-deploy-plugin</artifactId>
	          <version>3.0.0</version>
	        </plugin>
	    </plugins>
  	</pluginManagement>
    
    <finalName>AlumnosPortatiles-AnnotationConfig</finalName>
  </build>
```

# 1. src/main/resources --> application.properties

```properties
# https://docs.spring.io/spring-boot/docs/1.1.1.RELEASE/reference/html/common-application-properties.html

####################################### ProjectConfig #######################################
spring.mvc.view.prefix=/views/
spring.mvc.view.suffix=.jsp
spring.mvc.static-path-pattern=/resources/**
# server.port=


####################################### DataBase #######################################
spring.datasource.url=jdbc:postgresql://localhost/AlumnosVistas
spring.datasource.username=postgres
spring.datasource.password=12345
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.initialize=true


####################################### JPA #######################################
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.data.jpa.repositories.enabled=true


####################################### HIBERNATE #######################################
hibernate.show_sql=false
hibernate.format_sql=true
hibernate.generateDdl =true
hibernate.hbm2ddl.auto=update
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
hibernate.cache.use_second_level_cache=false
hibernate.cache.use_query_cache=false
```

# 2. webapp

## 2.1. config

### header.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page session="false" %>
<%@ page isELIgnored = "false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" /></script>

<!-- 
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
 -->
```

## 2.2. css
## 2.3. js
## 2.4. META-INF
## 2.5. views
## 2.6. WEB-INF
## 2.7. index.jsp

# 3. Project Annotation Configuration

## 3.1. com.AlumnosPortatiles.project --> ServletInitializerConfig.java

```java
public class ServletInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AppContextConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebContextConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}	
}
```

## 3.2. com.AlumnosPortatiles.project.app --> AppContextConfig.java

```java
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
```

## 3.3. com.AlumnosPortatiles.project.web --> WebContextConfig.java

```java
@Configuration
@ComponentScan
@EnableWebMvc
public class WebContextConfig {

	@Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        
        internalResourceViewResolver.setPrefix("/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        
        return internalResourceViewResolver;
    }	
}
```

# 4. Entities

## 4.1. com.AlumnosPortatiles.project.app.entities --> Alumno.java

```java
@Entity(name = "Alumno")
@Table(name = "alumno", schema = "alumnos_portatiles")
public class Alumno implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	/******************************************* ATRIBUTOS *********************************************/
	@Column(table = "alumno", name = "alumno_uuid", insertable = true, updatable = true, unique = false, nullable = false)
	private UUID alumno_uuid;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(table = "alumno", name = "alumno_date", insertable = true, updatable = true, unique = false, nullable = false)
	private Calendar alumno_date;
	
	@Id
	@Column(table = "alumno", name = "alumno_id", insertable = false, updatable = false, unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long alumno_id;
	
	@Column(table = "alumno", name = "alumno_nombre", insertable = true, updatable = true, unique = false, nullable = false)
	private String alumno_nombre;
	
	@Column(table = "alumno", name = "alumno_apellidos", insertable = true, updatable = true, unique = false, nullable = false)
	private String alumno_apellidos;
	
	@Column(table = "alumno", name = "alumno_telefono", insertable = true, updatable = true, unique = true, nullable = false)
	private String alumno_telefono;
	
	/******************************************* RELACIONES *********************************************/
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, orphanRemoval = false, optional = true)
	@JoinColumn(table = "alumno", name = "portatil_id", referencedColumnName = "portatil_id", foreignKey = @ForeignKey(name = "fk_portatil_id"), insertable = true, updatable = true, unique = false, nullable = true)
	private Portatil portatil;

	...
}
```

## 4.2. com.AlumnosPortatiles.project.app.entities --> Portatil.java

```java
@Entity(name = "Portatil")
@Table(name = "portatil", schema = "alumnos_portatiles")
public class Portatil implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	/******************************************* ATRIBUTOS *********************************************/
	@Column(table = "portatil", name = "portatil_uuid", insertable = true, updatable = true, unique = false, nullable = false)
	private UUID portatil_uuid;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(table = "portatil", name = "portatil_date", insertable = true, updatable = true, unique = false, nullable = false)
	private Calendar portatil_date;
	
	@Id
	@Column(table = "portatil", name = "portatil_id", insertable = false, updatable = false, unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portatil_id;
	
	@Column(table = "portatil", name = "portatil_marca", insertable = true, updatable = true, unique = false, nullable = false)
	private String portatil_marca;
	
	@Column(table = "portatil", name = "portatil_modelo", insertable = true, updatable = true, unique = false, nullable = false)
	private String portatil_modelo;
	
	/******************************************* RELACIONES *********************************************/
	@OneToOne(mappedBy = "portatil", targetEntity = Alumno.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER, orphanRemoval = false, optional = true)
	private Alumno alumno;

	...
}
```

# 5. Repositories

## 5.1. Interfaces

### 5.1.1. com.AlumnosPortatiles.project.app.repositories.interfaces --> IAlumnoRepository.java

```java
@Repository(value = "IAlumnoRepository")
public interface IAlumnoRepository extends CrudRepository<Alumno, Long> {
	
}
```

### 5.1.2. com.AlumnosPortatiles.project.app.repositories.interfaces --> IPortatilRepository.java

```java
@Repository(value = "IPortatilRepository")
public interface IPortatilRepository extends CrudRepository<Portatil, Long> {

}
```

## 5.2. Implementations

No tenemos que hacer ninguna implementación porque, a parte de que sin contexto.xml no puedo contruir en EntityManagerFactory, para luego usar en un servicio los métodos de CrudRepository tan sólo tendría que instanciar a la interfaz del repositorio con @Autowired.

# 6. DTO

## 6.1. Models

### 6.1.1. com.AlumnosPortatiles.project.web.dto.models --> AlumnoDTO.java

```java
@Component(value = "AlumnoDTO")
public class AlumnoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/******************************************* ATRIBUTOS *********************************************/
	private UUID alumno_uuid;
	private Calendar alumno_date;
	private long alumno_id;
	private String alumno_nombre;
	private String alumno_apellidos;
	private String alumno_telefono;
	private long portatil_id;	// este campo extra será para obtener de la vista el número de portatil_id que introduzca el usuario para buscar y asignar un portatil en la creación de un alumno

	
	/******************************************* RELACIONES *********************************************/
	private Portatil portatil;

	...
}
```

### 6.1.2. com.AlumnosPortatiles.project.web.dto.models --> PortatilDTO.java

```java
@Component(value = "PortatilDTO")
public class PortatilDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/******************************************* ATRIBUTOS *********************************************/
	private UUID portatil_uuid;
	private Calendar portatil_date;
	private long portatil_id;
	private String portatil_marca;
	private String portatil_modelo;
	
	/******************************************* RELACIONES *********************************************/
	private Alumno alumno;

	...
}
```

## 6.2. Interfaces

### 6.2.1. com.AlumnosPortatiles.project.web.dto.interfaces --> IAlumnoToDTO.java

```java
public interface IAlumnoToDTO {

	/**
	 * To alumno DTO.
	 *
	 * @param AlumnoDAO the alumno DAO
	 * @return the alumno DTO
	 * @throws Exception the exception
	 */
	public AlumnoDTO toAlumnoDTO(Alumno AlumnoDAO) throws Exception;
	
	/**
	 * To list alumno DTO.
	 *
	 * @param listAlumnoDAO the list alumno DAO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<AlumnoDTO> toListAlumnoDTO(List<Alumno> listAlumnoDAO) throws Exception;	
}
```

### 6.2.2. com.AlumnosPortatiles.project.web.dto.interfaces --> IAlumnoToDAO.java

```java
public interface IAlumnoToDAO {

	/**
	 * To alumno DAO.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @return the alumno
	 * @throws Exception the exception
	 */
	public Alumno toAlumnoDAO(AlumnoDTO alumnoDTO) throws Exception;
	
	/**
	 * To list alumno DAO.
	 *
	 * @param listAlumnoDTO the list alumno DTO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Alumno> toListAlumnoDAO(List<AlumnoDTO> listAlumnoDTO) throws Exception;	
}
```

### 6.2.3. com.AlumnosPortatiles.project.web.dto.interfaces --> IPortatilToDTO.java

```java
public interface IPortatilToDTO {

	/**
	 * To portatil DTO.
	 *
	 * @param portatilDAO the portatil DAO
	 * @return the portatil DTO
	 * @throws Exception the exception
	 */
	public PortatilDTO toPortatilDTO(Portatil portatilDAO) throws Exception;	
	
	/**
	 * To list portatil DTO.
	 *
	 * @param listPortatilDAO the list portatil DAO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<PortatilDTO> toListPortatilDTO(List<Portatil> listPortatilDAO) throws Exception;	
}
```

### 6.2.4. com.AlumnosPortatiles.project.web.dto.interfaces --> IPortatilToDAO.java

```java
public interface IPortatilToDAO {
	
	/**
	 * To portatil DAO.
	 *
	 * @param portatilDTO the portatil DTO
	 * @return the portatil
	 * @throws Exception the exception
	 */
	public Portatil toPortatilDAO(PortatilDTO portatilDTO) throws Exception;
	
	/**
	 * To list portatil DAO.
	 *
	 * @param listPortatilDTO the list portatil DTO
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Portatil> toListPortatilDAO(List<PortatilDTO> listPortatilDTO) throws Exception;	
}
```

## 6.3. Implementations

### 6.3.1. com.AlumnosPortatiles.project.web.dto.implementations --> AlumnoToDTOimpl.java

```java
@Service(value = "AlumnoToDTOimpl")
public class AlumnoToDTOimpl implements IAlumnoToDTO {
	
	@Override
	public AlumnoDTO toAlumnoDTO(Alumno AlumnoDAO) throws Exception {
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		
		try {
			alumnoDTO.setAlumno_uuid(AlumnoDAO.getAlumno_uuid());
			alumnoDTO.setAlumno_date(AlumnoDAO.getAlumno_date());
			alumnoDTO.setAlumno_id(AlumnoDAO.getAlumno_id());
			alumnoDTO.setAlumno_nombre(AlumnoDAO.getAlumno_nombre());
			alumnoDTO.setAlumno_apellidos(AlumnoDAO.getAlumno_apellidos());
			alumnoDTO.setAlumno_telefono(AlumnoDAO.getAlumno_telefono());
			alumnoDTO.setPortatil(AlumnoDAO.getPortatil());
			return alumnoDTO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir el alumnoDAO a alumnoDTO (return null): " + e);
			return null;
		}
	}

	@Override
	public List<AlumnoDTO> toListAlumnoDTO(List<Alumno> listAlumnoDAO) throws Exception {
		List<AlumnoDTO> listAlumnoDTO = new ArrayList<>();
		
		try {
			for (Alumno alumnoDAO : listAlumnoDAO) {
				listAlumnoDTO.add(toAlumnoDTO(alumnoDAO));
			}
			return listAlumnoDTO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir la listAlumnoDAO a listAlumnoDTO (return null): " + e);
			return null;
		}
	}
}
```

### 6.3.2. com.AlumnosPortatiles.project.web.dto.implemenations --> AlumnoToDAOimpl.java

```java
@Service(value = "AlumnoToDAOimpl")
public class AlumnoToDAOimpl implements IAlumnoToDAO {
	
	@Override
	public Alumno toAlumnoDAO(AlumnoDTO alumnoDTO) throws Exception {
		Alumno alumnoDAO = new Alumno();
		
		try {
			alumnoDAO.setAlumno_uuid(alumnoDTO.getAlumno_uuid());
			alumnoDAO.setAlumno_date(alumnoDTO.getAlumno_date());
			alumnoDAO.setAlumno_id(alumnoDTO.getAlumno_id());
			alumnoDAO.setAlumno_nombre(alumnoDTO.getAlumno_nombre());
			alumnoDAO.setAlumno_apellidos(alumnoDTO.getAlumno_apellidos());
			alumnoDAO.setAlumno_telefono(alumnoDTO.getAlumno_telefono());
			alumnoDAO.setPortatil(alumnoDTO.getPortatil());
			return alumnoDAO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir el alumnoDTO a alumnoDAO (return null): " + e);
			return null;
		}
	}

	@Override
	public List<Alumno> toListAlumnoDAO(List<AlumnoDTO> listAlumnoDTO) throws Exception {
		List<Alumno> listAlumnoDAO = new ArrayList<>();
		
		try {
			for (AlumnoDTO alumnoDTO : listAlumnoDTO) {
				listAlumnoDAO.add(toAlumnoDAO(alumnoDTO));
			}
			return listAlumnoDAO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir la listAlumnoDTO a listAlumnoDAO (return null): " + e);
			return null;
		}
	}
}
```

### 6.3.3. com.AlumnosPortatiles.project.web.dto.implemenations --> PortatilToDTOimpl.java

```java
@Service(value = "PortatilToDTOimpl")
public class PortatilToDTOimpl implements IPortatilToDTO {

	@Override
	public PortatilDTO toPortatilDTO(Portatil portatilDAO) throws Exception {
		PortatilDTO portatilDTO = new PortatilDTO();
		
		try {
			portatilDTO.setPortatil_uuid(portatilDAO.getPortatil_uuid());
			portatilDTO.setPortatil_date(portatilDAO.getPortatil_date());
			portatilDTO.setPortatil_id(portatilDAO.getPortatil_id());
			portatilDTO.setPortatil_marca(portatilDAO.getPortatil_marca());
			portatilDTO.setPortatil_modelo(portatilDAO.getPortatil_modelo());
			portatilDTO.setAlumno(portatilDAO.getAlumno());
			return portatilDTO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir el portatilDAO a portatilDTO (return null): " + e);
			return null;
		}
	}	
	
	@Override
	public List<PortatilDTO> toListPortatilDTO(List<Portatil> listPortatilDAO) throws Exception {
		List<PortatilDTO> listPortatilDTO = new ArrayList<>();
		
		try {
			for (Portatil portatilDAO : listPortatilDAO) {
				listPortatilDTO.add(toPortatilDTO(portatilDAO));
			}
			return listPortatilDTO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir la listAlumnoDAO a listAlumnoDTO (return null): " + e);
			return null;
		}
	}
}
```

### 6.3.4. com.AlumnosPortatiles.project.web.dto.implemenations --> PortatilToDAOimpl.java

```java
@Service(value = "PortatilToDAOimpl")
public class PortatilToDAOimpl implements IPortatilToDAO {
	
	@Override
	public Portatil toPortatilDAO(PortatilDTO portatilDTO) throws Exception {
		Portatil portatilDAO = new Portatil();
		
		try {
			portatilDAO.setPortatil_uuid(portatilDTO.getPortatil_uuid());
			portatilDAO.setPortatil_date(portatilDTO.getPortatil_date());
			portatilDAO.setPortatil_id(portatilDTO.getPortatil_id());
			portatilDAO.setPortatil_marca(portatilDTO.getPortatil_marca());
			portatilDAO.setPortatil_modelo(portatilDTO.getPortatil_modelo());
			portatilDAO.setAlumno(portatilDTO.getAlumno());
			return portatilDAO;
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir el portatilDTO a portatilDAO (return null): " + e);
			return null;
		}
	}

	@Override
	public List<Portatil> toListPortatilDAO(List<PortatilDTO> listPortatilDTO) throws Exception {
		List<Portatil> listPortatilDAO = new ArrayList<>();
		
		try {
			for (PortatilDTO portatilDTO : listPortatilDTO) {
				listPortatilDAO.add(toPortatilDAO(portatilDTO));
			}
			return listPortatilDAO;
		
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al convertir la listAlumnoDTO a listAlumnoDAO (return null): " + e);
			return null;
		}
	}
}
```

# 7. Services

## 7.1. Interfaces

### 7.1.1. com.AlumnosPortatiles.project.web.services.interfaces --> IAlumnoService.java

```java
public interface IAlumnoService {

	/**
	 * Listar alumnos.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Alumno> listarAlumnos() throws Exception;
	
	/**
	 * Buscar alumno por id.
	 *
	 * @param alumno_id the alumno id
	 * @return the alumno
	 * @throws Exception the exception
	 */
	public Alumno buscarAlumnoPorId(long alumno_id) throws Exception;
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumno the alumno
	 * @throws Exception the exception
	 */
	public void insertarAlumno(Alumno alumno) throws Exception;
	
	/**
	 * Editar alumno.
	 *
	 * @param alumno_id the alumno id
	 * @param alumno_nombre the alumno nombre
	 * @param alumno_apellidos the alumno apellidos
	 * @param alumno_telefono the alumno telefono
	 * @throws Exception the exception
	 */
	public void editarAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception;
	
	/**
	 * Eliminar alumno porid.
	 *
	 * @param alumno_id the alumno id
	 * @throws Exception the exception
	 */
	public void eliminarAlumnoPorid(long alumno_id) throws Exception;	
}
```

### 7.1.2. com.AlumnosPortatiles.project.web.services.interfaces --> IPortatilService.java

```java
public interface IPortatilService {
	
	/**
	 * Listar portatiles.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Portatil> listarPortatiles() throws Exception;
	
	/**
	 * Buscar portatil por id.
	 *
	 * @param portatil_id the portatil id
	 * @return the portatil
	 * @throws Exception the exception
	 */
	public Portatil buscarPortatilPorId(long portatil_id) throws Exception;
	
	/**
	 * Insertar portatil.
	 *
	 * @param portatil the portatil
	 * @throws Exception the exception
	 */
	public void insertarPortatil(Portatil portatil) throws Exception;

	/**
	 * Editar portatil.
	 *
	 * @param portatil_id the portatil id
	 * @param portatil_marca the portatil marca
	 * @param portatil_modelo the portatil modelo
	 * @throws Exception the exception
	 */
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception;
	
	/**
	 * Eliminar portatil por id.
	 *
	 * @param portatil_id the portatil id
	 * @throws Exception the exception
	 */
	public void eliminarPortatilPorId(long portatil_id) throws Exception;	
}
```

## 7.2. Implementations

### 7.2.1. com.AlumnosPortatiles.project.web.services.implementations --> AlumnoServiceImpl.java

```java
@Service(value = "AlumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
	IAlumnoRepository alumnoRepository;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<Alumno> listarAlumnos() throws Exception {
		try {
			return (List<Alumno>) alumnoRepository.findAll();
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los alumnos (return null): " + e);
			return null;
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public Alumno buscarAlumnoPorId(long alumno_id) throws Exception {
		try {
			return alumnoRepository.findById(alumno_id).orElse(null);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el alumno (return null): " + e);
			return null;
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarAlumno(Alumno alumno) throws Exception {
		try {
			alumnoRepository.save(alumno);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo alumno: " + e);
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception {
		Alumno alumno = alumnoRepository.findById(alumno_id).orElse(null);
		alumno.setAlumno_nombre(alumno_nombre);
		alumno.setAlumno_apellidos(alumno_apellidos);
		alumno.setAlumno_telefono(alumno_telefono);
		
		try {
			alumnoRepository.save(alumno);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el alumno seleccionado: " + e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarAlumnoPorid(long alumno_id) throws Exception {
		try {
			alumnoRepository.deleteById(alumno_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el alumno seleccionado: " + e);
		}
	}
}
```

### 7.2.2. com.AlumnosPortatiles.project.web.services.implementations --> PortatilServiceImpl.java

```java
@Service(value = "PortatilServiceImpl")
public class PortatilServiceImpl implements IPortatilService {

	@Autowired
	IPortatilRepository portatilRepository;
		
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<Portatil> listarPortatiles() throws Exception {
		try {
			return (List<Portatil>) portatilRepository.findAll();
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los portatiles (return null): " + e);
			return null;
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public Portatil buscarPortatilPorId(long portatil_id) throws Exception {
		try {
			return portatilRepository.findById(portatil_id).orElse(null);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el portatil (return null): " + e);
			return null;
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarPortatil(Portatil portatil) throws Exception {
		try {
			portatilRepository.save(portatil);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo portatil: " + e);
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		Portatil portatil = portatilRepository.findById(portatil_id).orElse(null);
		portatil.setPortatil_marca(portatil_marca);
		portatil.setPortatil_modelo(portatil_modelo);
		
		try {
			portatilRepository.save(portatil);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el portatil seleccionado: " + e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarPortatilPorId(long portatil_id) throws Exception {
		try {
			portatilRepository.deleteById(portatil_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el portatil seleccionado: " + e);
		}
	}
}
```

# 8. Controllers and Views

## 8.1. Index

### 8.1.1. com.AlumnosPortatiles.project.web.controllers.interfaces --> IIndexController.java

```java
public interface IIndexController {

	/**
	 * Navigate to alumnos.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToAlumnos() throws Exception;
	
	/**
	 * Navigate to portatiles.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToPortatiles() throws Exception;
}
```

### 8.1.2. com.AlumnosPortatiles.project.web.controllers.implementations --> IndexControllerImpl.java

```java
@Controller(value = "IndexControllerImpl")
public class IndexControllerImpl implements IIndexController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();	
	
	@RequestMapping(value="/navigateToAlumnos")
	@Override
	public ModelAndView navigateToAlumnos() throws Exception {
		logger.info("\nNavegamos a la vista de Alumnos");
		
		List<Alumno> alumnosList = alumnoService.listarAlumnos();
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);

		return new ModelAndView("alumnos", "listaAlumnos", alumnosListDTO);
	}

	@RequestMapping(value="/navigateToPortatiles")
	@Override
	public ModelAndView navigateToPortatiles() throws Exception {
		logger.info("\nNavegamos a la vista de Portatiles");
		
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);

		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}
}
```

### 8.1.3. webapp --> index.jsp

```html
<main class="px-3">
	<h1>Esto es el INDEX</h1>
	<p class="lead">
		Esto es un home hecho con una platilla de Bootstrap v5.2
	</p>
	<div class="d-flex justify-content-center">
	    <p class="lead">
		    <a href="<c:url value="navigateToAlumnos" />" class="btn btn-lg btn-secondary fw-bold border-white bg-white">Alumnos</a>
		</p>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<p class="lead">
		    <a href="<c:url value="navigateToPortatiles" />" class="btn btn-lg btn-secondary fw-bold border-white bg-white">Portatiles</a>
		</p>
	</div>
</main>
```

## 8.2. Portátiles

### 8.2.1. com.AlumnosPortatiles.project.web.controllers.interfaces --> IPortatilesController.java

```java
public interface IPortatilesController {
		
	/**
	 * Navigate to create form portatil.
	 *
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToCreateFormPortatil() throws Exception;
	
	/**
	 * Find alumno by portatil id.
	 *
	 * @param portatil_id the portatil id
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String findAlumnoByPortatilId(@RequestParam long portatil_id, Model model) throws Exception;
	
	/**
	 * Edits the portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView editPortatil(HttpServletRequest request) throws Exception;
	//public ModelAndView navigateToEditFormPortatil(@RequestParam long portatil_id) throws Exception;
	
	/**
	 * Delete portatil.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deletePortatil(HttpServletRequest request) throws Exception;	
}
```

### 8.2.2. com.AlumnosPortatiles.project.web.controllers.implementations --> PortatilesControllerImpl.java

```java
@Controller(value = "PortatilesControllerImpl")
@RequestMapping(value = { "", "portatil" })
public class PortatilesControllerImpl implements IPortatilesController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	@RequestMapping(value = "/navigateToCreateFormPortatil")
	@Override
	public ModelAndView navigateToCreateFormPortatil() throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de portatiles, pasando un objeto Portatil");
		PortatilDTO portatilDTO = new PortatilDTO();
		
		return new ModelAndView("createFormPortatil", "portatilModel", portatilDTO);
	}

	@RequestMapping(value = "/findAlumnoByPortatilId")
	@Override
	public String findAlumnoByPortatilId(@RequestParam long portatil_id, Model model) throws Exception {
		logger.info("\nVamos a buscar un alumno a través del id de un portatil");
		
		Portatil portatil = portatilService.buscarPortatilPorId(portatil_id);
		model.addAttribute("portatilModel", portatilToDTO.toPortatilDTO(portatil));
		Alumno alumno = portatil.getAlumno();
		model.addAttribute("alumnoModel", alumnoToDTO.toAlumnoDTO(alumno));
		
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		model.addAttribute("listaPortatiles", portatilesListDTO);
		
		return "portatiles";
	}
	
	@RequestMapping(value = "/editPortatil")
	@Override
	public ModelAndView editPortatil(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> editPortatil()");
		
		long id = Long.parseLong(request.getParameter("id"));
		Portatil portatil = portatilService.buscarPortatilPorId(id);
		portatil.setPortatil_marca(request.getParameter("marca").trim());
		portatil.setPortatil_modelo(request.getParameter("modelo").trim());
		portatilService.editarPortatil(portatil.getPortatil_id(), portatil.getPortatil_marca(), portatil.getPortatil_modelo());
		
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);

		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}

	@RequestMapping(value = "/deletePortatil")
	@Override
	public ModelAndView deletePortatil(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> deletePortatil()");
		
		long id = Long.parseLong(request.getParameter("id"));
		portatilService.eliminarPortatilPorId(id);
		
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);

		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}
}
```

### 8.2.3. webapp/views/ --> portatiles.jsp

**Nota**: Para que los modals de bootstrap funcionen, recuerda importar también con CDNs el popper y el jquery.

```html
<div class="container">
		<a class="btn btn-warning mt-2 px-2 text-white" onCLick="history.back()">
			<i class="fa fa-arrow-left" aria-hidden="true"></i>
		</a>



		<form method="post" action="findAlumnoByPortatilId">
			<div class="modal-body">
				<div class="form-group">
					<label>Introduzca el ID de un portatil para consultar su alumno</label>
					<input id="portatil_id" name="portatil_id" type="text" class="form-control" required="required" />
				</div>
			</div>
			<div class="modal-footer justify-content-center">
				<input type="submit" class="btn btn-primary" value="buscar" />
			</div>
		</form>
		
		<c:choose>
			<c:when test="${alumnoModel != null}">
				<table class="table table-dark table-hover">
		 			<thead>
						<tr>
							<th scope="col">Portatil ID</th>
							<th scope="col">Marca</th>
							<th scope="col">Modelo</th>
							<th scope="col"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></th>
							<th scope="col">Alumno ID</th>
							<th scope="col">Nombre</th>
							<th scope="col">Apellidos</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><c:out value="${portatilModel.portatil_id}" /></td>
							<td><c:out value="${portatilModel.portatil_marca}" /></td>
							<td><c:out value="${portatilModel.portatil_modelo}" /></td>
							<td><i class="fa fa-long-arrow-right" aria-hidden="true"></i></td>
							<td><c:out value="${alumnoModel.alumno_id}" /></td>
							<td><c:out value="${alumnoModel.alumno_nombre}" /></td>
							<td><c:out value="${alumnoModel.alumno_apellidos}" /></td>
						</tr>
					</tbody>
				</table>
			</c:when>    
			<c:otherwise>
				
			</c:otherwise>
		</c:choose>
		
		
		
		<div class="d-flex justify-content-between">
			<h1 class="text-center">Lista de portatiles</h1>
			<a href="<c:url value="navigateToCreateFormPortatil" />" class="btn btn-success px-2 py-2 mb-2 text-white">Nuevo Portatil</a>
		</div>
		
		<table class="table table-dark table-hover">
 			<thead>
				<tr>
					<th scope="col">UUID</th>
					<th scope="col">DATE</th>
					<th scope="col">ID</th>
					<th scope="col">Marca</th>
					<th scope="col">Modelo</th>
					<th scope="col">Alumno ID</th>
					<th scope="col">Editar/Eliminar</th>
				</tr>
			</thead>
			<c:forEach var="portatilModel" items="${listaPortatiles}">
				<tbody>
					<tr>
						<td><c:out value="${portatilModel.portatil_uuid}" /></td>
						<td><c:out value="${portatilModel.portatil_date.getTime()}" /></td>
						<td><c:out value="${portatilModel.portatil_id}" /></td>
						<td><c:out value="${portatilModel.portatil_marca}" /></td>
						<td><c:out value="${portatilModel.portatil_modelo}" /></td>
						<td>
							<c:choose>
							    <c:when test="${portatilModel.alumno.alumno_id != null}">
							        <c:out value="${portatilModel.alumno.alumno_id}" />
							    </c:when>    
							    <c:otherwise>
							        <c:out value="sin asignar" />
							    </c:otherwise>
							</c:choose>
						</td>
						<td>					
							<a href="editPortatil?portatil_id=${portatilModel.portatil_id}" onclick="openEditModal();" data-toggle="modal" class="edit btn btn-warning px-2 text-white">
								<i class="fa fa-pencil" aria-hidden="true"></i>
							</a>
							<!--<a href="navigateToEditFormPortatil/?portatil_id=${portatilModel.portatil_id}" class="btn btn-warning px-2 text-white">Editar</a>-->
						
							<a href="deletePortatil?portatil_id=${portatilModel.portatil_id}" onclick="openDeleteModal();" data-toggle="modal" class="delete btn btn-danger px-2 text-white">
								<i class="fa fa-trash" aria-hidden="true"></i>
							</a>
							<!--<a href="deletePortatil?portatil_id=${portatilModel.portatil_id}">Eliminar Sin Modal</a> -->
							
							<input type="hidden" id="id" value="${portatilModel.portatil_id}" />
						</td>
					</tr>
				</tbody>
				
				<!-- --------------------------------- Edit Modal -------------------------------------------------- -->
			
				<div id="editModal" class="modal fade">
					<div class="modal-dialog modal-confirm">
						<div class="modal-content">
							<form method="post" action="editPortatil">
								<div class="modal-header flex-column">
									<div class="icon-box">
										<i class="material-icons">&#xf040;</i>
									</div>						
									<h4 class="modal-title w-100">Editar (No funciona)</h4>	
									<button type="button" onclick="closeEditModal();" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								</div>
								<div class="modal-body">
									<div class="form-group">
										<label>Marca</label>
										<input id="marca" name="marca" type="text" class="form-control" required="required" />
									</div>
									<div class="form-group">
										<label>Modelo</label>
										<input id="modelo" name="modelo" type="text" class="form-control" required="required" />
									</div>
								</div>
								<div class="modal-footer justify-content-center">
									<button type="button" onclick="closeEditModal();" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
									<input type="submit" class="btn btn-danger" value="Edit" />
									
									<input type="hidden" name="id" id="id" />
								</div>
							</form>
						</div>
					</div>
				</div>  
			
			<!-- --------------------------------- Delete Modal --------------------------------------------- -->
			
				<div id="deleteModal" class="modal fade">
					<div class="modal-dialog modal-confirm">
						<div class="modal-content">
							<form method="post" action="deletePortatil">
								<div class="modal-header flex-column">
									<div class="icon-box">
										<i class="material-icons">&#xE5CD;</i>
									</div>							
									<h4 class="modal-title w-100">Are you sure?</h4>	
									<button type="button" onclick="closeDeleteModal();" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								</div>
								<div class="modal-body">
									<p>Do you really want to delete these records? This process cannot be undone.</p>
								</div>
								<div class="modal-footer justify-content-center">
									<button type="button" onclick="closeDeleteModal();" class="btn btn-secondary" data-dismiss="modal">Cancel</button>			
									<input type="submit" class="btn btn-danger" value="Delete" />
									
									<input type="hidden" name="id" id="id" />
								</div>
							</form>
						</div>
					</div>
				</div>
				
			</c:forEach>
		</table>
	</div>
```

## 8.3. Alumnos

### 8.3.1. com.AlumnosPortatiles.project.web.controllers.interfaces --> IAlumnosController.java

```java
public interface IAlumnosController {
	
	/**
	 * Navigate to create form alumno.
	 *
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String navigateToCreateFormAlumno(Model model) throws Exception;
	
	/**
	 * Find portatil by alumno id.
	 *
	 * @param alumno_id the alumno id
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
	public String findPortatilByAlumnoId(@RequestParam long alumno_id, Model model) throws Exception;
	
	/**
	 * Navigate to edit form alumno.
	 *
	 * @param alumno_id the alumno id
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id) throws Exception;
	// public ModelAndView editAlumno(HttpServletRequest request) throws Exception;
	
	/**
	 * Delete alumno.
	 *
	 * @param request the request
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView deleteAlumno(HttpServletRequest request) throws Exception;	
}
```

### 8.3.2. com.AlumnosPortatiles.project.web.controllers.implementations --> AlumnosControllerImpl.java

```java
@Controller(value = "AlumnosControllerImpl")
@RequestMapping(value = { "", "alumno" })
public class AlumnosControllerImpl implements IAlumnosController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	@RequestMapping(value = "/navigateToCreateFormAlumno")
	@Override
	public String navigateToCreateFormAlumno(Model model) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de registro de alumnos, pasando un objeto Alumno");
		
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		model.addAttribute("alumnoModel", alumnoDTO);
		
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);
		model.addAttribute("listaPortatiles" ,portatilesListDTO);

		return "createFormAlumno";
	}

	@RequestMapping(value = "/findPortatilByAlumnoId")
	@Override
	public String findPortatilByAlumnoId(@RequestParam long alumno_id, Model model) throws Exception {
		logger.info("\nVamos a buscar un portatil a través del id de un alumno");
		
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		model.addAttribute("alumnoModel", alumnoToDTO.toAlumnoDTO(alumno));
		Portatil portatil = alumno.getPortatil();
		model.addAttribute("portatilModel", portatilToDTO.toPortatilDTO(portatil));
		
		List<Alumno> alumnosList = alumnoService.listarAlumnos();
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);
		model.addAttribute("listaAlumnos", alumnosListDTO);
		
		return "alumnos";
	}

	@RequestMapping(value = "/navigateToEditFormAlumno")
	@Override
	public ModelAndView navigateToEditFormAlumno(@RequestParam long alumno_id) throws Exception {
		logger.info("\nNavegamos a la vista del formulario de edicion de alumnos, pasando un objeto Alumno");
		Alumno alumno = alumnoService.buscarAlumnoPorId(alumno_id);
		
		return new ModelAndView("editFormAlumno", "alumnoModel", alumno);
	}

	@RequestMapping(value = "/deleteAlumno")
	@Override
	public ModelAndView deleteAlumno(HttpServletRequest request) throws Exception {
		logger.info("\nEntrando en el metodo --> deleteAlumno()");

		long id = Long.parseLong(request.getParameter("id"));
		alumnoService.eliminarAlumnoPorid(id);
		
		List<Alumno> alumnosList = alumnoService.listarAlumnos();
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);

		return new ModelAndView("alumnos", "listaAlumnos", alumnosListDTO);
	}
}
```

### 8.3.3. webapp/views/ --> alumnos.jsp

```html
<div class="container">
		<a class="btn btn-warning mt-2 px-2 text-white" onCLick="history.back()">
			<i class="fa fa-arrow-left" aria-hidden="true"></i>
		</a>
		
		<form method="post" action="findPortatilByAlumnoId">
			<div class="modal-body">
				<div class="form-group">
					<label>Introduzca el ID de un alumno para consultar su portatil asignado</label>
					<input id="alumno_id" name="alumno_id" type="text" class="form-control" required="required" />
				</div>
			</div>
			<div class="modal-footer justify-content-center">
				<input type="submit" class="btn btn-primary" value="buscar" />
			</div>
		</form>
		
		<c:choose>
			<c:when test="${portatilModel != null}">
				<table class="table table-dark table-hover">
		 			<thead>
						<tr>
							<th scope="col">Alumno ID</th>
							<th scope="col">Nombre</th>
							<th scope="col">Apellidos</th>
							<th scope="col"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></th>
							<th scope="col">Portatil ID</th>
							<th scope="col">Marca</th>
							<th scope="col">Modelo</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><c:out value="${alumnoModel.alumno_id}" /></td>
							<td><c:out value="${alumnoModel.alumno_nombre}" /></td>
							<td><c:out value="${alumnoModel.alumno_apellidos}" /></td>
							<td><i class="fa fa-long-arrow-right" aria-hidden="true"></i></td>
							<td><c:out value="${portatilModel.portatil_id}" /></td>
							<td><c:out value="${portatilModel.portatil_marca}" /></td>
							<td><c:out value="${portatilModel.portatil_modelo}" /></td>
						</tr>
					</tbody>
				</table>
			</c:when>    
			<c:otherwise>
				
			</c:otherwise>
		</c:choose>
		

		
		<div class="d-flex justify-content-between">
			<h1 class="text-center">Lista de alumnos</h1>
			<a href="<c:url value="navigateToCreateFormAlumno" />" class="btn btn-success px-2 py-2 mb-2 text-white">Nuevo Alumno</a>
		</div>
		<table class="table table-dark table-hover">
 			<thead>
				<tr>
					<th scope="col">UUID</th>
					<th scope="col">DATE</th>
					<th scope="col">ID</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellidos</th>
					<th scope="col">Teléfono</th>
					<th scope="col">Portátil ID</th>
					<th scope="col">Editar/Eliminar</th>
				</tr>
			</thead>
			<c:forEach var="alumnoModel" items="${listaAlumnos}">
				<tbody>
					<tr>
						<td><c:out value="${alumnoModel.alumno_uuid}" /></td>
						<td><c:out value="${alumnoModel.alumno_date.getTime()}" /></td>
						<td><c:out value="${alumnoModel.alumno_id}" /></td>
						<td><c:out value="${alumnoModel.alumno_nombre}" /></td>
						<td><c:out value="${alumnoModel.alumno_apellidos}" /></td>
						<td><c:out value="${alumnoModel.alumno_telefono}" /></td>
						<td><c:out value="${alumnoModel.portatil.portatil_id}" /></td>
						<td>
							<a href="editAlumno?alumno_id=${alumnoModel.alumno_id}" onclick="openEditModal();" data-toggle="modal" class="edit btn btn-warning px-2 text-white">
								<i class="fa fa-pencil" aria-hidden="true"></i>
							</a>
							<!--<a href="navigateToEditFormAlumno/?alumno_id=${alumnoModel.alumno_id}" class="btn btn-warning px-2 text-white">Editar</a>-->
						
							<a href="deleteAlumno?alumno_id=${alumnoModel.alumno_id}" onclick="openDeleteModal();" data-toggle="modal" class="delete btn btn-danger px-2 text-white">
								<i class="fa fa-trash" aria-hidden="true"></i>
							</a>
							<!--<a href="deleteAlumno?alumno_id=${alumnoModel.alumno_id}">Eliminar Sin Modal</a> -->
							
							<input type="hidden" id="id" value="${alumnoModel.alumno_id}" />
						</td>
					</tr>
				</tbody>
				
				
				<!-- --------------------------------- Edit Modal -------------------------------------------------- -->
				
				<div id="editModal" class="modal fade">
					<div class="modal-dialog modal-confirm">
						<div class="modal-content">
							<form method="post" action="editAlumno">
								<div class="modal-header flex-column">
									<div class="icon-box">
										<i class="material-icons">&#xf040;</i>
									</div>						
									<h4 class="modal-title w-100">Editar (No funciona)</h4>	
									<button type="button" onclick="closeEditModal();" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								</div>
								<div class="modal-body">
									<div class="form-group">
										<label>Nombre</label>
										<input id="nombre" name="nombre" type="text" class="form-control" required="required" />
									</div>
									<div class="form-group">
										<label>Apellidos</label>
										<input id="apellidos" name="apellidos" type="text" class="form-control" required="required" />
									</div>
									<div class="form-group">
										<label>Teléfono</label>
										<input id="telefono" name="telefono" type="text" class="form-control" required="required" />
									</div>
								</div>
								<div class="modal-footer justify-content-center">
									<button type="button" onclick="closeEditModal();" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
									<input type="submit" class="btn btn-danger" value="Edit" />
									
									<input type="hidden" name="id" id="id" />
								</div>
							</form>
						</div>
					</div>
				</div>  
				
				<!-- --------------------------------- Delete Modal --------------------------------------------- -->
				
				<div id="deleteModal" class="modal fade">
					<div class="modal-dialog modal-confirm">
						<div class="modal-content">
							<form method="post" action="deleteAlumno">
								<div class="modal-header flex-column">
									<div class="icon-box">
										<i class="material-icons">&#xE5CD;</i>
									</div>							
									<h4 class="modal-title w-100">Are you sure?</h4>	
									<button type="button" onclick="closeDeleteModal();" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								</div>
								<div class="modal-body">
									<p>Do you really want to delete these records? This process cannot be undone.</p>
								</div>
								<div class="modal-footer justify-content-center">
									<button type="button" onclick="closeDeleteModal();" class="btn btn-secondary" data-dismiss="modal">Cancel</button>			
									<input type="submit" class="btn btn-danger" value="Delete" />
									
									<input type="hidden" name="id" id="id" />
								</div>
							</form>
						</div>
					</div>
				</div>
				 
			</c:forEach>
		</table>
	</div>
```

## 8.4. Create Form Portátiles

### 8.4.1. com.AlumnosPortatiles.project.web.controllers.interfaces --> ICreateFormPortatilController.java

```java
public interface ICreateFormPortatilController {
	
	/**
	 * Form create portatil.
	 *
	 * @param portatilModel the portatil model
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView formCreatePortatil(@ModelAttribute("portatilModel") PortatilDTO portatilModel) throws Exception;	
}
```

### 8.4.2. com.AlumnosPortatiles.project.web.controllers.implementations --> CreateFormPortatilControllerImpl.java

```java
@Controller(value = "CreateFormPortatilControllerImpl")
public class CreateFormPortatilControllerImpl implements ICreateFormPortatilController {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IPortatilToDAO portatilToDAO = new PortatilToDAOimpl();
	
	@Autowired
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	@RequestMapping(value="/formCreatePortatil", method = RequestMethod.POST)
	@Override
	public ModelAndView formCreatePortatil(@ModelAttribute("portatilModel") PortatilDTO portatilModel) throws Exception {
		logger.info("\nEntrando en el metodo --> formCreatePortatil()");
		
		portatilModel.setPortatil_uuid(UUID.randomUUID());
		portatilModel.setPortatil_date(Calendar.getInstance());
		portatilService.insertarPortatil(portatilToDAO.toPortatilDAO(portatilModel));
		
		logger.info("\nVolvemos a la vista de los Portatiles");
		List<Portatil> portatilesList = portatilService.listarPortatiles();
		logger.info("\nLa lista de portatiles contiene " + portatilesList.size() + " portatiles");
		List<PortatilDTO> portatilesListDTO = portatilToDTO.toListPortatilDTO(portatilesList);

		return new ModelAndView("portatiles", "listaPortatiles", portatilesListDTO);
	}	
}
```

### 8.4.3. webapp/views/ --> createFormPortatil.jsp

```html
<div class="container">
    <a class="btn btn-warning mt-2 px-2 text-white" onCLick="history.back()">
		<i class="fa fa-arrow-left" aria-hidden="true"></i>
	</a>
		
    <h1 class="text-center">Formulario de Registro de Portátiles</h1>
    	
    <form:form method="POST" action="formCreatePortatil" modelAttribute="portatilModel">
	    <table>
	        <tr class="mb-3">
	        	<td><form:label path="portatil_marca" for="portatil_marca" class="form-label">Marca</form:label></td>
	            <td><form:input path="portatil_marca" type="text" class="form-control" id="portatil_marca" placeholder="marca..." /></td>
	        </tr>
	        <tr>
	          	<td><form:label path="portatil_modelo" for="portatil_modelo" class="form-label">Modelo</form:label></td>
                <td><form:input path="portatil_modelo" type="text" class="form-control" id="portatil_modelo" placeholder="modelo..." /></td>
            </tr>
	                
            <tr>
              	<td><input type="submit" class="btn btn-primary" value="Registrar Portátil"/></td>
            </tr>
        </table>
  	</form:form> 
</div>
```

## 8.5. Create Form Alumnos

### 8.5.1. com.AlumnosPortatiles.project.web.controllers.interfaces --> ICreateFormAlumnoController.java

```java
public interface ICreateFormAlumnoController {
	
	/**
	 * Form create alumno.
	 *
	 * @param alumnoModel the alumno model
	 * @return the model and view
	 * @throws Exception the exception
	 */
	public ModelAndView formCreateAlumno(@ModelAttribute("alumnoModel") AlumnoDTO alumnoModel) throws Exception;
}
```

### 8.5.2. com.AlumnosPortatiles.project.web.controllers.implementations --> CreateFormAlumnoControllerImpl.java

```java
@Controller(value = "CreateFormAlumnoControllerImpl")
public class CreateFormAlumnoControllerImpl implements ICreateFormAlumnoController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	IAlumnoService alumnoService = new AlumnoServiceImpl();
	
	@Autowired
	IPortatilService portatilService = new PortatilServiceImpl();
	
	@Autowired
	IAlumnoToDAO alumnoToDAO = new AlumnoToDAOimpl();
	
	@Autowired
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@RequestMapping(value="/formCreateAlumno", method = RequestMethod.POST)
	@Override
	public ModelAndView formCreateAlumno(@ModelAttribute("alumnoModel") AlumnoDTO alumnoModel) throws Exception {
		logger.info("\nEntrando en el metodo --> formCreateAlumno()");
		Portatil portatil = portatilService.buscarPortatilPorId(alumnoModel.getPortatil_id());
		
		alumnoModel.setAlumno_uuid(UUID.randomUUID());
		alumnoModel.setAlumno_date(Calendar.getInstance());
		alumnoModel.setPortatil(portatil);
		alumnoService.insertarAlumno(alumnoToDAO.toAlumnoDAO(alumnoModel));
		
		logger.info("\nVolvemos a la vista de los Alumnos");
		List<Alumno> alumnosList = alumnoService.listarAlumnos();	
		logger.info("\nLa lista de alumnos contiene " + alumnosList.size() + " alumnos");
		List<AlumnoDTO> alumnosListDTO = alumnoToDTO.toListAlumnoDTO(alumnosList);
		
		return new ModelAndView("alumnos", "listaAlumnos", alumnosListDTO);
	}
}
```

### 8.5.3. webapp/views/ --> createFormAlumno.jsp

```html
<div class="container">
    <a class="btn btn-warning mt-2 px-2 text-white" onCLick="history.back()">
		<i class="fa fa-arrow-left" aria-hidden="true"></i>
	</a>
    	
    <h1 class="text-center">Formulario de Registro de Portátiles</h1>
    	
    <form:form method="POST" action="formCreateAlumno" modelAttribute="alumnoModel">
	    <table>
	        <tr class="mb-3">
	            <td><form:label path="alumno_nombre" for="alumno_nombre" class="form-label">Nombre</form:label></td>
	            <td><form:input path="alumno_nombre" type="text" class="form-control" id="alumno_nombre" placeholder="nombre..." /></td>
	        </tr>
	        <tr>
	            <td><form:label path="alumno_apellidos" for="alumno_apellidos" class="form-label">Apellidos</form:label></td>
	            <td><form:input path="alumno_apellidos" type="text" class="form-control" id="alumno_apellidos" placeholder="apellidos..." /></td>
	        </tr>
	        <tr>
	            <td><form:label path="alumno_telefono" for="alumno_telefono" class="form-label">Teléfono</form:label></td>
	            <td><form:input path="alumno_telefono" type="text" class="form-control" id="alumno_telefono" placeholder="teléfono..." /></td>
	        </tr>
	        <tr>
             	<td><form:label path="portatil_id" for="portatil_id" class="form-label">Portátil ID</form:label></td>
	            <td><form:input path="portatil_id" type="text" class="form-control" id="portatil_id" placeholder="portátil ID..." /></td>
	        </tr>
	                
	        <tr>
	            <td><input type="submit" class="btn btn-primary" value="Registrar Alumno"/></td>
	        </tr>
	    </table>
	</form:form>
	  	
	<h2 class="text-center">Portátiles Disponibles</h2>
	<table class="table table-dark table-hover">
 		<thead>
			<tr>
				<th scope="col">UUID</th>
				<th scope="col">DATE</th>
				<th scope="col">ID</th>
				<th scope="col">Marca</th>
				<th scope="col">Modelo</th>
			</tr>
		</thead>
		<c:forEach var="portatilModel" items="${listaPortatiles}">
			<tbody>
				<c:choose>
					<c:when test="${portatilModel.alumno.alumno_id == null}">
						<tr>
							<td><c:out value="${portatilModel.portatil_uuid}" /></td>
							<td><c:out value="${portatilModel.portatil_date.getTime()}" /></td>
							<td><c:out value="${portatilModel.portatil_id}" /></td>
							<td><c:out value="${portatilModel.portatil_marca}" /></td>
							<td><c:out value="${portatilModel.portatil_modelo}" /></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr></tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</c:forEach>
	</table> 
</div>
```

# Pruebas de Ejecución

## Prueba de ejecución 1 --> Conexión icicial con la BBDD autocreando las tablas

[Prueba de ejecución 1](https://user-images.githubusercontent.com/91122596/220164667-dd187b8b-e080-4537-a2f2-44907d817578.mp4)

## Prueba de ejecución 2 --> Probando el insert de Portatil (.save()) y el select de Portatil (.findAll())

[Prueba de ejecución 2](https://user-images.githubusercontent.com/91122596/220727301-f1ba9007-02d9-4690-9033-e3b834e11240.mp4)

## Prueba de ejecución 3 --> Probando el delete de Portatil

[Prueba de ejecución 3](https://user-images.githubusercontent.com/91122596/221555331-e1f5159f-5319-47d4-899a-784ccc6e1735.mp4)

## Prueba de ejecución 4 --> Probando el insert de Alumno asignando un portátil

[Prueba de ejecución 4](https://user-images.githubusercontent.com/91122596/221556468-f8dbc648-0d3b-4308-be7a-0db1964fa8ea.mp4)

## Prueba de ejecución 5 --> Probando el delete de Alumno

[Prueba de ejecución 5](https://user-images.githubusercontent.com/91122596/221558062-2ed078ae-2a3e-4299-beb3-b86f65865dfd.mp4)

## Prueba de ejecución 6 --> Probando la funcionalidad de buscar un portátil por el ID de un alumno, y viceversa

[Prueba de ejecución 6](https://user-images.githubusercontent.com/91122596/221559557-8a679eb9-c2a3-44e2-aa88-036e56cd9863.mp4)

# Webgrafía

## ⭐ Guía completa de ejemplo de proyecto web de Spring MVC paso a paso (parte 5)

https://www.uv.es/grimo/teaching/SpringMVCv5PasoAPaso/part5.html

## ⭐ Spring Data JPA Tutorial: Annotation Configuration

https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-part-one-configuration/

## ⭐ Spring MVC 5 + Spring Data JPA + Hibernate 5 + JSP (Tutorial)

https://www.javaguides.net/2018/11/spring-mvc-5-spring-data-jpa-hibernate-jsp-mysql-tutorial.html

## ⭐ Database and JPA Configuration without persistence.xml using JavaConfig

https://www.concretepage.com/spring-4/spring-mvc-4-rest-jpa-2-hibernate-without-persistence-xml#jpa

## Simplified Web Configuration with Spring MVC

https://joshlong.com/jl/blogPost/simplified_web_configuration_with_spring.html

## Spring MVC annotation config example with JavaConfig

https://www.devglan.com/spring-mvc/spring-mvc-annotation-example

## Pragmatically Spring MVC example without using XML

https://www.greaterthan0.com/pragmatically-spring-mvc-example-without-using-xml-pure-java-based-configuration

## How to Access EntityManager with Spring Data

https://www.baeldung.com/spring-data-entitymanager

## JPA/Hibernate Persistence Context

https://www.baeldung.com/jpa-hibernate-persistence-context

## CrudRepository Example

https://www.codejava.net/frameworks/spring/spring-mvc-spring-data-jpa-hibernate-crud-example

## JpaRepository Example (es lo mismo que el CrudRepository pero lo he visto más en SpringBoot)

https://www.javaguides.net/2018/12/spring-mvc-spring-data-jpa-crud-example.html

## Curiosidad extra: Cómo declarar e inicializar EntityManager sin contexto.xml

https://github.com/codspire/JPA-HikariCP-without-Spring/blob/develop/src/main/java/com/codspire/db/mgmt/repository/Repository.java

# Errores

## org.springframework.web.context.ContextLoaderListener

### Explicación y Solución --> Opción 1

https://www.java67.com/2015/06/org.Springframework.Web.Context.ContextLoaderListener.html

### Explicación y Solución --> Opción 2

https://www.javamexico.org/foros/java_standard_edition/javalangclassnotfoundexception_web_service