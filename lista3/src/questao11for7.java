
public class questao11for7 {

	public static void main(String[] args) {
		int soma = 0;
		for(int x = 1; x < 500; x +=2) {
			System.out.println(x);
			if(x%2 != 0) {
				soma+=x;
			}//fim if
		}//fim for 
		System.out.println(soma);
	}//fim main

}//fim class
