package Scanner;

import java.util.Scanner;

public class NumeroContigus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Dos números enters A,B
		// són contigus si A+1=B o B+1=A

		// Entrada
		// Cada cas és de dues línees. Cada línea conté un nombre, A i B.

		// Sortida
		// Per cada cas es dira "SI" si A i B són contigus i "NO" en cas contrari

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a + 1 == b) {
			System.out.println("SI");
		} else if (b + 1 == a) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}


