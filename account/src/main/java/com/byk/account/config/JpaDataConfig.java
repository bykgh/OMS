package com.byk.account.config;

import com.byk.account.dao.SysUserDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring jap 配置
 * @author yikai.bi
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackageClasses = SysUserDao.class,
        entityManagerFactoryRef = "springCloudDemoEntityManagerFactory",
        transactionManagerRef = "springCloudDemoTransactionManager"
)
public class JpaDataConfig {
}
