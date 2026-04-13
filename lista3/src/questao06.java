

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x=1,soma=-1;
		while(x != 0) {
			soma = soma + x;
			System.out.println("se colocar o número 0 ele para: ");
			x = ler.nextInt();
		}//fim while
		System.out.println("A soma foi: "+soma);
	}//fim main

}//fim class
