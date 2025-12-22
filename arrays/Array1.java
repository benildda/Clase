

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int[] arr = new int[K];
		
		
		for(int i=0;i<K;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<K;i++) {
			System.out.println(arr[i]);
		}
		
		int N = sc.nextInt();
		System.out.println(arr[N]);
		
		
	}

}

