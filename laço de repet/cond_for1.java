package cond_for;

import java.util.Scanner;

public class cond_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, n1, n2;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("\nDigite o segundo número menor que o anterior: ");
		n2 = leia.nextInt();

		if (n1 < n2) {
			for (x = n1; x <= n2; x++) {

				if (x % 3 == 0 && x % 5 == 0) {

					System.out.println("\nO número " + x + " é multiplo de 3 e 5");
				}

			}
		} else {
			System.out.println("\nO intervalo é inválido! ");

		}
	}
}
