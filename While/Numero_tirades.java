package While;

import java.util.Scanner;

public class Numero_tirades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador = 0;

		int casos2 = sc.nextInt();

// Mentre el número NO sigui -1, continuem processant
		while (casos2 != -1) {
			
			
			if (casos2 == 6) {
				contador = contador + 1;
			}
			
			
			casos2 = sc.nextInt();
		}
		System.out.println(contador);
		
	}

}
