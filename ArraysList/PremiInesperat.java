package ArraysList;
import java.util.ArrayList;
import java.util.Scanner;

public class PremiInesperat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		String carlota1 = "CARLOTA";
		String joana1 = "JOANA";

		while (valor != 0) {
			ArrayList<Integer> lista = new ArrayList<>();

			while (valor != 0) {
				lista.add(valor);
				valor = sc.nextInt();
			}

			int carlota = sc.nextInt();
			int joana = sc.nextInt();

			int joanaResult = lista.get(joana - 1);
			int carlotaResult = lista.get(carlota - 1);

			if (joanaResult < carlotaResult) {
				System.out.println(joana1);
			} else {
				System.out.println(carlota1);
			}
			valor = sc.nextInt();
		}

	}

}
