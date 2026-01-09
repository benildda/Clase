package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Frequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int longitud = sc.nextInt();

			ArrayList<Integer> frecuencias = new ArrayList<Integer>(longitud);

			for (int j = 0; j < longitud; j++) {

				frecuencias.add(sc.nextInt());

			}

			int cero = Collections.frequency(frecuencias, 0);
			int uno = Collections.frequency(frecuencias, 1);
			int dos = Collections.frequency(frecuencias, 2);
			int tres = Collections.frequency(frecuencias, 3);
			int cuatro = Collections.frequency(frecuencias, 4);
			int cinco = Collections.frequency(frecuencias, 5);
			int seis = Collections.frequency(frecuencias, 6);
			int siete = Collections.frequency(frecuencias, 7);
			int ocho = Collections.frequency(frecuencias, 8);
			int nueve = Collections.frequency(frecuencias, 9);

			System.out.println(cero + " " + uno + " " + dos + " " + tres + " " + cuatro + " " + cinco + " " + seis + " "
					+ siete + " " + ocho + " " + nueve);
		}
	}

}
