package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofSeconds;
import org.junit.jupiter.api.Test;

class TestTimeout {

	@Test
	void testarTimeout() {
		assertTimeout(ofSeconds(3), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Esta é a mensagem 1!");
				});
	}
	
	@Test
	void testarTimeout2() {
		assertTimeout(ofSeconds(7), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Esta é a mensagem 2!");
				});
	}
}