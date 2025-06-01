package lista05_JAVA;

import java.util.Scanner;

public class E07_NotaConceito {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        int notatotal = sc.nextInt();
        
        int nota = 0;

        if (notatotal >= 0 && notatotal < 20) {
            nota = 1;
        }
        else if (notatotal >= 20 && notatotal < 40) {
            nota = 2;
        }
        else if (notatotal >= 40 && notatotal < 60) {
            nota = 3;
        }
        else if (notatotal >= 60 && notatotal < 80) {
            nota = 4;
        }
        else if (notatotal >= 80 && notatotal < 100) {
            nota = 5;
        }
        else {
            System.out.println("Nota inválida.");
            sc.close();
        }
        
        switch (nota) {
            case 1: 
                System.out.println("E");
                break;
            case 2: 
                System.out.println("D");
                break;
            case 3: 
                System.out.println("C");
                break;
            case 4: 
                System.out.println("B");
                break;
            case 5: 
                System.out.println("A");
                break;
            default:
                System.out.println("Nota inválida.");
                break;
        }
        sc.close();
    }
}
