package lista02;

public class questao09 {

	public static void main(String[] args) {

		int x,y;
		x = 40;
		y = 80;
		String operacao = "subtração";
		switch(operacao) {
		case "soma":
			System.out.println(x+y);
		break;
		case "subtração":
			System.out.println(x-y);
		break;
		case "multiplicação":
			System.out.println(x*y);
		break;
		case "divisão":
			System.out.println(x/y);
		break;
		default:
			System.out.println("conta inválida");
		}//fim switch
	}//fim main

}//fim class
