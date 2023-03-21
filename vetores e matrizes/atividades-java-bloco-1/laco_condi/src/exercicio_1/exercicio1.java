package exercicio_1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		float n1,n2,n3,res;
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextFloat();
		
		res = n1+n2;
		
		System.out.println("\nO resultado da soma é: " + res);
		
		if (res>n3) {
			
			System.out.println("\nO resultado é maior que: " + n3);
		}
		else if (res==n3) {
			
		System.out.println("\nO resultado é igual a:" + n3);
		}
		
		else {
			
			System.out.println("\nO resultado é menor que: ");
			
		}
		

	}

}
