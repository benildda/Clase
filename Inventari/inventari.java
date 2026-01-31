package Inventari;

import java.util.Scanner;

public class inventari {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sortir = false;
		while (!sortir) {

			// MENU PRINCIPAL

			System.out.println("1.Productes: ");
			System.out.println("2.Comandes: ");
			System.out.println("3.Informes: ");
			System.out.println("4.Sortir: ");

			int opcio = sc.nextInt();

			switch (opcio) {

			case 1:
				productes();
				break;

			case 2:
				comandes();
				break;

			case 3:
				informes();
				break;

			case 4:
				sortir = true;
				break;
			}

		}

	}

//*******************************************************************************************************************************************+
//*******************************************************************************************************************************************+

	private static void productes() {
		// TODO Auto-generated method stub

		boolean sortir = false;
		while (!sortir) {

			// MENU SECUNDARI PRODUCTES, OPCIO 1 DEL MENU PRINCIPAL:
			// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

			System.out.println("1.Crear producte: ");
			System.out.println("2.Mostrar productes registrats: ");
			System.out.println("3.Modificar stock: ");
			System.out.println("4.Sortir al menú principal: ");

			int opcio = sc.nextInt();

			switch (opcio) {
			case 1:

				Producte p = new Producte();

				int codi;
				double preu;

				while (true) {
					System.out.println("Introdueix el codi del producte (4 digits): ");
					codi = sc.nextInt();

					boolean existeix = false;

					for (int i = 0; i < Producte.productes.size(); i++) {
						if (Producte.productes.get(i).codi == codi) { // comprovacio del codi existent al inventari
							existeix = true;
							break;
						}
					}

					if (codi >= 1000 && codi <= 9999 && !existeix) { // comprovacio que el codi introduït, tingui 4
																		// digits

						p.codi = codi;

						System.out.println("Introdueix el nom del producte: ");
						p.nom = sc.next();

						while (true) {
							System.out.println("Introdueix el preu del producte: ");
							preu = sc.nextDouble();

							if (preu > 0) { // comprovacio de que el preu ha de ser major a 0
								p.preu = preu;
								break;
							} else {
								System.out.println("-------------------");
								System.out.println("El preu ha de ser major a 0");
								System.out.println("-------------------");
							}
						}

						Producte.productes.add(p); // indrodueix tots el valors al objecte
						break;

					} else {
						System.out.println("-------------------");
						System.out.println("El numero de codi ha de tenir 4 digits o ja existeix");
						System.out.println("-------------------");
					}
				}

				break;

			case 2:
				// OPCIO 2.MODIFICAR ELS PRODUCTES JA
				// REGISTRATS:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------------");
				System.out.println("Productes: ");
				System.out.println("");
				for (int i = 0; i < Producte.productes.size(); i++) {
					System.out.print("- Codi Producte: " + Producte.productes.get(i).codi);
					System.out.print(" - Nom Producte: " + Producte.productes.get(i).nom);
					System.out.print(" - Preu Producte: " + Producte.productes.get(i).preu);
					System.out.println(" - Stock actual: " + Producte.productes.get(i).stock);

				}
				System.out.println("---------------------------------------");
				System.out.println("");
				break;

			case 3:

				System.out.println("----------Llista de productes---------");
				for (int i = 0; i < Producte.productes.size(); i++) {
					System.out.print(" - Codi: " + Producte.productes.get(i).codi);
					System.out.println(" - Producte: " + Producte.productes.get(i).nom);
				}
				System.out.println("---------------------------------------");

				System.out.println("Introdueix el codi del producte a modificar: ");
				int codiDeComprovacio = sc.nextInt();

				int indexTrobat = -1;

				for (int i = 0; i < Producte.productes.size(); i++) { // Comprovar si el codi existeix
					if (Producte.productes.get(i).codi == codiDeComprovacio) {
						indexTrobat = i;
						break;
					}
				}

				if (indexTrobat == -1) { // ️Si no existeix, no es pot modificar
					System.out.println("Codi del producte inexistent");
					break;
				}

				int nouStock;
				while (true) {
					System.out.println("Introdueix el nou stock: ");
					nouStock = sc.nextInt();

					if (nouStock >= 0) { // Demanar i validar l'estoc
						Producte.productes.get(indexTrobat).stock = nouStock;
						System.out.println("Stock modificat correctament");
						break;
					} else {
						System.out.println("L'estoc ha de ser major o igual a 0");
					}
				}

				break;

			// OPCIO 4.SORTIR AL MENU
			// PRINCIPAL:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

			case 4:
				sortir = true;
				break;

			}

		}

	}

