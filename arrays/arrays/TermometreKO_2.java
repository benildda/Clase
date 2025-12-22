package arrays;

import java.util.Scanner;

public class TermometreKO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		

		for (int o = 0; o < casos; o++) {
			
			int K = sc.nextInt();
			int[] array = new int[K];
			
			for (int i = 0; i < array.length; i++) {
				// FOR DE LEER
				array[i] = sc.nextInt();// LEER EN TODAS SUS POSICIONES
				
				
			}
			int casos2 = sc.nextInt();

			for (int i = 0; i < array.length; i++) {
				
				if (array[i] == casos2) {
					array[i] = -1;
				}
				// FOR DE MODIFICAR LOS NEGATIVOS A 0
				// ESTE LO HACEIS VOSOTROS
			}

			for (int i = 0; i < array.length; i++) {
				// FOR DE IMPRIMIR
				System.out.println(array[i]); // IMPRIMIR EN TODAS SUS POSICONES
			}

		}
	}

}
