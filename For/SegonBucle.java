package For;

import java.util.Scanner;

public class SegonBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// La primera línia indica els casos de prova a considerar.
		// Cada cas té dues línies, la primera té un nombre N que et diu
		// quants nombres apareixeran, i després N nombres
		int cas1 = sc.nextInt();
		int cas2;
		int cas3;

		for (int i = 0; i < cas1; i++) {
			
			cas2 = sc.nextInt();
			
			for (int j = 0; j < cas2; j++) {
				
				cas3 = sc.nextInt();
				
				System.out.println(cas3 + 1);
			}
		}
	}
}
