package Inventari;

import java.util.Scanner;

public class inventari {



	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sortir = false;
		
		while(!sortir) {
			
			System.out.println("1.Productes: ");
			System.out.println("2.Comandes: ");
			System.out.println("3.Informes: ");
			System.out.println("4.Sortir: ");
			
			int opcio = sc.nextInt();
			
			switch(opcio) {
			
			case 1:
				productes();
				break;
			
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				sortir= true;
				break;
			}
					
		}
		
	}
	private static void productes() {
		// TODO Auto-generated method stub
		
		boolean sortir = false;
		
		while(!sortir) {
			
			System.out.println("1.Crear producte: ");
			System.out.println("2.Mostrar productes registrats: ");
			System.out.println("3.Modificar stock: ");
			System.out.println("4.Sortir al menú principal: ");
			
			
			int opcio = sc.nextInt();
			
			switch(opcio) {
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
				for(int i=0;i< Producte.productes.size();i++) {
					System.out.print("- Codi Producte: "+Producte.productes.get(i).codi);
					System.out.print(" - Nom Producte: "+Producte.productes.get(i).nom);
					System.out.println(" - Preu Producte: "+Producte.productes.get(i).preu);
					
					
				}
				System.out.println("---------------------------------------");
				System.out.println("");
				break;
				
			case 3:
				
				break;
				
			case 4:
				sortir = true;
				break;
			
			
			}
			
		}
		
				
			}
				 
				
				
}
	


