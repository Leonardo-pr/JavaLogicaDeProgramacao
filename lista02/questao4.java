package lista02;

public class questao4 {

	public static void main(String[] args) {

		String nome = "Leonardo";
		System.out.println(nome);
		double M, F, x;
		F = 2;
		M = 1;
		x = 1;
		if(F==x) {
		System.out.println("mulheres ganham desconto de 13 %: "+ F);
		F = 230%13;
		}//fim if
		else {
			System.out.println("homens ganham desconto de 5%: "+ M);
			M = 230&5;
		}//fim else
		
	}//fim main

}//fim class
