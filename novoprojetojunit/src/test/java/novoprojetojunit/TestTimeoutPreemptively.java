package novoprojetojunit;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exemploTimeout.Mensageiro;

class TestTimeoutPreemptively {

	@Test
	void testarTimeoutPreemptively() {
		assertTimeoutPreemptively(ofSeconds(3), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Esta é a mensagem 1!");
				});
	}
	
	@Test
	void testarTimeoutPreemptively2() {
		assertTimeoutPreemptively(ofSeconds(7), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Esta é a mensagem 2!");
				});
	}

}
