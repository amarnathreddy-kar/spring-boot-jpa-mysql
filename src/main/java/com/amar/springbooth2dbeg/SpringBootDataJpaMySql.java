package com.amar.springbooth2dbeg;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootDataJpaMySql {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMySql.class, args);
	}

}
