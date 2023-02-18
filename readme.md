# Repetición del proyecto de AlumnosPortatiles con Vistas y Anotaciones (sin context.xml)

# 0. pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.AlumnosPortatiles</groupId>
  <artifactId>AlumnosPortatiles-AnnotationConfig</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>war</packaging>
  
  <properties>
  	<java-version>18</java-version>
    <maven.compiler.source>18</maven.compiler.source>
    <maven.compiler.target>18</maven.compiler.target>
  	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  	<org.springframework.version>5.0.6.RELEASE</org.springframework.version>
  	<hibernate.version>5.6.12.Final</hibernate.version>
	<postgresql.connector.version>42.5.1</postgresql.connector.version>
  </properties>
  
  <dependencies>
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

	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-web</artifactId>
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
	    <artifactId>spring-webmvc</artifactId>
	    <version>${org.springframework.version}</version>
	</dependency>

	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-orm</artifactId>
	    <version>${org.springframework.version}</version>
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
	    <version>4.0.1</version>
	    <scope>provided</scope>
	</dependency>

	<dependency>
	    <groupId>javax.annotation</groupId>
	    <artifactId>javax.annotation-api</artifactId>
	    <version>1.3.2</version>
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
  	
  	<dependency>
  		<groupId>javax.servlet.jsp.jstl</groupId>
  		<artifactId>javax.servlet.jsp.jstl-api</artifactId>
  		<version>1.2.1</version>
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
	    <version>5.6.12.Final</version>
	</dependency>
		
	<dependency>
	    <groupId>org.hibernate</groupId>
	    <artifactId>hibernate-entitymanager</artifactId>
	    <version>5.6.12.Final</version>
	</dependency>
  	
  	<!-- ********************************* TagLibs ************************************* -->
  	<dependency>
  		<groupId>org.apache.taglibs</groupId>
  		<artifactId>taglibs-standard-impl</artifactId>
  		<version>1.2.5</version>
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
  
</project>
```

# 1. src/main/resources --> application.properties

```properties
# https://docs.spring.io/spring-boot/docs/1.1.1.RELEASE/reference/html/common-application-properties.html

####################################### DataBase #######################################
spring.datasource.url = jdbc:postgresql://localhost/AlumnosVistas-AnnotationConfig
spring.datasource.username = postgres
spring.datasource.password = 12345
spring.datasource.driverClassName = org.postgresql.Driver


####################################### JPA #######################################
spring.jpa.show-sql = false
spring.jpa.database-platform = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl = true
spring.data.jpa.repositories.enabled = true

####################################### HIBERNATE #######################################
hibernate.show_sql = false
hibernate.format_sql = true
hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
hibernate.generateDdl = true
hibernate.hbm2ddl.auto = update
```

# 2. webapp

## 2.1. config

### header.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page session="false" %>
<%@ page isELIgnored = "false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" /></script>
```

## 2.2. css
## 2.3. js
## 2.4. META-INF
## 2.5. views
## 2.6. WEB-INF
## 2.7. index.jsp

# 3. Routing Configuration

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
@ComponentScan
@EnableJpaRepositories("com.AlumnosPortatiles.project.app.repositories")
@PropertySource("classpath:application.properties")
public class AppContextConfig {

	@Autowired
	private Environment enviroment;

	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setPackagesToScan(Alumno.class.getPackage().getName());
		
		JpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		entityManagerFactory.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		
		Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", enviroment.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", enviroment.getProperty("spring.jpa.show-sql"));
        jpaProperties.put("hibernate.format_sql", enviroment.getProperty("spring.jpa.properties.hibernate.format_sql"));
        jpaProperties.put("hibernate.dialect", enviroment.getProperty("spring.jpa.database-platform"));
        entityManagerFactory.setJpaProperties(jpaProperties);
		
		return entityManagerFactory;
	}
	
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
    public PlatformTransactionManager transactionManager() {
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
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "alumno_alumno_id_seq")
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
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "portatil_portatil_id_seq")
	private long portatil_id;
	
	@Column(table = "portatil", name = "portatil_marca", insertable = true, updatable = true, unique = false, nullable = false)
	private String portatil_marca;
	
	@Column(table = "portatil", name = "portatil_modelo", insertable = true, updatable = true, unique = false, nullable = false)
	private String portatil_modelo;
	
	/******************************************* RELACIONES *********************************************/
	@OneToOne(mappedBy = "portatil", targetEntity = Alumno.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER, orphanRemoval = false, optional = true)
	private Alumno alumno;
