package mx.gob.senasica.quetetraes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@ComponentScan(basePackages = { "mx.gob.senasica.quetetraes.*" })
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "mx.gob.senasica.quetetraes.*" })
@EntityScan(basePackages = { "mx.gob.senasica.quetetraes.*" })

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
