package lista02;

public class questao10 {

	public static void main(String[] args) {

		int preco;
		preco = 100;
		String regiao;
		regiao = "NE";
		switch(regiao) {
		case "NE":
			System.out.println("o preço total deu: "+(preco+200));
		break;
		case "S":
			System.out.println("o preço total deu: " +(preco+150));
		break;
		case "SE":
			System.out.println("o preço total deu: "+(preco+85));
		break;
		case "N":
			System.out.println("o preço total deu: "+(preco+250));
		break;
		case "CO":
			System.out.println("o preço total deu: "+(preco+180));
		break;
		default:
			System.out.println("região inválida");
		}//fim switch
	}//fim main

}//fim class
	