package arrays;

import java.util.Scanner;

public class ComptarArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int LongitugArray = sc.nextInt();
			int[] arr = new int[LongitugArray];

			for (int j = 0; j < arr.length; j++) {

				arr[j] = sc.nextInt();
			}
			int J = sc.nextInt();
			int contador = 0;
			for (int y = 0; y < arr.length; y++) {
				if (arr[y] == J) {
					contador++;
				}
			}
			System.out.println(contador);

		}
	}
}