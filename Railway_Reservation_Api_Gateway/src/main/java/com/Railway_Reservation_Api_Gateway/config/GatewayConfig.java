package com.Railway_Reservation_Api_Gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig
{
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/user/allusers")
                        .uri("http://localhost:8082"))
		       .build();
	}

}
