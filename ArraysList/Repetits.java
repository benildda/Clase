package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Repetits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int allargadaArray = sc.nextInt();

			ArrayList<Integer> anecsColeccionats = new ArrayList<>(allargadaArray);

			for (int h = 0; h < allargadaArray; h++) {

				anecsColeccionats.add(sc.nextInt());
			}

			boolean hayRepetidos = false;

			for (int j = 0; j < anecsColeccionats.size(); j++) {
			    int valor = anecsColeccionats.get(j);

			    if (Collections.frequency(anecsColeccionats, valor) > 1) {
			        hayRepetidos = true;
			    }
			}

			if (hayRepetidos) {
			    System.out.println("SI");
			} else {
			    System.out.println("NO");
			}
		}
	}
}
