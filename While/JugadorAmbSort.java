package While;
import java.util.Scanner;

public class JugadorAmbSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// L'entrada consta d'una seqüència de números enters que representen els guanys
		// de cada aposta
		// (poden ser negatius si han perdut). La seqüència acaba amb un 0 que no s'ha
		// de processar.
		int entrada = sc.nextInt();
		int buscadorGanador = 0;

		while (entrada != 0) {
			if (entrada > buscadorGanador) {
				buscadorGanador = entrada;
			}
			entrada = sc.nextInt();
		}
		System.out.println(buscadorGanador);
	}
}