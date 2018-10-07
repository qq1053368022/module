package com.xull;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-26 8:27
 */
@Configuration
@Slf4j
public class DataSourceConfig {

    @Primary//配置该数据源为主数据源
    @Bean(name = "userDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSourceProperties userDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Primary//配置该数据源为主数据源
    @Bean(name = "userDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSource userDataSource(DataSourceProperties userDataSourceProperties) {
        return userDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean(name = "bookDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSourceProperties bookDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean(name = "bookDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSource bookDataSource(DataSourceProperties bookDataSourceProperties) {
        return bookDataSourceProperties.initializeDataSourceBuilder().build();
    }
}
