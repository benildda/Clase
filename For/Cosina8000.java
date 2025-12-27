package For;

import java.util.Scanner;

public class Cosina8000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int casos = sc.nextInt();
		int contador = 0;
		
		for( int i = 0; i<casos;i++) {
			
			int entradas = sc.nextInt();
			
		
			if(entradas >= 8000) {
				
				contador = contador + entradas;
			}
			
			
			
			
			
		}System.out.println(contador);
		
		
		
		
		
	}

}
