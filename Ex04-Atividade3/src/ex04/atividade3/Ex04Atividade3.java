
package ex04.atividade3;

import java.util.Scanner;

public class Ex04Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3, media;
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextInt();
                 
        
            if(nota1 < 0 && nota1 > 10)
            System.out.println("Nota 1 não é um valor valido");
        else if(nota2 < 0 && nota2 > 10)
            System.out.println("Nota 2 não é um valor valido");
        else if(nota3 < 0 && nota3 > 10)
            System.out.println("Nota 3 não é um valor valido");
        else{
            media = (nota1 + nota2 + nota3)/3;
            if(media >= 0 && media < 3)
                System.out.println("Reprovado");
            else if(media >= 3 && media < 7)
                System.out.println("Exame");
            else
                System.out.println("Reprovado");
            break;
        
        }
        
            
        
    }
    
}
