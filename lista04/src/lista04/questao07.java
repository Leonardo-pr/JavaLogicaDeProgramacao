package lista04;

import java.util.Random;

public class questao07 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[]numero = new int[10];
		int soma = 0;
		int maiorValor=0, menorValor=0;
		double media = 0;
		for(int x = 0; x < 10; x++) {
			numero[x] = aleatorio.nextInt(10)+1;
			System.out.println("números: "+numero[x]);
			soma+=numero[x];
			if(numero[x]>maiorValor) {
				maiorValor = numero[x];
			}//fim if maior
			if(x == 0) {
				menorValor = numero[x];
			}//fim if menor
			else if(numero[x]<menorValor) {
				menorValor = numero[x];
			}//fim else if
		}//fim for preenchimento
		media = soma/10;
		System.out.println("soma: "+soma);
		System.out.println("media: "+media);
		System.out.println("Maior valor: "+maiorValor);
		System.out.println("Menor valor: "+menorValor);
	}//fim main

}//fim class
