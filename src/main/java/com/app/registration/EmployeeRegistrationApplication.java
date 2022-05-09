package com.app.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//public class EmployeeRegistrationApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(EmployeeRegistrationApplication.class, args);
//	}
//}

@SpringBootApplication
@ComponentScan(basePackages={"com.employee.*"})
public class EmployeeRegistrationApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmployeeRegistrationApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationApplication.class, args);
	}
}
