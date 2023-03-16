package atividaade_java;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salariob,adicional,horae,desconto,salarioliq;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu salário bruto: ");
		salariob = leia.nextFloat();
		
		System.out.println("\nDigite o seu adicional noturno: ");
		adicional = leia.nextFloat();
		
		System.out.println("\nDigite o valor em horas extras: ");
		horae = leia.nextFloat();
		
		System.out.println("\nDigite os descontos: ");
		desconto = leia.nextFloat();
		
		salarioliq = ( salariob+adicional+(horae*5)-desconto);
		
		System.out.println("\nSeu salário líquido é: " + salarioliq);
		

	}

}
