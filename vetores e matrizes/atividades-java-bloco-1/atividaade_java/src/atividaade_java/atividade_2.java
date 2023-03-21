package atividaade_java;

import java.util.Scanner;

public class atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1,nota2,nota3,nota4,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\n Entre com a segunda nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nEntre com a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua média é de: " + media %.2f );
		
	}

}