```

# 5. Repositories

## 5.1. Interfaces

### 5.1.1. com.AlumnosPortatiles.project.app.repositories.interfaces --> IAlumnoRepository.java

```java
public interface IAlumnoRepository {

	/**
	 * List alumnos.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Alumno> listAlumnos() throws Exception;
	
	/**
	 * Find by id alumno.
	 *
	 * @param alumno_id the alumno id
	 * @return the alumno
	 * @throws Exception the exception
	 */
	public Alumno findByIdAlumno(long alumno_id) throws Exception;
	
	/**
	 * Insert alumno.
	 *
	 * @param alumno the alumno
	 * @throws Exception the exception
	 */
	public void insertAlumno(Alumno alumno) throws Exception;
	
	/**
	 * Edits the alumno.
	 *
	 * @param alumno_id the alumno id
	 * @param alumno_nombre the alumno nombre
	 * @param alumno_apellidos the alumno apellidos
	 * @param alumno_telefono the alumno telefono
	 * No recibe ningún portatil porque el enunciado dice que el portatil siempre será el mismo para el alumno
	 * @throws Exception the exception
	 */
	public void editAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception;
	
	/**
	 * Delete by id alumno.
	 *
	 * @param alumno_id the alumno id
	 * @throws Exception the exception
	 */
	public void deleteByIdAlumno(long alumno_id) throws Exception;
	
	/**
	 * Delete alumno.
	 *
	 * @param alumno the alumno
	 * @throws Exception the exception
	 */
	public void deleteAlumno(Alumno alumno) throws Exception;	
}
```

### 5.1.2. com.AlumnosPortatiles.project.app.repositories.interfaces --> IPortatilRepository.java

```java
public interface IPortatilRepository {

	/**
	 * List portatiles.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Portatil> listPortatiles() throws Exception;
	
	/**
	 * Find by id portatil.
	 *
	 * @param portatil_id the portatil id
	 * @return the portatil
	 * @throws Exception the exception
	 */
	public Portatil findByIdPortatil(long portatil_id) throws Exception;
	
	/**
	 * Insert portatil.
	 *
	 * @param portatil the portatil
	 * @throws Exception the exception
	 */
	public void insertPortatil(Portatil portatil) throws Exception;
	
	/**
	 * Edits the portatil.
	 *
	 * @param portatil_id the portatil id
	 * @param portatil_marca the portatil marca
	 * @param portatil_modelo the portatil modelo
	 * @throws Exception the exception
	 */
	public void editPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception;
	
	/**
	 * Delete by id portatil.
	 *
	 * @param portatil_id the portatil id
	 * @throws Exception the exception
	 */
	public void deleteByIdPortatil(long portatil_id) throws Exception;
	
	/**
	 * Delete portatil.
	 *
	 * @param portatil the portatil
	 * @throws Exception the exception
	 */
	public void deletePortatil(Portatil portatil) throws Exception;	
}
```

## 5.2. Implementations

### 5.2.1. com.AlumnosPortatiles.project.app.repositories.interfaces --> AlumnoRepositoryImpl.java

```java
@Repository(value = "AlumnoRepositoryImpl")
public class AlumnoRepositoryImpl implements IAlumnoRepository {

	@PersistenceContext
    private EntityManagerFactory entityManagerFactory;


	@Override
	public List<Alumno> listAlumnos() throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
						
		// the lowercase a refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT a FROM Alumno a WHERE a.id IS NOT NULL";
		    	
		// Issue the query and get a matching object
		TypedQuery<Alumno> typedQuery = entityManager.createQuery(query, Alumno.class);
		List<Alumno> listaAlumnos = new ArrayList<>();
		    	
		try {
			// Get matching objects and output
		    listaAlumnos = typedQuery.getResultList();
		}
		    	
		catch(NoResultException ex) {
			ex.printStackTrace();
		}
		    	
		finally {
			// Close EntityManager
		    // entityManager.flush();
			// entityManager.clear();
		    entityManager.close();
		}
		    	
