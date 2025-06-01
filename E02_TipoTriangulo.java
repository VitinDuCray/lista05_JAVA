package lista05_JAVA;

import java.util.Scanner;

public class E02_TipoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1° lado:");
		int lado1 = sc.nextInt();
		System.out.println("Digite o 2° lado:");
		int lado2 = sc.nextInt();
		System.out.println("Digite o 3° lado:");
		int lado3 = sc.nextInt();
		int triangulo = 0;
		
		if (lado1 == lado2 && lado2 == lado3) {
			triangulo = 1;
		}
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			triangulo = 2;
		}
		else {
			triangulo = 3;
		}
		
		switch (triangulo) {
		case 1:
			System.out.println("O triangulo é equilátero.");
			break;
		case 2:
			System.out.println("O triângulo é isósceles.");
			break;
		case 3:
			System.out.println("O triângulo é escaleno.");
			break;
		}
		sc.close();
	}
}
