package dataconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * DataConfiguration class is responsible for setting up the configuration related to the database connection and JPA vendor.
 * It configures the DataSource and JpaVendorAdapter beans necessary for connecting to the database 
 * and integrating with JPA using Hibernate.
 *
 * This configuration can be reused for applications that need to connect to a MySQL database 
 * with Hibernate as the JPA provider.
 * 
 * Example Usage:
 *  - This configuration can be added to any Spring Boot application to enable connection to a MySQL database 
 *    using Hibernate for JPA functionalities.
 *
 * @author Augusto Winkler
 * @version 1.0
 * @since 2025-03-21
 */
@Configuration
public class SpringDataConfiguration {

    /**
     * Configures the DataSource bean that will be used for database connection.
     * 
     * @return a configured DataSource for connecting to a MySQL database.
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        // Setting the MySQL JDBC driver
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        // URL of the MySQL database (replace with your own database details)
        dataSource.setUrl("jdbc:mysql://localhost:3306/appLogin?useTimeZone=true&serverTimezone=UTC");
        
        // Database username (replace with your own database credentials)
        dataSource.setUsername("root");
        
        // Database password (replace with your own database credentials)
        dataSource.setPassword("");
        
        return dataSource;
    }

    /**
     * Configures the JPA vendor adapter for Hibernate.
     * The JpaVendorAdapter sets up Hibernate-specific configuration for JPA.
     * 
     * @return a HibernateJpaVendorAdapter with custom settings.
     */
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        
        // Set the database to MySQL
        adapter.setDatabase(org.springframework.orm.jpa.vendor.Database.MYSQL);
        
        // Enable SQL logging to console for debugging purposes
        adapter.setShowSql(true);
        
        // Generate DDL (Database Definition Language) for automatic schema generation (create/drop tables)
        adapter.setGenerateDdl(true);
        
        // Set the Hibernate dialect for MySQL. Use the MariaDB dialect to match MySQL
        adapter.setDatabasePlatform("org.hibernate.dialect.MariaDBDialect");
        
        // Prepare connections for efficient reuse (reduces connection overhead)
        adapter.setPrepareConnection(true);
        
        return adapter;
    }
}
