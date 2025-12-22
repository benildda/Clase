package arrays;

import java.util.Scanner;

public class CambialoUnPoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int index = sc.nextInt();
			int[] arr = new int[index];
			
			for (int k = 0; k< arr.length; k++) {
				arr[k] = sc.nextInt();
			}
			
			int entrada1 = sc.nextInt();
			int entrada2 = sc.nextInt();
			
			for (int h=0; h < arr.length; h++) {
				
				if( arr[h] == entrada1) {
					arr[h] = entrada2;
					
				}System.out.print(arr[h]+ " ");
				
			}System.out.println();
			
			
			
		}
	}

}
