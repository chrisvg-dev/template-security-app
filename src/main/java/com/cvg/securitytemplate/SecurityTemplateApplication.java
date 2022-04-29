package com.cvg.securitytemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
public class SecurityTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityTemplateApplication.class, args);
	}

}
