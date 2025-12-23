
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
			int mayorValor = arr[0];

			for (int k = 0; k < arr.length; k++) {
				if (arr[k]> mayorValor) {

					mayorValor = arr[k];
				}System.out.println(mayorValor);
			}
			
			
			if (mayorValor == comparador || mayorValor == comparador - 1 || mayorValor == comparador + 1) {
				System.out.println("SI");
			} else {
				System.out.println("NO");

			}

		}

	}

}
