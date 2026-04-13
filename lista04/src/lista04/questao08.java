package lista04;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nome = new String[6];
		String[] sexo = new String[6];
		double[] salario = new double[6];
		int contadorMasculino = 0, contadorFeminino = 0;
		double media = 0;
		double maiorValor = 0, menorValor = 0;
		double maiorValor2 = 0, menorValor2 = 0;
		boolean primeiraMulher = true;
		for (int x = 0; x < 6; x++) {
			System.out.println("Nome:");
			nome[x] = ler.next();
			System.out.println("sexo:");
			sexo[x] = ler.next();
			System.out.println("Salário:");
			salario[x] = ler.nextInt();
			if (sexo[x].equals("m")) {
				contadorMasculino++;
			} // fim if contadorMasculino
			if (sexo[x].equals("f")) {
				contadorFeminino++;
			} // fim if contadorFeminino
			if (sexo[x].equals("m") && salario[x] > maiorValor) {
				maiorValor = salario[x];
			} // fim if salario homens

			if (sexo[x].equals("f")) {
				if (primeiraMulher) {
					menorValor = salario[x];
					primeiraMulher = false;
				}//fim if primeiraMulher
				else if (salario[x] < menorValor) {
					menorValor = salario[x];
				}//fim else if primeiraMulher 

			} // fim if menor
			else if (salario[x] < menorValor && sexo[x].equals("f")) {
				menorValor = salario[x];
			} // fim else if salario mulheres

			if (salario[x] > maiorValor2) {
				maiorValor2 = salario[x];
			} // fim if salario geral
			if (x == 0) {
				menorValor2 = salario[x];
			}//fim if partida menor
			if (salario[x] < menorValor2) {
				menorValor2 = salario[x];
			}//fim if menor salário geral

			media += salario[x];
			media = media / 6;
		} // fim for preenchimento
		System.out.println("Quantidade de homens:" + contadorMasculino);
		System.out.println("Quantidade de mulheres:" + contadorFeminino);
		System.out.println("media:" + media);
		System.out.println("Maior salário entre os homens: " + maiorValor);
		System.out.println("Menor salário entre as mulheres: " + menorValor);
		System.out.println("Maior salário dos funcionarios: " + maiorValor2);
		System.out.println("Menor salário dos funcionarios: " + menorValor2);
	}// fim main

}// fim class
