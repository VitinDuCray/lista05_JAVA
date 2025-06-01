package lista05_JAVA;

import java.util.Scanner;

public class E06_ParidadeEPositividade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}

		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é zero.");
		}

		sc.close();
	}
}
