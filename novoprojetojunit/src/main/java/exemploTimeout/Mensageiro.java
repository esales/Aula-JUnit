package exemploTimeout;

public class Mensageiro {
	
	public Mensageiro() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Esta é a mensagem!");	
	}
}
