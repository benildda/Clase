

import java.util.Scanner;

public class Paula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int index = sc.nextInt();
		double[] arr = new double[index];

		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextDouble();

			System.out.print(arr[j] * 100 +"% ");
		}

	}
}