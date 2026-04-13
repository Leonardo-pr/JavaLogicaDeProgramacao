
public class questao07 {

	public static void main(String[] args) {
	  int x=1;
	  int soma=0;
	  while (x<=500) {
	     if(x % 2 != 0) {
	    	soma+=x;
	    	System.out.println(x);
	    }//if
	    x++;
	  }//fim while
	System.out.println(soma);
	}//fim main

}//fim class
