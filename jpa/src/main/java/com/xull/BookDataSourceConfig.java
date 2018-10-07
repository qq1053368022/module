package com.xull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-26 9:10
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "bookEntityManagerFactory",
        transactionManagerRef = "bookTransactionManager",
        basePackages = {"com.xull.base","com.xull.book" })
public class BookDataSourceConfig {

    @Autowired
    @Qualifier("bookDataSource")
    private DataSource bookDataSource;

    @Bean(name = "bookEntityManager")
    public EntityManager bookEntityManager(EntityManagerFactoryBuilder builder) {
        return bookEntityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean(name = "bookEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean bookEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(bookDataSource)
                .properties(getVendorProperties())
                .packages("com.xull.base", "com.xull.book")
                .persistenceUnit("sysBookPersistenceUnit")
                .build();
    }



    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties() {
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }


    @Bean(name = "bookTransactionManager")
    public PlatformTransactionManager bookTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(bookEntityManagerFactory(builder).getObject());
    }

}
