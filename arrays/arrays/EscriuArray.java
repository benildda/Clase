

import java.util.Scanner;

public class EscriuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		sc.nextLine();
		String[] array = new String[casos];

		
		for (int j = 0; j < casos; j++) {

			array[j] = sc.nextLine();
		System.out.println(array[j]);
		} int indice = sc.nextInt();
		System.out.println(array[indice]);


	}
}
