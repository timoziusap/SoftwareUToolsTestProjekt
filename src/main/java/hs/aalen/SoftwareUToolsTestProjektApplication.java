package hs.aalen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Hello world
@SpringBootApplication
public class SoftwareUToolsTestProjektApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareUToolsTestProjektApplication.class, args);
		methods t = new methods();
		t.schreiben();
		
	}

}