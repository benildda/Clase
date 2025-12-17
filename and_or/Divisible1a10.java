package and_or;

import java.util.Scanner;

public class Divisible1a10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Per cada cas es dira "SI" si N
	    //és divisible per 1,2,3,4,5,6,7,8,9
		//i "NO" en cas contrari
		//psst, realment només cal comprovar 4 divisors.

		int a = sc.nextInt();
		
		if (a % 2 == 0 && a % 1 == 0 && a % 3 == 0 && a % 4 == 0 && a % 5 == 0 && a % 6 == 0 && a % 2 == 0 && a % 8 == 0 && a % 9 == 0) {
			System.out.println("SI");
		}else {
		System.out.println("NO");
	}
	}
}
