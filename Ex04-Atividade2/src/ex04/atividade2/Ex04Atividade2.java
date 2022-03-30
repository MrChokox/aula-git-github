
package ex04.atividade2;

import java.util.Scanner;

public class Ex04Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int lad1, lad2, lad3;
		
		System.out.println("Envie o valor do primeiro lado: ");
        lad1 = sc.nextInt();
        System.out.println("Envie o valor do segundo lado: ");
        lad2 = sc.nextInt();
        System.out.println("Envie o valor do terceiro lado: ");
        lad3 = sc.nextInt();
        
        if (lad1 == lad2 && lad2 == lad3) {
        	System.out.println("Equilátero");
        }
        else if (lad1 == lad2 || lad1 == lad3 || lad2 == lad3) {
        	System.out.println("Isósceles");
        }
        else {
        	System.out.println("Escaleno");
        }
    }
    
}
