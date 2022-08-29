package com.amar.springbooth2dbeg;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEncryptableProperties
@EnableSwagger2
public class SpringBootDataJpaMySql {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMySql.class, args);
	}

}
