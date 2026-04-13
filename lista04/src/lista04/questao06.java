package lista04;

import java.util.Random;

public class questao06 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int contadorPar=0,contadorImpar=0;
		int[]numero = new int[10];
		for(int x = 0; x < 10; x++) {
			numero[x] = aleatorio.nextInt(10);
			if(numero[x]%2 == 0) {
				contadorPar++;
			}//fim if par
			if(numero[x]%2!=0) {
				contadorImpar++;
			}//fim if impar
		}//fim for preenchimento
		for(int x = 0; x < 10; x++) {
			System.out.println("Números ["+numero[x]+"]");
		}//fim for exibir
			System.out.println("Números Impares: "+contadorImpar);
			System.out.println("Números Pares: "+contadorPar);
	}//fim main

}//fim class
