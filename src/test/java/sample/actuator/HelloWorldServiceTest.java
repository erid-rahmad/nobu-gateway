package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import sample.actuator.sample.HelloWorldService;

public class HelloWorldServiceTest {

	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Spring boot says hello from a Docker container",helloWorldService.getHelloMessage());
	}
	
}
