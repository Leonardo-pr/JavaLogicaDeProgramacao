import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int menor=0;
		int preco;
		int maior = 0;
		for(int x=1;x<=8;x++) {
			System.out.println("Preço do produto");
			preco = ler.nextInt();
			if(x==1) {
				menor = preco;
				maior = preco;
			}//fim primeiro if
			if(preco<menor) {
				menor=preco;
			}//fim segundo if
			if(preco>maior) {
				maior=preco;
			}//fim terceiro if
		}//fim for
		System.out.println("o preço mais caro foi "+maior+" reais");
		System.out.println("o preço mais barato foi "+menor+" reais");
	}//fim main

}//fim class
