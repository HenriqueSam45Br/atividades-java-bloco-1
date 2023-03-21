package cond_while;

import java.util.Scanner;

public class cond_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2 = 0, n3 = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite a idade: ");
		n1 = leia.nextInt();

		while (n1 >= 0) {
			if (n1 <= 21) {

				n2++;
			} else if (n1 >= 50) {

				n3++; 

			}
			System.out.println("\nDigite a idade: ");
			n1 = leia.nextInt();

		}
		System.out.println("\nO numero de pessoas com idade menor ou igual a 21 anos é: " + n2);
		System.out.println("\nO número de pessoas com idade maior ou igual a 50 anos é " + n3);

	}

}
