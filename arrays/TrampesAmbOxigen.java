

import java.util.Scanner;

public class TrampesAmbOxigen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i=0; i<casos;i++) {
			
			int index = sc.nextInt();
			int[] arr = new int[index];
			
			for (int k=0; k<arr.length;k++) {
				arr[k]=sc.nextInt();
				
			}
			
			  int comparador = sc.nextInt(); 
			  
		
			for(int k=0;k<arr.length;k++) {
				
				if (arr[k] > comparador) {
				System.out.print(arr[k] + " ");
				
			}	else if(arr[k] < comparador) {
				System.out.print(arr[k]+1 + " "); 
			} else if (arr[k] == comparador) {
				System.out.print(arr[k] + " ");
		
			}}
			
		}

		
	}

}
