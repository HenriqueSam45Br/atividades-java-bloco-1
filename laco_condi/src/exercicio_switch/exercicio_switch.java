package exercicio_switch;

import java.util.Scanner;

public class exercicio_switch {

	public static void main(String[] args) {
		
		float din, saque, saldo = 1000,deposito;
		int i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscolha uma opção: ");
		
		System.out.println("\n1-Saldo");
		
		System.out.println("\n2-Saque");
		
		System.out.println("\n3-Depósito");
		
		i = leia.nextInt();
		
		switch (i) {
		
		case 1:
			
			System.out.printf("\nSeu saldo é: %.2f ", saldo );
			break;
			
		case 2:
			
			System.out.printf("\nSeu saldo é: %.2f ", saldo );
			System.out.printf("\nSaque o valor desejado");
			saque = leia.nextFloat();
			
			if (saque>saldo) {
				
				System.out.println("\nSeu saldo é insuficiente: ");
			
			
			} else {
				
				din = saldo-saque;
				
				System.out.printf("\nSeu saldo novo é: %.2f" , din);
			} break;
			
		case 3:
			
			System.out.println("\nDeposite o valor desejado: ");
			deposito = leia.nextFloat();
			
			din = saldo + deposito;
			
			System.out.printf("\nSeu saldo novo é:%.2f " , din);
			break;
			
			default:
				
				System.out.println("\nOperação inválida!");
		
		}
		
			
		
		

	}

}
