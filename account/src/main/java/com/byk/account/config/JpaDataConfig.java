package com.byk.account.config;

import com.byk.account.dao.UserDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackageClasses = UserDao.class,
        entityManagerFactoryRef = "omsEntityManagerFactory",
        transactionManagerRef = "omsTransactionManager"
)
public class JpaDataConfig {
}
