package lista05_JAVA;

import java.util.Scanner;

public class E01_NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		boolean primo = true;

		if (numero <= 1) {
			primo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if (primo) {
			System.out.println("O número é primo.");
		}
		else {
			System.out.println("O número não é primo.");
		}
		
		sc.close();
	}

}

