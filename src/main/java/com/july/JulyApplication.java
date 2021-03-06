package com.july;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableOAuth2Sso
@EnableScheduling
public class JulyApplication {

    private static final Logger logger = LoggerFactory.getLogger(JulyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JulyApplication.class, args);
        logger.info("July Web Service is Running !");
	}

}
