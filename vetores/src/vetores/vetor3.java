package vetores;

import java.util.Scanner;

public class vetor3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[]idade = new int[5];
		String[]nome = new String[5];
		int maior18=0;
		for(int x = 0;x<5;x++) {
			System.out.println("Coloque seu nome:");
			nome[x] = ler.next();
			System.out.println("Coloque sua idade:");
			idade[x] = ler.nextInt();
			if(idade[x]>=18) {
				maior18++;
			}//fim if
		}//fim for leitura
		System.out.println("foram lidas "+maior18+" idades maiores que 18");
		for(int x = 0;x<5;x++) {
			if(idade[x]>=18) {
				System.out.println("Nome: "+nome[x]);
				System.out.println("Idade: "+idade[x]);
			}//fim if
		}//fim for exibir
	}//fim main

}//fim class
