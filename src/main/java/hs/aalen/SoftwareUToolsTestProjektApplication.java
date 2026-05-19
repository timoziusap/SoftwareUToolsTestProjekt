package hs.aalen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SoftwareUToolsTestProjektApplication {
//Hey das hier ist die erste änderung Grüße Timo
//Moin Leute
	//Push v. Passi
	public static void main(String[] args) {
		SpringApplication.run(SoftwareUToolsTestProjektApplication.class, args);
		methods t = new methods();
		t.schreiben();
	}

}
