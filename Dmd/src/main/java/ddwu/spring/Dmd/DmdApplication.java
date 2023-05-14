package ddwu.spring.Dmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class DmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmdApplication.class, args);
		
		System.out.println("test");
	}
}