		return listaAlumnos;
	}
	
	
	
	@Override
	public Alumno findByIdAlumno(long alumno_id) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
						
		// the lowercase a refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT a FROM Alumno a WHERE a.id = :alumnoID";
		    	
		// Issue the query and get a matching object
		TypedQuery<Alumno> typedQuery = entityManager.createQuery(query, Alumno.class);
		typedQuery.setParameter("alumnoID", alumno_id);

		Alumno alumno = new Alumno();
		    	
		try {
			// Get matching the object and output
		    alumno = typedQuery.getSingleResult();	
		}
		    	
		catch(NoResultException e) {
			e.printStackTrace();
		}
		    	
		finally {
			// Close EntityManager
			// entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
		    	
		return alumno;
	}
	
	

	@Override
	public void insertAlumno(Alumno alumno) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				 
		try {
			// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		 
		    // Save the object
		    entityManager.merge(alumno);
		    entityTransaction.commit();
		            
		} catch (Exception ex) {
			// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		            
		    ex.printStackTrace();
		        
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}
	
	
	
	@Override
	public void editAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
						
		// the lowercase a refers to the object
		// :objectID is a parameterized query thats value is set below
		String jpql = "UPDATE Alumno a SET a.alumno_nombre = :alumnoNOMBRE, a.alumno_apellidos = :alumnoAPELLIDOS, a.alumno_telefono = :alumnoTELEFONO WHERE a.id = :alumnoID";
		
		// Issue the query and get a matching object
		Query query = entityManager.createQuery(jpql);
		query.setParameter("alumnoID", alumno_id);
		query.setParameter("alumnoNOMBRE", alumno_nombre);
		query.setParameter("alumnoAPELLIDOS", alumno_apellidos);
		query.setParameter("alumnoTELEFONO", alumno_telefono);
    	
    	int nRegistrosEditados = 0;
    	
    	try {
    		// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
    		// Get matching the object and output
    		nRegistrosEditados = query.executeUpdate();
    		entityTransaction.commit();
    		System.out.println("\n\n[INFO] -Numero de alumnos editados: " + nRegistrosEditados);
		
    	} catch (Exception ex) {
    		// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
		
    	} finally {
    		// Close EntityManager
    		// entityManager.flush();
    		// entityManager.clear();
    		entityManager.close();
		}
	}
	
	@Override
	public void deleteByIdAlumno(long alumno_id) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				
		// the lowercase a refers to the object
    	// :objectID is a parameterized query thats value is set below
		String jpql = "DELETE FROM Alumno a WHERE a.id = :alumnoID";
    	
		// Issue the query and get a matching object
		Query query = entityManager.createQuery(jpql);
    	query.setParameter("alumnoID", alumno_id);
    	
    	int nRegistrosEliminados = 0;
    	
    	try {
    		// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
    		// Get matching the object and output
    		nRegistrosEliminados = query.executeUpdate();
    		entityTransaction.commit();
    		System.out.println("\n\n[INFO] -Numero de alumnos eliminados: " + nRegistrosEliminados);
		
    	} catch (Exception ex) {
    		// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
		
    	} finally {
    		// Close EntityManager
    		// entityManager.flush();
    		// entityManager.clear();
    		entityManager.close();
		}
	}
	
	@Override
	public void deleteAlumno(Alumno alumno) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
		 
		try {
			entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
		    entityManager.remove(entityManager.contains(alumno) ? alumno : entityManager.merge(alumno));		    
		    
		    entityTransaction.commit();
		    
		} catch (Exception ex) {
		    // If there is an exception rollback changes
			if (entityTransaction != null) {
				entityTransaction.rollback();
		    }
		            
		    ex.printStackTrace();
		        
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}	
}
```

### 5.2.2. com.AlumnosPortatiles.project.app.repositories.interfaces --> PortatilRepositoryImpl.java

```java
@Repository(value = "PortatilRepositoryImpl")
public class PortatilRepositoryImpl implements IPortatilRepository {

	@PersistenceContext
    private EntityManagerFactory entityManagerFactory;
	
	
	@Override
	public List<Portatil> listPortatiles() throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
								
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT p FROM Portatil p WHERE p.id IS NOT NULL";
				    	
		// Issue the query and get a matching object
		TypedQuery<Portatil> typedQuery = entityManager.createQuery(query, Portatil.class);
		List<Portatil> listaPortatiles = new ArrayList<>();
				    	
		try {
			// Get matching objects and output
			listaPortatiles = typedQuery.getResultList();
		}
				    	
		catch(NoResultException ex) {
			ex.printStackTrace();
		}
				    	
		finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
				    	
