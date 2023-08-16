package com.youtube.LogReg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class LogRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogRegApplication.class, args);
	}

}
