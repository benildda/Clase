package Scanner;

import java.util.Scanner;

public class eleccions2020_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Jiden");
		}else if (b > a && b > c) {
			System.out.println("Drump");
		}else {
			System.out.println("Banders");
		}
	}
}
