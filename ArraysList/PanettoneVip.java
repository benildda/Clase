package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PanettoneVip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int longitudArray = sc.nextInt();

			ArrayList<String> alumnos = new ArrayList<>(longitudArray);

			for (int g = 0; g < longitudArray; g++) {

				alumnos.add(sc.next());

			}

			ArrayList<Integer> posicion = new ArrayList<Integer>();

			for (int p = 0; p < alumnos.size(); p++) {

				posicion.add(sc.nextInt());

			}

			for (int a = 0; a < longitudArray - 1; a++) {
				for (int b = a + 1; b < longitudArray; b++) {

					if (posicion.get(a) < posicion.get(b)) {

						Collections.swap(posicion, a, b);
						Collections.swap(alumnos, a, b);

					}

				}

			}
			for (int k = 0; k < alumnos.size(); k++) {
				System.out.print(alumnos.get(k));
				if (k < alumnos.size() - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
