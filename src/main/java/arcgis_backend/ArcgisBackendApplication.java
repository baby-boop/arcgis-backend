package arcgis_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ArcgisBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ArcgisBackendApplication.class, args);
	}


}
