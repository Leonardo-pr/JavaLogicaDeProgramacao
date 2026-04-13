package lista02;

public class questao04 {

	public static void main(String[] args) {
		String nome = "Leonardo";
		System.out.println(nome);
		double M, F, x, u, o;
		F = 2;
		M = 1;
		x = 2 ;
		o = 100-(100*0.13);
		u = 100-(100*0.05);
		if(F==x) {
		System.out.println("mulheres ganham desconto de 13 %: "+ o);
		
		}//fim if
		else {
			System.out.println("homens ganham desconto de 5%: "+ u);
		}//fim else
		
	}//fim main

}//fim class

