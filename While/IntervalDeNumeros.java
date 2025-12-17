package While;

import java.util.Scanner;

public class IntervalDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Entrada
		// Cada cas és una línia amb 2 números positiu.

		// Sortida
		// El compte enrere del primer nombre fins al segon, incloent els dos.

		int entrada = sc.nextInt();
		int entrada2 = sc.nextInt();
		
		if (entrada < entrada2) {
			System.out.println("El segon numero no es mes petit que el primer");
		}
		while (entrada >= entrada2) {
			System.out.println(entrada);
			entrada--;
		}
		
	}
}
