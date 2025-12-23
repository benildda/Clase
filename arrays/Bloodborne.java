import java.util.Scanner;

public class Bloodborne {

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

			boolean respuesta = false;

			for (int k = 0; k < arr.length -1; k++) {


					if (arr[k] == arr[k +1]) {

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
