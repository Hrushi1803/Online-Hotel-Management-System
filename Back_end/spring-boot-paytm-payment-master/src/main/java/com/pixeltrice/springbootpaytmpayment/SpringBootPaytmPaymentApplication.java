package com.pixeltrice.springbootpaytmpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootPaytmPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPaytmPaymentApplication.class, args);
	}

}
