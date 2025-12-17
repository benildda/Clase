package While;

import java.util.Scanner;


public class apostes_perdudes_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int contador = 0;
		
		for (int i = 0; i < 5; i++) {
			//LLEGIR EL NUMERO
			int entrada = sc.nextInt(); 
			//SI EL NUMERO ES MES PETIT QUE ZERO
			if(entrada<0) {
				contador = contador + 1;
			}
		}
		System.out.println(contador);

	} 
}
