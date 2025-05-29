package lista05;

import java.util.Scanner;

public class E09_Sinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("Seu número é zero.");
		}
		else if (numero > 0) {
			System.out.println("Seu número é positivo.");
		}
		else {
			System.out.println("Seu número é negativo.");
		}
		
		sc.close();
	}

}
