package Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestorNotas {

	static ArrayList<Integer> notes = new ArrayList<>();
	static ArrayList<String> alumnes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("GESTOR DE NOTES");
		System.out.println();
		System.out.println();

		boolean sortir = false;
		while (!sortir) {

			System.out.println("----------------------------------");
			System.out.println("----------------------------------");

			System.out.println("ESCULL OPCIO:");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("1. Registre l'alumne i la seva nota");
			System.out.println("2. Mitjana de totes les notes");
			System.out.println("3. Mostrar aprobats");
			System.out.println("4. Mostrar suspesos");
			System.out.println("5. EScull l'alumne per veure la seva nota");
			System.out.println("6. Introduir nova nota de l'alumne");
			System.out.println("7· Total d'alumnes; el % aprovats, Nota + Alta, Nota +Baixa");
			System.out.println("8. Sortir del programa");
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------");
			System.out.print("Alumnes: ");
			System.out.println(alumnes);
			System.out.print("Notes : ");
			System.out.println(notes);

			System.out.println("----------------------------------");

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Opció: ");
			System.out.println("----------------------------------");

			int opcio = sc.nextInt();

			switch (opcio) {

			case 1:

				nomYnota();

				break;

			case 2:
				// Mostrarà la mitjana de totes les notes introduïdes
				// Si no hi ha notes, mostrarà un missatge d'error

				mitjanaTotesNotes();

				break;

			case 3:
				// Mostrarà el nom i la nota de tots els alumnes amb nota ≥5
				// Si no hi ha aprovats, mostrarà un missatge adequat

				motraAprobats();

				break;
			case 4:
				// Mostrarà el nom i la nota de tots els alumnes amb nota <5
				// Si no hi ha suspesos, mostrarà un missatge adequat

				suspesos();

				break;
			case 5:
				// Demanarà un nom i mostrarà la seva nota
				// Si l'alumne no existeix, mostrarà un missatge d'error

				mostrarLaNotaDunAlumne();

				break;
			case 6:
				// Demanarà un nom i la nova nota
				// Si l'alumne no existeix, mostrarà un missatge d'error
				// La nova nota ha de ser un valor entre 0 i 10

				modificarNota();

				break;
			case 7:
				// Número total d'alumnes
				// Percentatge d'aprovats
				// Nota més alta i més baixa

				estadistiques();

				break;
			case 8:
				// Sortir del programa:

				sortir = true;
			

				break;

			}
		}

	}

	// 1
	private static void nomYnota() {

		// Demanarà el nom de l'alumne i la seva nota
		// La nota ha de ser un valor enter entre 0 i 10
		// No es poden introduir alumnes amb el mateix nom

		System.out.println("Introduex el nom:");
		alumnes.add(sc.next());

		System.out.println("Introdueix la nota:");
		notes.add(sc.nextInt());

	}

	// 2
	private static void mitjanaTotesNotes() {
		// Mostrarà la mitjana de totes les notes introduïdes
		// Si no hi ha notes, mostrarà un missatge d'error
		int total = 0;
		double calculMitjana = 0;

		for (int i = 0; i < notes.size(); i++) {

			total = total + notes.get(i);

		}
		calculMitjana = total / notes.size();
		if (calculMitjana > 0) {
			System.out.println("Mitjana: " + calculMitjana);
		} else {
			System.out.println("¡¡¡NO HI HAN NOTES INTRODUÏDES!!!");

		}

	}

	// 3
	private static void motraAprobats() {

		// Mostrarà el nom i la nota de tots els alumnes amb nota ≥5
		// Si no hi ha aprovats, mostrarà un missatge adequat

		int indice = 0;
		for (int i = 0; i < alumnes.size(); i++) {
			if (notes.get(i) >= 5) {

				indice = i;
				System.out.println("ALUMNE APROBAT: " + alumnes.get(indice) + "    NOTA: " + notes.get(indice));
			} else if (notes.get(indice) < 5) {
				System.out.println("¡¡¡ALGO PASA...NINGÚ HA APROBAT!!!");

			}
		}
	}

	// 4
	private static void suspesos() {

		// Mostrarà el nom i la nota de tots els alumnes amb nota <5
		// Si no hi ha suspesos, mostrarà un missatge adequat
		int indice = 0;
		for (int i = 0; i < alumnes.size(); i++) {
			if (notes.get(i) < 5) {

				indice = i;
				System.out.println("ALUMNE SUSPES " + alumnes.get(indice) + "    NOTA: " + notes.get(indice));
			} else {
				System.out.println("¡¡¡¡NO HI HAN SUSPESOS!!!");

			}

		}

	}

	// 5
	private static void mostrarLaNotaDunAlumne() {
		// Demanarà un nom i mostrarà la seva nota
		// Si l'alumne no existeix, mostrarà un missatge d'error
		System.out.println("Introdueix el nom de l'alumne:  ");

		String introAlumne = sc.next();
		int valor = 0;

		for (int i = 0; i < alumnes.size(); i++) {

			if (alumnes.get(i).equals(introAlumne)) {
				valor++;

				System.out.println("NOTA:  " + notes.get(i));
			}

		}
		if (valor == 0) {
			System.out.println("¡¡¡ALUMNE INEXISTENT!!!");
		}

	}

	// 6
	private static void modificarNota() {
		// Demanarà un nom i la nova nota
		// Si l'alumne no existeix, mostrarà un missatge d'error
		// La nova nota ha de ser un valor entre 0 i 10

		System.out.println("Introdueix el nom de l'alumne: ");
		String alumne = sc.next();
		
		int valor = 0;
		
		for (int i = 0; i < alumnes.size(); i++) {
			
			if (alumnes.get(i).equals(alumne)) {
				
				System.out.println("Introdueix la nova nota :  ");
				notes.set(i, sc.nextInt());
			} 
		}
		if (valor == 0) {
			System.out.println("¡¡¡ALUMNE INEXISTENT!!!");
		}

		
	}

	// 7
	private static void estadistiques() {

		// Número total d'alumnes
		// Percentatge d'aprovats
		// Nota més alta i més baixa
		
		System.out.println("Total Alumnes :"+ alumnes.size());
		
		int valor = 0;

		for (int i = 0; i < notes.size(); i++) {

			if (notes.get(i) >= 5) {
				valor++;
				}
		}System.out.println("Percentatge d'aprobats :"+ valor*100/notes.size()+"%");
	
		
			System.out.println("Nota mes alta: "+ Collections.max(notes));
			System.out.println("Nota mes baixa: "+Collections.min(notes));
		}


}
