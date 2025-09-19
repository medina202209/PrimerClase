package uniremington.PrimerClase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraClaseJavaSpringbootApplication {

	// ./mvnw spring-boot:run ejecuta el proyecto
	// ./mnvw.cmd clean package -DskipTests empaqueta el proyecto

	public static void main(String[] args) {
		SpringApplication.run(PrimeraClaseJavaSpringbootApplication.class, args);
	}

}