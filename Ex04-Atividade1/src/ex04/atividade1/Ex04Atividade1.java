package ex04.atividade1;
import java.util.Scanner;

public class Ex04Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int not1, not2, media;
		
		System.out.println("Insira a primeira nota: ");
		not1 = sc.nextInt();
		System.out.println("Insira a segunda nota: ");
		not2 = sc.nextInt();
		
		media = (not1 + not2) / 2;
		
		if (media >= 7 ) {
			System.out.println("Aprovado");
		} else {
		
		System.out.println("Reprovado");
                
                
        }
    }    
}



