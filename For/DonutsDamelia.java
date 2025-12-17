package For;

import java.util.Scanner;

public class DonutsDamelia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Entrada
		// L’entrada comença amb un valor enter que indicarà el número de casos de
		// prova.

		// Per cada cas de prova, vindrà una línia amb tres possibles combinacions
		// d’assistents al berenar (números enters entre 1 i 50).

		// Sortida
		// Per cada cas de prova s’indicarà el número mínim de donuts que haurà
		// de preparar l’Amelia per garantir que tothom tingui el mateix número,
		// sigui quina sigui la combinació d’assistents final al berenar.

		// 3 posibles combinaciones de Asistentes 1 a 50
		//

		int casos = sc.nextInt();
		int totalA = 0;
		int totalB = 0;
		int totalE = 0;

		for (int i = 0; i < casos; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int e = sc.nextInt();
			int d = sc.nextInt();
			int t = sc.nextInt();
			
			totalA = a / d - t;
			if(b != 0) {
				totalB = b / d - t;
			}
			totalE = e / d - t;

			if (totalA >= totalB && totalE < totalA && totalE < totalB) {
				System.out.println("SALVATS");
			} else if (totalA >= totalB && totalE > totalA && totalE > totalB) {
				System.out.println("MORTS");
			} else if (totalA >= totalB && totalE < totalA && totalE > totalB) {
				System.out.println("LA VENDA");
			}
		}
		/*
		 * System.out.println(totalA); System.out.println(totalB);
		 * System.out.println(totalE);
		 */
	}

}
