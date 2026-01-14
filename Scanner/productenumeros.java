package Scanner;

import java.util.Scanner;

public class productenumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int j = 0; j < casos; j++) {

			int nombres = sc.nextInt();

			if (nombres <= 0) {
				System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
				continue;
			}

			int suma = 0;
			int producto = 1;

			for (int y = 1; y <= nombres; y++) {
				producto *= y;
			}
			for (int e = 1; e <= nombres; e++) {
				suma += e;
			}

			System.out.println("SUMA: " + suma + " PRODUCTE: " + producto);
		}

	}

}
