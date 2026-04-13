package lista04;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[]nome = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o seu nome:");
			nome[i] = ler.next();
		}//fim for preenchimento
		for(int i = 4; i >= 0; i--) {
			System.out.println("["+i+"]: "+nome[i]);
		}//fim for exibir
	}//fim main

}//fim class