//*******************************************************************************************************************************************+
//*******************************************************************************************************************************************+

	private static void comandes() {

		// MENU SECUNDARI OPCIO 2.COMANDES DEL MENU PRINCIPAL:
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		boolean sortir = false;
		while (!sortir) {

			System.out.println("1.Nova Comanda: ");
			System.out.println("2.Veure comandes per client: ");
			System.out.println("3.Mostrar totes les comandes registrades: ");
			System.out.println("4.Sortir al menú principal: ");

			int opcio = sc.nextInt();

			switch (opcio) {
			case 1:

				// OPCIO 1.CREAR UNA NOVA
				// COMANDA:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				Comandes c = new Comandes();

				System.out.println("Insereix el numero de DNI: ");
				int dni = sc.nextInt();
				c.dni = dni;

				System.out.println("Insereix el codi del producte: ");
				int codiProducte = sc.nextInt();
				c.codi = codiProducte;

				System.out.println("Insereix la quantiat: ");
				int quantitat = sc.nextInt();
				c.quantitat = quantitat;

				Comandes.comandades.add(c);

				break;
			case 2:

				// OPCIO 2.VEURE COMANDES PER DNI
				// CLIENT:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				System.out.println("Introdueix numero DNI: ");
				int dni1 = sc.nextInt();
				for (int i = 0; i < Comandes.comandades.size(); i++) {
					if (Comandes.comandades.get(i).dni == dni1) {
						System.out.println("** COMANDES: **");
						System.out.println("-----------------------------------------");
						System.out.println(" - Producte: " + Producte.productes.get(i).nom);
						System.out.println(" - Quantitat: " + Comandes.comandades.get(i).quantitat);
						System.out.println(
								" - Total: " + Comandes.comandades.get(i).quantitat * Producte.productes.get(i).preu);
						System.out.println("-----------------------------------------");
					}
				}

				break;

			case 3:

				// OPCIO 3.MOSTRAR TOTES LES COMANDES REGISTRADES AL INVENTARI:
				// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				int totalisimo = 0;
				for (int i = 0; i < Comandes.comandades.size(); i++) {
					System.out.println("** COMANDES: **");
					System.out.println("-----------------------------------------");
					System.out.println(" - Producte: " + Producte.productes.get(i).nom);
					System.out.println(" - Quantitat: " + Comandes.comandades.get(i).quantitat);
					System.out.println(
							" - Total: " + Comandes.comandades.get(i).quantitat * Producte.productes.get(i).preu);
					System.out.println("-----------------------------------------");
					totalisimo += Comandes.comandades.get(i).quantitat * Producte.productes.get(i).preu;
				}
				System.out.println("Import total de totes les comandes: " + totalisimo);
				System.out.println("-----------------------------------------");
				break;

			case 4:

				// OPCIO 4.SORTIR AL MENU
				// PRINCIPAL:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				sortir = true;
				break;

			}
		}
	}

//*******************************************************************************************************************************************+
//*******************************************************************************************************************************************+

	private static void informes() {

		// MENU SECUNDARI: - OPCIO NUMERO 3 DEL MENU PRINCIPAL
		// 3.Informes:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		boolean sortir = false;
		while (!sortir) {

			System.out.println("1. Mostra els productes sota minims: ");
			System.out.println("2. Mostra el total de vendes: ");
			System.out.println("3. Mostrar el producte més venut: ");
			System.out.println("4. Sortir al menu principal: ");

			int opcio = sc.nextInt();
			switch (opcio) {
			case 1:

				// OPCIO 1. PRODUCTES SOTA MINIM:>>>>>>>>>>>>>>>>>

				for (int i = 0; i < Producte.productes.size(); i++) {
					if (Producte.productes.get(i).stock < 5) {
						System.out.println("--------------------------------------------");
						System.out.println("Producte sota minim: " + Producte.productes.get(i).nom);
						System.out.println("Quantitat: " + Producte.productes.get(i).stock);
						System.out.println("--------------------------------------------");
					}

				}

				break;

			// OPCIO 2. MOSTRAR EL TOTAL DE VENDES:>>>>>>>>>>>>>>>>>

			case 2:
				int totalFacturat = 0;
				int totalProductesVenuts = 0;

				for (int i = 0; i < Comandes.comandades.size(); i++) {

					totalFacturat += Comandes.comandades.get(i).quantitat * Producte.productes.get(i).preu;
					totalProductesVenuts += Comandes.comandades.get(i).quantitat;
				}
				System.out.println("---------------------------------------");
				System.out.println("Total facturat en totes les comandes: " + totalFacturat);
				System.out.println("Total productes venuts: " + totalProductesVenuts);
				System.out.println("---------------------------------------");

				break;
			case 3:

				// OPCIO 3. MOSTRA EL PRODUCTE MES VENUT:>>>>>>>>>>>>>>>>

				String producteMesVenut = "";
				int totalitatProducteMesVenut = 0;
				int indexMesAlt = 0;

				for (int i = 0; i < Comandes.comandades.size(); i++) {

					int quantitatActual = Comandes.comandades.get(i).quantitat;

					if (quantitatActual > totalitatProducteMesVenut) {
						totalitatProducteMesVenut = quantitatActual;
						indexMesAlt = i;
					}
				}

				producteMesVenut = Producte.productes.get(indexMesAlt).nom;

				System.out.println("--------------------------------");
				System.out.println("Producte mes venut: " + producteMesVenut);
				System.out.println("Quantitat venuda del producte: " + totalitatProducteMesVenut);
				System.out.println("--------------------------------");

				break;

			case 4:
				// OPCIO 4. SORTIR AL MENU PRINCIPAL:>>>>>>>>>>>>>>>>>>>>>>>>>
				sortir = true;
				break;

			}
		}
	}

}
