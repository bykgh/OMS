package com.byk.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class GetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetewayApplication.class, args);
    }

    /**
     * 网关路由
     * 此处配置为由网关自动发现服务
     * @param builder
     * @return
     */
   /*
   @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("portal", r -> r.path("/portal/{segment}")
                        .filters(f -> f.setPath("/{segment}"))
                        .uri("lb://portal"))
                .build();
    }
    */

}
