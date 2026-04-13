import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade,soma=0;
		int pessoas=10;
		int maior18 = 0;
		int menor10 = 0;
		int maiorIdade = 0;
		for(int x=1;x<=10;x++) {			
			System.out.println("Idade da Pessoa: ");
			idade = ler.nextInt();
			soma+=idade;
			if(idade>18) {
				maior18++;
			}//fim contador18
			if(idade<10) {
				menor10++;
			}//fim if contador 10
			if(idade>maiorIdade) {
			maiorIdade = idade;	
			}//if idade
			
			
		}//fim for
		int media = soma/pessoas;
		System.out.println("A média da idade das pessoas é: "+media);
		System.out.println("A quantidade de pessoas com mais de 18 anos é "+maior18);
		System.out.println("A quantidadede pessoas com menos de 10 anos é "+menor10);
		System.out.println("Idade mais velha "+maiorIdade);
	}//fim main
}//fim class
