package arrays;

import java.util.Scanner;

public class eleccionsPatates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();

		
		for (int i=0;i<casos;i++) {
				
			int index = sc.nextInt();
			int[] arr = new int[index];
			
			int comparador = arr[0];
			int contador = 0;
			
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
				
				if(arr[j] > comparador) {
					
					comparador = arr[j];
					contador = j+1;
					
					
				}
				
			}System.out.println(contador);
			
			
			
			
			
			
		}
		
		
			
			
			
			
			
			
		}
		
	}


