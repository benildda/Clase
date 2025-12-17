package For;

import java.util.Scanner;

public class ValorGran_i_Petit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		int totalGran = -100000;
		int totalPetit = 100000;

		while (entrada != 0) {

			if (entrada >= totalGran) {
				totalGran = entrada;

			} else if (entrada <= totalPetit) {
				totalPetit = entrada;

			}
			entrada = sc.nextInt();

		}
		System.out.println(totalGran +" "+ totalPetit);
	}
}
