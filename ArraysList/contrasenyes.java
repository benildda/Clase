package ArraysList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class contrasenyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int entradas = sc.nextInt();
		ArrayList<String> regUsuaris = new ArrayList<>();
		ArrayList<String> regContrasenyes = new ArrayList<>();
		
		for (int i = 0; i < entradas; i++) {

			regUsuaris.add(sc.next());
		}

		for (int i = 0; i < entradas; i++) {

			regContrasenyes.add(sc.next());
		}

		int casos = sc.nextInt();

		for (int j = 0; j < casos; j++) {

			String intentUsuari = sc.next();
			String intentContrasenya = sc.next();

			boolean trobat = false;
			boolean correcta = false;

			for (int h = 0; h < regUsuaris.size(); h++) {
				if (regUsuaris.get(h).equals(intentUsuari)) {
					trobat = true;
					correcta = regContrasenyes.get(h).equals(intentContrasenya);
				}
			}

			if (!trobat)
				System.out.println("usuari no trobat");
			else if (!correcta)
				System.out.println("contrasenya incorrecta");
			else
				System.out.println("OK");
		}

		Collections.sort(regUsuaris);
		
		for (int i = 0; i < regUsuaris.size(); i++) {
			System.out.print(regUsuaris.get(i));
			if (i < regUsuaris.size() - 1)
				System.out.print(" ");
		}
	}

}
