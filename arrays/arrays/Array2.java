

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int casos = sc.nextInt();

		//for (int i = 0; i < casos; i++) {

			int K = sc.nextInt();
			int[] arr = new int[K];

			for (int j = 0; j < arr.length; j++) {
				
				arr[j] = sc.nextInt();
			}
			int entrada = sc.nextInt();
			for (int k=0;k<arr.length ; k++) {
				arr[k] = arr[k]+entrada;
			}
			for (int g=0; g<arr.length;g++) {
				System.out.println(arr[g]);
			}
			

		}

	//}

}
