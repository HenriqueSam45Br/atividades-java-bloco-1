package poo_orientação_objetos;

public class Gerente extends funcionario {

	private float ra;

	public Gerente(String nome, int idade, String cargo, String unidade, String salario, float ra) {
		super(nome, idade, cargo, unidade, salario);
		this.ra = ra;
	}

	public float getRa() {
		return ra;
	}

	public void setRa(float ra) {
		this.ra = ra;
	}

	public void visualizar() {

		System.out.println("\nNome do gerente:" + getNome() + "\nidade:" + getIdade() + "\ncargo:" + getCargo()
				+ "\nunidade:" + getUnidade() + "\nsalario:" + getSalario() + "\nra:" + ra);
	}
}