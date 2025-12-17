package For;

import java.util.Scanner;

public class Numeros_positius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		int escaner = sc.nextInt();

		for (int i = 0; i < escaner; i++) {

			int escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada = sc.nextInt();

			if (escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada > 0) {
				contador++;
			}
		}
		System.out.println(contador);

	}
}
