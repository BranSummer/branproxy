package org.bran.branproxy.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author lizhle
 */
@Configuration
public class DataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.c3p0")
    public DataSource createDataSource() {
        // 创建数据源构建对象
        return DataSourceBuilder.create()
                // 设置数据源类型
                .type(ComboPooledDataSource.class)
                .build();
    }
}
