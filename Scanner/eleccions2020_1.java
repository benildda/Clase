package Scanner;

import java.util.Scanner;

public class eleccions2020_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("Jiden");
		}else {
			System.out.println("Drump");
		}
	}
}
