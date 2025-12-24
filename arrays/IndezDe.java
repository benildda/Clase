import java.util.Scanner;

public class IndezDe {

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

			int buscador = sc.nextInt();
			int respuesta = -1;
			int contador = 0;

			for (int k = 0; k < arr.length; k++) {

				 if (arr[k] == buscador) {
				        contador++;

				        if (contador == 1) {
				            respuesta = k;
				}
				 }

			}System.out.println(respuesta);
			

		}
	}
}
