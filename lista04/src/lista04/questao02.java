package lista04;

public class questao02 {

	public static void main(String[] args) {
		int[] x = new int[10];
		int aux = 10;
		for(int i = 0; i < 10; i++) {
			x[i] = aux;
			aux = aux-1;//mesma coisa que aux--
		}//fim for preenchimento
		for(int i = 0; i < 10; i++) {
			System.out.print("["+x[i]+"]");
		}
	}//fim main

}//fim class
