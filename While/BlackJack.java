package While;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int entrada1 = sc.nextInt();
		int entrada2 = sc.nextInt();

		for (int i=entrada1 ; i<=entrada2 ; i++) {
			System.out.println(entrada1++);
		}
	}

}