		return listaPortatiles;
	}

	@Override
	public Portatil findByIdPortatil(long portatil_id) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
								
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String query = "SELECT p FROM Portatil p WHERE p.id = :portatilID";
				    	
		// Issue the query and get a matching object
		TypedQuery<Portatil> typedQuery = entityManager.createQuery(query, Portatil.class);
		typedQuery.setParameter("portatilID", portatil_id);

		Portatil portatil = new Portatil();
				    	
		try {
			// Get matching the object and output
			portatil = typedQuery.getSingleResult();	
		}
				    	
		catch(NoResultException e) {
			e.printStackTrace();
		}
				    	
		finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
				    	
		return portatil;
	}

	@Override
	public void insertPortatil(Portatil portatil) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
						 
		try {
			// Get transaction and start
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
				 
			// Save the object
			entityManager.merge(portatil);
			entityTransaction.commit();
				            
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (entityTransaction != null) {
			entityTransaction.rollback();
			}
				            
			ex.printStackTrace();
				        
		} finally {
			// Close EntityManager
			// entityManager.flush();
			// entityManager.clear();
			entityManager.close();
		}
	}
	
	@Override
	public void editPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				
		// the lowercase a refers to the object
    	// :objectID is a parameterized query thats value is set below
		String jpql = "UPDATE Portatil p SET p.portatil_marca = :portatilMARCA, p.portatil_modelo = :portatilMODELO WHERE p.id = :portatilID";
    	
		// Issue the query and get a matching object
    	Query query = entityManager.createQuery(jpql);
    	query.setParameter("portatilID", portatil_id);
    	query.setParameter("portatilMARCA", portatil_marca);
    	query.setParameter("portatilMODELO", portatil_modelo);
    	
    	int nRegistrosEditados = 0;
    	
    	try {
    		// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
    		// Get matching the object and output
    		nRegistrosEditados = query.executeUpdate();
    		entityTransaction.commit();
    		System.out.println("\n\n[INFO] -Numero de portatiles editados: " + nRegistrosEditados);
		
    	} catch (Exception ex) {
    		// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
		
    	} finally {
    		// Close EntityManager
    		// entityManager.flush();
    		// entityManager.clear();
    		entityManager.close();
		}
	}
	
	@Override
	public void deleteByIdPortatil(long portatil_id) throws Exception {
		// The EntityManager class allows operations such as create, read, update, delete
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
				
		// the lowercase p refers to the object
		// :objectID is a parameterized query thats value is set below
		String jpql = "DELETE FROM Portatil p WHERE p.id = :portatilID";
		    	
		// Issue the query and get a matching object
		Query query = entityManager.createQuery(jpql);
		query.setParameter("portatilID", portatil_id);
		    	
		int nRegistrosEliminados = 0;
		    	
		try {
			// Get transaction and start
		    entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
			// Get matching the object and output
		    nRegistrosEliminados = query.executeUpdate();
		    entityTransaction.commit();
		    System.out.println("\n\n[INFO] -Numero de portatiles eliminados: " + nRegistrosEliminados);
				
		} catch (Exception ex) {
			// If there is an exception rollback changes
		    if (entityTransaction != null) {
		    	entityTransaction.rollback();
		    }
		    
			ex.printStackTrace();
				
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}
	
	@Override
	public void deletePortatil(Portatil portatil) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction entityTransaction = null;
		 
		try {
			entityTransaction = entityManager.getTransaction();
		    entityTransaction.begin();
		    
			entityManager.remove(entityManager.contains(portatil) ? portatil : entityManager.merge(portatil));
		    
		    entityTransaction.commit();
		    
		} catch (Exception ex) {
		    // If there is an exception rollback changes
			if (entityTransaction != null) {
				entityTransaction.rollback();
		    }
		            
		    ex.printStackTrace();
		        
		} finally {
			// Close EntityManager
		    // entityManager.flush();
		    // entityManager.clear();
		    entityManager.close();
		}
	}	
}
```

# 6. DTO

## 6.1. Models

### 6.1.1. com.AlumnosPortatiles.project.web.dto.models --> AlumnoDTO.java

```java

```

### 6.1.2. com.AlumnosPortatiles.project.web.dto.models --> PortatilDTO.java

```java

```

# Webgrafía

## ⭐ Guía completa de ejemplo de proyecto web de Spring MVC paso a paso (parte 5)

https://www.uv.es/grimo/teaching/SpringMVCv5PasoAPaso/part5.html

## ⭐ Database and JPA Configuration without persistence.xml using JavaConfig

https://www.concretepage.com/spring-4/spring-mvc-4-rest-jpa-2-hibernate-without-persistence-xml#jpa

## Simplified Web Configuration with Spring MVC

https://joshlong.com/jl/blogPost/simplified_web_configuration_with_spring.html

## Spring MVC annotation config example with JavaConfig

https://www.devglan.com/spring-mvc/spring-mvc-annotation-example

## Pragmatically Spring MVC example without using XML

https://www.greaterthan0.com/pragmatically-spring-mvc-example-without-using-xml-pure-java-based-configuration