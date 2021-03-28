package delta.administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"delta.administration.client"})
public class AdministrationApplication {


	public static void main(String[] args) {
		SpringApplication.run(AdministrationApplication.class, args);
	}

}
