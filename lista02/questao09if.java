package lista02;

public class questao09if {

	public static void main(String[] args) {

	String operacao = "soma";
	int x,y;
	x = 100;
	y = 50;
	if(operacao == "soma") {
		System.out.println(x+y);	
	}//fim primeiro if
	if(operacao == "subtração") {
		System.out.println(x-y);
	}//fim segundo if
	if(operacao == "multiplicação") {
		System.out.println(x*y);
	}//fim terceiro if 
	if(operacao == "divisão") {
		System.out.println(x/y);
	}// fim quarto if
	
	}//fim main

}//fim class
