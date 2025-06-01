package lista05_JAVA;

import java.util.Scanner;

public class E08_Idade {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é sua idade:");
		int dado = sc.nextInt();
		int idade = 0;
		
		if (dado >= 0 && dado <= 13) {
			idade = 1;
		}
		else if (dado > 13 && dado < 18) {
			idade = 2;
		}
		else if (dado > 18 && dado < 50) {
			idade = 3;
		}
		else if (dado >= 50 && dado <= 150) {
			idade = 4;
		}
		else {
			System.out.println("Você é um dinossauro.");
		}
		
		switch (idade) {
		case 1:
			System.out.println("Você é uma criança.");
			break;
		case 2:
			System.out.println("Você é um adolescente.");
			break;
		case 3:
			System.out.println("Você é adulto.");
			break;
		case 4:
			System.out.println("Você é idoso.");
			break;
		}
		sc.close();
	}
}
