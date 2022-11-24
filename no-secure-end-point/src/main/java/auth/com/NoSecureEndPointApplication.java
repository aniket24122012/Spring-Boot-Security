package auth.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoSecureEndPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoSecureEndPointApplication.class, args);
	}

}
