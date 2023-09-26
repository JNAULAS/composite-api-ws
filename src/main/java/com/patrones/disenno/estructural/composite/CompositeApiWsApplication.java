package com.patrones.disenno.estructural.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.patrones.disenno.estructural.composite.model")
public class CompositeApiWsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CompositeApiWsApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CompositeApiWsApplication.class);
	}

}
