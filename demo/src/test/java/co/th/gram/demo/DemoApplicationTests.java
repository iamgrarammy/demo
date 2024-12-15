package co.th.gram.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("JohnDoe", "John " + "Doe");
	}

}
