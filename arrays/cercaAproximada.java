
import java.util.Scanner;

public class cercaAproximada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int index = sc.nextInt();
			int[] arr = new int[index];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}

			int comparador = sc.nextInt();
			int comparadorInferior = comparador - 1;
			int comparadorSuperior = comparador + 1;
			boolean respuesta = false;

			for (int k = 0; k < arr.length; k++) {

				if (arr[k] == comparador || arr[k] == comparadorInferior || arr[k] == comparadorSuperior) {
					respuesta = true;
				}
			}
			if (respuesta) {
				System.out.println("SI");
			} else {
				System.out.println("NO");

			}

		}

	}
}
