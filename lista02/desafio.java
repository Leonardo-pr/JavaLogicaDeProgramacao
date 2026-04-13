package lista02;

public class desafio {

	public static void main(String[] args) {
		int salario, emprestimo;
		salario = 1000;
		emprestimo = 10000;
		double prestacaoMes = emprestimo*0.30;
		
		if(salario>prestacaoMes) {
			System.out.println("aprovado");
		}//fim if mês
		else {
			System.out.println("negado");
		}//else mês
	}//fim main

}//fim class
