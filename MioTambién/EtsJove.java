package MioTambién;

import java.util.Scanner;

public class EtsJove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		//Per cada cas es dira "SI" si l'edat es menys de 32 i "NO" en cas contrari

		if (a <= 32) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
	}
}