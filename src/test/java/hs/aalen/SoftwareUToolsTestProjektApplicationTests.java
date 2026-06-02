package hs.aalen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoftwareUToolsTestProjektApplicationTests {

	@Test
	void contextLoads() {
	}
	
	methods t = new methods();
	
	@Test
	public void Test1() {
		t.schreiben();
	}
	/*@Test
	public void Test2() {
		assertEquals(1, 2);
	}*/
	

}
