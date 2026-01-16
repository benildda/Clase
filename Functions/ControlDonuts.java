package Functions;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlDonuts {

	static ArrayList<Integer> vendes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CONTROL DE REPARTIMENTS");

		boolean sortir = false;
		while (!sortir) {

			System.out.println(vendes);
			System.out.println("1. Registre de donuts venuts");
			System.out.println("2. Visualitza total Donuts");
			System.out.println("3. Total de vendes al dia");
			System.out.println("4. Mostra la mitjana de vendes");
			System.out.println("5. Mostra les vendes per dotzena");
			System.out.println("6. Vols esborrar totes les vendes?");
			System.out.println("7· Surt del programa");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
			int opcio = sc.nextInt();

			switch (opcio) {
			case 1:
				entradasDonuts();
				System.out.println("---------------------------------------");
				break;
			case 2:
				int total = donutsTotals();
				System.out.println("Total : " + total);
				System.out.println("---------------------------------------");
				break;
			case 3:
				totalVendesAlDia();
				System.out.println("---------------------------------------");
				break;
			case 4:
				double mitjanaVendes = mitjana();
				System.out.println("Mitjana de vendes: " + mitjanaVendes);
				System.out.println("---------------------------------------");
				break;
			case 5:
				int dotzenes = comptarDotzenes();
				System.out.println("Numero de dotzenes :" + dotzenes);
				System.out.println("---------------------------------------");
				break;
			case 6:
				esborrar();
				System.out.println("---------------------------------------");
				break;
			case 7:
				sortir = true;
				break;
			}
		}
	}

	private static int donutsTotals() {
		// TODO Auto-generated method stub
		int sumaTotal = 0;
		for (int i = 0; i < vendes.size(); i++) {

			sumaTotal = sumaTotal + vendes.get(i);

		}
		return sumaTotal;
	}

	private static void esborrar() {
		// TODO Auto-generated method stub
		vendes.clear();

	}

	private static int comptarDotzenes() {
		// TODO Auto-generated method stub
		int dotzenes = 0;

		for (int i = 0; i < vendes.size(); i++) {

			if (vendes.get(i) == 12) {
				dotzenes++;
			}

		}
		return dotzenes;
	}

	private static double mitjana() {
		// TODO Auto-generated method stub
		double calculMitjana = donutsTotals() / vendes.size();

		return calculMitjana;
	}

	private static void totalVendesAlDia() {
		// TODO Auto-generated method stub
		System.out.println("Total de vendes al dia :" + vendes.size());
	}

	private static void entradasDonuts() {
		// TODO Auto-generated method stub

		vendes.add(sc.nextInt());

	}

}
