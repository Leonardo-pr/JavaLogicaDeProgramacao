package vetores;

import java.util.Scanner;

public class vetor04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[]par = new int[10];
		int[]impar = new int[10];
		int indexPar,indexImpar;
		indexPar=indexImpar=0;
		int[]valor = new int[10];
		for(int x=0;x<10;x++) {
			System.out.println("Número:" );
			valor[x] = ler.nextInt();
		}//fim for leitura
		for(int x = 0;x < 10;x++) {
			if(x%2==0) {
				par[indexPar] = valor[x];
				indexPar++;
			}else {
				impar[indexImpar] = valor[x];
				indexImpar++;
			}//fim if e else par ou impar
		}//fim for par ou impar
		for(int x = 0; x < 10;x++) {
			System.out.println("["+x+"]: "+valor[x]);
				
		}//fim for exibir
		for(int x = 0; x < indexPar;x++) {
			System.out.print("Par ["+x+"]"+valor[x]);
		}//fim for par
		for(int x = 0; x<indexImpar;x++) {
			System.out.print("Impar ["+x+"]"+valor[x]);
		}
	}//fim main

}//fim class
