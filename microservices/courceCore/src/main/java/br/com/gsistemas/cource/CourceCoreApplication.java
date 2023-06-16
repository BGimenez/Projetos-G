package br.com.gsistemas.cource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.gsistemas.core.model"})
@EnableJpaRepositories({"br.com.gsistemas.core.repository"})
public class CourceCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceCoreApplication.class, args);
	}

}
