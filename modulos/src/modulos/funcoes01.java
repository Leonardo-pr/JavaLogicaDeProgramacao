package modulos;

import java.util.Scanner;

public class funcoes01 {
	public static int somar(int n1,int n2) {
		 int soma;
		 soma = n1 + n2;
		 return soma;
	 }//fim somar
	public static int subtracao(int n1, int n2) {
		int menos;
		return menos = n1-n2;
	}//fim subtração
	public static int multiplicacao(int n1, int n2) {
		int vezes;
		return vezes = n1*n2;
	}// fim multplicação
	public static double divisao(int n1, int n2) {
		double dividi;
		return dividi = n1/n2;
	}
	public static int lerNr() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro:");
		return ler.nextInt();
	}//fim lerNr
	public static void main(String[] args) {
		int nr1,nr2;
		double dividi;
		int soma,menos,vezes;
		nr1 = lerNr();
		nr2 = lerNr();
		soma = somar(nr1,nr2);
		menos = subtracao(nr1, nr2);
		vezes = multiplicacao(nr1, nr2);
		dividi = divisao(nr1, nr2);
		System.out.println("A soma é: "+soma);
		System.out.println("A subtração é: "+menos);
		System.out.println("A multiplicação é: "+vezes);
		System.out.println("A divisão é: "+dividi);
	}//fim main

}//fim class
