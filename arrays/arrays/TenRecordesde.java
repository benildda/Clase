

import java.util.Scanner;

public class TenRecordesde {

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

			int N = sc.nextInt();
			System.out.println(arr[N]);
		}
	}
}