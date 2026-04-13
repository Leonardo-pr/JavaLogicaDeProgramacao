package lista04;

public class questao01 {

	public static void main(String[] args) {
		int[]q1 = new int[10];
		int aux = 10;
		for(int i = 0; i<10; i++) {
			q1[i] = aux;
			aux = aux +10;//mesma coisa que aux+=10
		}//fim for
		for(int i = 0; i<10; i++) {
		System.out.print("["+q1[i]+"]");
		}//fim for
	}//fim main

}//fim class
