package br.com.notlinoel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDesignPatternApplication.class, args);
	}

}
