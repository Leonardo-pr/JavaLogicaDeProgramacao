package lista04;

import java.util.Random;

public class questao04 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[]numero = new int[7];
		for(int x = 0; x < 7; x++) {
			numero[x]=aleatorio.nextInt(10);
		}//fim for preenchimento
		for(int x = 0; x < 7; x++) {
			System.out.println("["+x+"]: "+numero[x]);
		}//fim for exibir
	}//fim main

}//fim class
