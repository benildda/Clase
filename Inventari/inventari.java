package Inventari;

import java.util.Scanner;

public class inventari {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sortir = false;
		while (!sortir) {

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

	private static void informes() {
		// TODO Auto-generated method stub
		boolean sortir = false;
		 while(!sortir) {
			 
			 System.out.println("1. Mostra els productes sota minims: ");
			 System.out.println("2. Mostra el total de vendes: ");
			 System.out.println("3. Mostrar el producte més venut: ");
			 System.out.println("4. Sortir al menu principal: ");
			 
			 
			 int opcio = sc.nextInt();
			 switch (opcio) {
			 case 1:
				 
				 for(int i=0;i<Producte.productes.size();i++) {
					 if(Producte.productes.get(i).stock <5) {
						 System.out.println("--------------------------------------------");
						 System.out.println("Producte sota minim: "+Producte.productes.get(i).nom);
						 System.out.println("Quantitat: "+Producte.productes.get(i).stock);
						 System.out.println("--------------------------------------------");
					 }
					 
				 }
				 
				 break;
				 
			 case 2:
				 int totalFacturat =0;
				 int totalProductesVenuts =0;
				 for(int i=0;i<Comandes.comandades.size();i++) {
					 totalFacturat += Comandes.comandades.get(i).quantitat*Producte.productes.get(i).preu;
					 totalProductesVenuts += Comandes.comandades.get(i).quantitat;
				 }
				 System.out.println("---------------------------------------");
				 System.out.println("Total facturat en totes les comandes: "+totalFacturat);
				 System.out.println("Total productes venuts: "+totalProductesVenuts);
				 System.out.println("---------------------------------------");

				 break;
			 case 3:
				 
				 String producteMesVenut = "";
				 int totalitatProducteMesVenut = 0;
				 
				 for(int i=0;i<Comandes.comandades.size();i++) {
					 
					 if(Comandes.comandades.get(i).quantitat > 0) {
						 producteMesVenut = Producte.productes.get(i).nom;
						 totalitatProducteMesVenut += Comandes.comandades.get(i).quantitat;
					 }
					 
				 }
				 System.out.println("--------------------------------");
				 System.out.println("Producte mes venut: "+ producteMesVenut);
				 System.out.println("Quantitat venuda del producte: "+totalitatProducteMesVenut);
				 System.out.println("--------------------------------");

				 
				 break;
			 case 4:
				 
				sortir=true;
				 break;
			 
			 }
		 }
	}

	private static void comandes() {
		// TODO Auto-generated method stub
		boolean sortir = false;
		while (!sortir) {

			System.out.println("1.Nova Comanda: ");
			System.out.println("2.Veure comandes per client: ");
			System.out.println("3.Mostrar totes les comandes registrades: ");
			System.out.println("4.Sortir al menú principal: ");

			int opcio = sc.nextInt();

			switch (opcio) {
			case 1:
				
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

				System.out.println("Introdueix numero DNI: ");
				int dni1 = sc.nextInt();
				for(int i=0;i<Comandes.comandades.size();i++) {
					if(Comandes.comandades.get(i).dni==dni1) {
						System.out.println("** COMANDES: **");
						System.out.println("-----------------------------------------");
						System.out.println(" - Producte: "+Producte.productes.get(i).nom);
						System.out.println(" - Quantitat: "+Comandes.comandades.get(i).quantitat);
						System.out.println(" - Total: "+Comandes.comandades.get(i).quantitat*Producte.productes.get(i).preu);
						System.out.println("-----------------------------------------");
					}		
				}
				
				
				break;

			case 3:
				int totalisimo =0;
				System.out.println("Introdueix numero DNI: ");
				for(int i=0;i<Comandes.comandades.size();i++) {
						System.out.println("** COMANDES: **");
						System.out.println("-----------------------------------------");
						System.out.println(" - Producte: "+Producte.productes.get(i).nom);
						System.out.println(" - Quantitat: "+Comandes.comandades.get(i).quantitat);
						System.out.println(" - Total: "+Comandes.comandades.get(i).quantitat*Producte.productes.get(i).preu);
						System.out.println("-----------------------------------------");
					totalisimo +=	Comandes.comandades.get(i).quantitat*Producte.productes.get(i).preu;
				}
				System.out.println("Import total de totes les comandes: "+totalisimo);
				System.out.println("-----------------------------------------");
				break;

			case 4:

				sortir = true;
				break;

			}
		}
	}

	
		

	private static void productes() {
		// TODO Auto-generated method stub

		boolean sortir = false;
		while (!sortir) {

			System.out.println("1.Crear producte: ");
			System.out.println("2.Mostrar productes registrats: ");
			System.out.println("3.Modificar stock: ");
			System.out.println("4.Sortir al menú principal: ");

			int opcio = sc.nextInt();

			switch (opcio) {
			case 1:
				Producte p = new Producte();

				System.out.println("Introdueix el codi del producte: ");

				int codi = sc.nextInt();
				p.codi = codi;

				System.out.println("Introdueix el nom del producte: ");
				String nom = sc.next();
				p.nom = nom;

				System.out.println("Introdueix el preu del producte: ");
				double preu = sc.nextDouble();
				p.preu = preu;

				Producte.productes.add(p);

				break;

			case 2:

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
				System.out.println("Introdueix el codi del producte a modificar: ");
				int c = sc.nextInt();

				System.out.println("Indroueix el nou stock: ");
				int nouStock = sc.nextInt();

				for (int i = 0; i < Producte.productes.size(); i++) {

					if (Producte.productes.get(i).codi == c) {

						Producte.productes.get(i).stock = nouStock;
					}
				}
				break;

			case 4:
				sortir = true;
				break;

			}

		}

	}

}
