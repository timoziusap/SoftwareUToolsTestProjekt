package hs.aalen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SoftwareUToolsTestProjektApplication {

	//Push v. Passi
	public static void main(String[] args) {
		SpringApplication.run(SoftwareUToolsTestProjektApplication.class, args);
		methods t = new methods();
		t.schreiben();
	//Hallo Welt
	}

}