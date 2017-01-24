package Datejava;

import java.util.Scanner;

public class TesteException {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o dia do seu nascimento :");
		Integer dia = null;
		
		try {
			dia = leitor.nextInt();
			leitor.close();
			System.out.println("Você nasceu dia : " + dia);
		} catch (Exception e) {
			
		}
	}

}
