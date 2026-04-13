package repeticao;

import java.util.Scanner;

public class entradadados1 {

	public static void main(String[] args) { 
		Scanner ler = new Scanner(System.in);
		int x; 
		String nome, endereco; 
		double y;
		System.out.println("nome: ");
		nome = ler.next();
		System.out.println("Endereço: ");
		ler.nextLine();
		endereco = ler.nextLine();
		System.out.println("x: ");
		x = ler.nextInt();
		System.out.println("y: ");
		y = ler.nextDouble();
		System.out.println("nome: "+nome);
		System.out.println("Endereço: "+endereco);
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
