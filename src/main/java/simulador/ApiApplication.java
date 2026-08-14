package simulador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        // Isso liga o servidor web automaticamente na porta 8080
        SpringApplication.run(ApiApplication.class, args);
    }
}