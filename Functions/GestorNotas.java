package Functions;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {

	static ArrayList<Integer> notes = new ArrayList<>();
	static ArrayList<String> alumnes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio = sc.nextInt();
		System.out.println("Introdueix les teves dades");
		
		boolean sortir = false;
		while (!sortir) {

			System.out.println(alumnes);
			System.out.println("1. Registre l'alumne i la seva nota");
			System.out.println("2. Mitjana de totes les notes");
			System.out.println("3. Total de vendes al dia");
			System.out.println("4. Mostra la mitjana de vendes");
			System.out.println("5. Mostra les vendes per dotzena");
			System.out.println("6. Vols esborrar totes les vendes?");
			System.out.println("7· Surt del programa");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
		}
		
		switch(opcio) {
		
		case 1:
			alumne();
			nota();
			break;
			
		case 2:
			mitjanaNotes();
			break;
			
		case 3:
			
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		
		
		
		
		}
	}



	private static void mitjanaNotes() {
		// TODO Auto-generated method stub
		
	}



	private static void nota() {
		// TODO Auto-generated method stub
		
	}



	private static void alumne() {
		// TODO Auto-generated method stub
		
	}

}
