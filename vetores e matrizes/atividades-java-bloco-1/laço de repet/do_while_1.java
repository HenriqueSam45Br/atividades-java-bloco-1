package do_while_1;

import java.util.Scanner;

public class do_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int Num1, pos1 = 0;

	        Scanner leia = new Scanner(System.in);

	        do {
	            System.out.println("\nDigite um número:" );
	            Num1 = leia.nextInt();
	            
	            if(Num1 >= 0)
	             Num1 += pos1;

	        }while(Num1 != 0);
	        System.out.println("\nA soma dos numeros positivos é "+pos1);

		

	}

}
