package lista04;

public class questao03 {

	public static void main(String[] args) {
		int[]x = new int[10];
		int aux = 1;
		for(int i = 0; i < 10; i++) {
			x[i] = aux;
			if(aux < 2) {
				aux = 2;
			}else{
				aux = 1;
			}//fim if/else
		}//fim for preenchimento
		for(int i = 0; i < 10; i++) {
		System.out.print("["+x[i]+"]");
		}//fim for exibir
	}//fim main

}//fim class