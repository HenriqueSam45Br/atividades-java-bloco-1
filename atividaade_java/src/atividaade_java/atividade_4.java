package atividaade_java;

import java.util.Scanner;

public class atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1,num2,num3,num4,diferença;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.print("\nDigite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		num3 = leia.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		num4 = leia.nextFloat();
		
		diferença = ((num1*num2)-(num3*num4));
		
		System.out.println("\nA diferença dos números digitados é: " + diferença);
	
	}

}
