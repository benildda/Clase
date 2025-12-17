package Scanner;

import java.util.Scanner;

public class eleccions2020mes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("Jiden");
		}else if (a == b) {
			System.out.println("No");
		}else {
			System.out.println("Drump");
		}
	}
}
