package com.amar.springbooth2dbeg;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootH2DbEgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DbEgApplication.class, args);
	}

}
