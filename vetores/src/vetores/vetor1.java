package vetores;

import java.util.Scanner;

public class vetor1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String[]animais;
		animais = new String[5];
		animais[0] = "cachorro";
		animais[1] = "gato";
		animais[2] = "coelho";
		animais[3] = "vaca";
		animais[4] = "cavalo";
		
		for(int x = 0;x < 5;x++) {
			System.out.println(animais[x]);
		}//fim primeiro vetor
		String[] pais = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("País: ");
			pais[i] = ler.next();	
		}
	}//fim main

}//fim class
