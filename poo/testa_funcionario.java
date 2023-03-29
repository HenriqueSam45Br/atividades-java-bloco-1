package poo_orientação_objetos;

public class testa_funcionario {

	public static void main(String[] args) {

		funcionario num1 = new funcionario("Analia", 58, " Desenvolvedora Sênior ", " São Paulo ", "15.000");
		num1.visualizar();

		System.out.println("\n ");

		funcionario num2 = new funcionario("Miguel", 53, "Gerente de RH", " São Paulo ", "12.000");
		num2.visualizar();

		Vendedor v1 = new Vendedor("\n heitor", 34, "vendedor", "campinas", "2.500", 1);

		Gerente g1 = new Gerente("\n silvana", 24, "gerente", "são bernardo do campo", "4.700", 40028922);

		v1.visualizar();

		g1.visualizar();
	}

}