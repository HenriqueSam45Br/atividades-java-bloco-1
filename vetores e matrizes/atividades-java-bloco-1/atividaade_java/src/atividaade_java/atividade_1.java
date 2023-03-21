package atividaade_java;

import java.util.Scanner;

public class atividade_java140323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario1, abono, reajuste;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: ");
		salario1 = leia.nextFloat();
		
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		reajuste = (salario1+abono);
		
		System.out.println("Seu novo salário é: " + reajuste %.2f );
		

	}

}
