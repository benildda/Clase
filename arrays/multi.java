

import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		
		

		for (int i = 0; i < casos; i++) {
			
		int longIndex = sc.nextInt();
		int[] arr = new int[longIndex];
		
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				
			}
				int producto = sc.nextInt();

				
				
				for (int k = 0; k < arr.length; k++) {
					
					

					System.out.print(arr[k] * producto + " ");
					
				}
				

			}

		}}
