package lista02;

public class questao08if {

	public static void main(String[] args) {
		int cod = 104;
		if(cod==100) {
			System.out.println("doguinho custa 3 reais");
		}//fim primeiro if
		if(cod==101) {
			System.out.println("dogão custa 5,50 reais");
		}//fim segundoif
		if(cod==102) {
			System.out.println("pão com ovo custa 3,30 reais");
		}//fim terceiro if
		if(cod==103) {
			System.out.println("hamburguer custa 5,60 reais");
		}//fim quarto if
		if(cod==104) {
			System.out.println("refrigerante custa 4,60 reais");
		}//fim quinto if
		else if(cod>=105 || cod<=99) {
			System.out.println("código inválido");
		}
	}//fim main

}//fim class
