package Scanner;

import java.util.Scanner;

public class CercarParelles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Entrada
		// La primera línia indica els casos de prova a considerar. Cada cas és una
		// línia amb un nombre.

		// Sortida
		// Per cada cas de prova caldrà respondre: El nombre introduït més un.

		int a = sc.nextInt();

		// El bucle s'executarà exactament 'casos' vegades
		// Si casos = 5, el bucle es fa 5 vegades
		while (a > 0) {
			int b = sc.nextInt();
			b++;
			System.out.println(b);
			
			a--;
			
			//a--; // Això és el mateix que: casos = casos - 1;
		}System.out.println("0");

	}

}
