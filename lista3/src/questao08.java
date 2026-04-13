import java.util.Random;

public class questao08 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int y=1;
		int contador=0;
		int contador2=0;
		while(y<=20) {
		int x = aleatorio.nextInt(10);
		y++;
		System.out.println("Número sorteado: "+ x);
		if(x>5) {
			contador++;
		}//fim primeiro if
	    if(x%3==0) {
		contador2++;
		}//fim segundo if
		}//fim while
	    System.out.println("os números acima de 5 são "+contador);
	    System.out.println("os números divisivos por 3 são "+contador2);
	}//fim main

}//fim class
