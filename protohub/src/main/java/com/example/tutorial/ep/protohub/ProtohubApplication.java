package com.example.tutorial.ep.protohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.tutorial.ep.protohub.component.Googlepay;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.example.tutorial.ep.protohub")

@SpringBootApplication
public class ProtohubApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProtohubApplication.class, args);
		Googlepay googlepay = context.getBean(Googlepay.class);
		System.out.println(googlepay.getAPIInfo());
	}

}
