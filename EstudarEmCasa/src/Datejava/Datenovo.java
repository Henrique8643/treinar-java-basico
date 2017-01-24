package Datejava;

import java.time.Duration;
import java.time.Instant;
// Como executar datas em java 8; 
public class Datenovo {
	public static void main(String[] args) {
		
		Instant agora = Instant.now();
		for (int i = 0; i < 1000; i++) {
			
			System.out.println();
			
		}
		Instant depois = Instant.now();
		
		Duration duracao = Duration.between(agora, depois);
		
		System.out.println(duracao.toMillis());
		System.out.println(duracao.toNanos());
		System.out.println(duracao.toMinutes());
		System.out.println(duracao.toHours());
	}
	
	

}
