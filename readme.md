# Repetición del proyecto de AlumnosPortatiles con Vistas y Anotaciones (sin context.xml)

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

# Prueba de ejecución 1 --> Conexión icicial con la BBDD autocreando las tablas

[Prueba de ejecución 1](https://user-images.githubusercontent.com/91122596/220164667-dd187b8b-e080-4537-a2f2-44907d817578.mp4)

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
	
	@PersistenceContext(synchronization = SynchronizationType.SYNCHRONIZED, type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

	@Override
	public List<Alumno> listAlumnos() throws Exception {						
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
	
	@PersistenceContext(synchronization = SynchronizationType.SYNCHRONIZED, type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

	@Override
	public List<Portatil> listPortatiles() throws Exception {
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
	public List<AlumnoDTO> listarAlumnos() throws Exception;
	
	/**
	 * Buscar alumno por id.
	 *
	 * @param alumno_id the alumno id
	 * @return the alumno DTO
	 * @throws Exception the exception
	 */
	public AlumnoDTO buscarAlumnoPorId(long alumno_id) throws Exception;
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @throws Exception the exception
	 */
	public void insertarAlumno(AlumnoDTO alumnoDTO) throws Exception;
	
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
	public List<PortatilDTO> listarPortatiles() throws Exception;
	
	/**
	 * Buscar portatil por id.
	 *
	 * @param portatil_id the portatil id
	 * @return the portatil DTO
	 * @throws Exception the exception
	 */
	public PortatilDTO buscarPortatilPorId(long portatil_id) throws Exception;
	
	/**
	 * Insertar portatil.
	 *
	 * @param portatilDTO the portatil DTO
	 * @throws Exception the exception
	 */
	public void insertarPortatil(PortatilDTO portatilDTO) throws Exception;
	
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
	IAlumnoToDTO alumnoToDTO = new AlumnoToDTOimpl();
	
	@Autowired
	IAlumnoToDAO alumnoToDAO = new AlumnoToDAOimpl();
	
	@Autowired
	IAlumnoRepository alumnoRepository = new AlumnoRepositoryImpl();
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<AlumnoDTO> listarAlumnos() throws Exception {
		try {
			return alumnoToDTO.toListAlumnoDTO(alumnoRepository.listAlumnos());
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los alumnos (return null): " + e);
			return null;
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public AlumnoDTO buscarAlumnoPorId(long alumno_id) throws Exception {
		try {
			return alumnoToDTO.toAlumnoDTO(alumnoRepository.findByIdAlumno(alumno_id));
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el alumno (return null): " + e);
			return null;
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarAlumno(AlumnoDTO alumnoDTO) throws Exception {
		try {
			alumnoRepository.insertAlumno(alumnoToDAO.toAlumnoDAO(alumnoDTO));
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo alumno: " + e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarAlumno(long alumno_id, String alumno_nombre, String alumno_apellidos, String alumno_telefono) throws Exception {
		try {
			alumnoRepository.editAlumno(alumno_id, alumno_nombre, alumno_apellidos, alumno_telefono);
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el alumno seleccionado: " + e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarAlumnoPorid(long alumno_id) throws Exception {
		try {
			alumnoRepository.deleteByIdAlumno(alumno_id);
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
	IPortatilToDTO portatilToDTO = new PortatilToDTOimpl();
	
	@Autowired
	IPortatilToDAO portatilToDAO = new PortatilToDAOimpl();
	
	@Autowired
	IPortatilRepository portatilRepository = new PortatilRepositoryImpl();


	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public List<PortatilDTO> listarPortatiles() throws Exception {
		try {
			return portatilToDTO.toListPortatilDTO(portatilRepository.listPortatiles());
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al listar los portatiles (return null): " + e);
			return null;
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true, timeout = 10)
	@Override
	public PortatilDTO buscarPortatilPorId(long portatil_id) throws Exception {
		try {
			return portatilToDTO.toPortatilDTO(portatilRepository.findByIdPortatil(portatil_id));
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al buscar el portatil (return null): " + e);
			return null;
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void insertarPortatil(PortatilDTO portatilDTO) throws Exception {
		try {
			portatilRepository.insertPortatil(portatilToDAO.toPortatilDAO(portatilDTO));
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al insertar el nuevo portatil: " + e);
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void editarPortatil(long portatil_id, String portatil_marca, String portatil_modelo) throws Exception {
		try {
			portatilRepository.editPortatil(portatil_id, portatil_marca, portatil_modelo);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al editar el portatil seleccionado: " + e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = { Exception.class }, timeout = 10)
	@Override
	public void eliminarPortatilPorId(long portatil_id) throws Exception {
		try {
			portatilRepository.deleteByIdPortatil(portatil_id);
			
		} catch (Exception e) {
			System.out.println("\n[ERROR] - Error al eliminar el portatil seleccionado: " + e);
		}
	}
}
```

# 8. Controllers



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

# Errores

## org.springframework.web.context.ContextLoaderListener

### Explicación y Solución --> Opción 1

https://www.java67.com/2015/06/org.Springframework.Web.Context.ContextLoaderListener.html

### Explicación y Solución --> Opción 2

https://www.javamexico.org/foros/java_standard_edition/javalangclassnotfoundexception_web_service