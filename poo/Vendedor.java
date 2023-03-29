package poo_orientação_objetos;

public class Vendedor extends funcionario {
	private int filhos;

	public Vendedor(String nome, int idade, String cargo, String unidade, String salario, int filhos) {
		super(nome, idade, cargo, unidade, salario);
		this.filhos = filhos;
	}

	public int getFilhos() {
		return filhos;
	}

	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}

	public void visualizar() {
		System.out.println("\nO nome do vendedor é:" + getNome() + "\ne a idade é: " + getIdade() + "\no cargo é:"
				+ getCargo() + "\na unidade é:" + getUnidade() + "\nsalário:" + getSalario() + "\nquantidade de filhos:"
				+ filhos);
	}

}
