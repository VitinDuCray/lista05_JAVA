package lista05_JAVA;

import java.util.Scanner;

public class E04_AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano:");
		int ano = sc.nextInt();
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println("O ano é bissexto.");
		}
		else {
			System.out.println("O ano é comum.");
		}
		
		sc.close();
	}

}
