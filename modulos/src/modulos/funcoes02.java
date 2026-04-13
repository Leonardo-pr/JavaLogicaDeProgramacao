package modulos;

import java.util.Scanner;

public class funcoes02 {
	public static double descontos(double preco){
		double valorFinal;
		double valorFinal2;
		valorFinal2 = preco - (preco*0.05);
		valorFinal = preco - (preco*0.075);
		if(preco>=500) {
		return valorFinal;
		}//fim if 
		else {
			return valorFinal2;
		}//fim else
	}//fim descontos
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor,desconto;
		System.out.println("Preço do produto");
		valor = ler.nextDouble();
		desconto = descontos(valor);
		System.out.println("O preço total foi: "+desconto);
	}//fim main

}//fim else
