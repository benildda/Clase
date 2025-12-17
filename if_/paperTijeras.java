package if_;

import java.util.Scanner;

public class paperTijeras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Escriurà el jugador que guanya (“Jugador1”, o “Jugador2”)
		// Recordem que
		// pedra guanya a tisora,
		// paper guanya a pedra,
		// tisora guanya a paper. En cas d’empat, escriurà EMPAT.
		// En cas de que un dels jugadors posi un número diferent a 1,2,3, escriurà
		// ERROR.

		int a = sc.nextInt();
		int b = sc.nextInt();
		// 1 Piedra
		// 2 Papel
		// 3 Tijera

		if (a == 1 && b == 2) { // Piedra-Papel
			System.out.println("Jugador2");
		} else if (a == 2 && b == 3) { // Papel-Tijera
			System.out.println("Jugador1");
		} else if (a == 3 && b == 1) { // Tijera-Piedra
			System.out.println("Jugador2");
		} else if (a == 1 && b == 3) { // Piedra-Tijera
			System.out.println("Jugador1");
		} else if (a == 3 && b == 2) { // Tijera-Papel
			System.out.println("Jugador1");
		} else if (a == 2 && b == 1) { // Papel-Piedra
			System.out.println("Jugador1");
		} else if (a != 1 && a != 2 && a != 3 && b != 1 && b != 2 && b != 3) {
			System.out.println("ERROR");
		} else if (a == 1 && b == 1) {
			System.out.println("EMPAT");
		} else if (a == 2 && b == 2) {
			System.out.println("EMPAT");
		} else if (a == 3 && b == 3) {
			System.out.println("EMPAT");
		}
	}
}