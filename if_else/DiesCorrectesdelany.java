package if_else;

import java.util.Scanner;

public class DiesCorrectesdelany {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 //Programa que demana un número de dia de l’any, que pot ser qualsevol enter, i mostra per pantalla:

	 //Incorrecte!, si el número de dia no és correcte
	 //Correcte per un any no bixest!, si el dia està entre 1 i 365
	 //Correcte per un any bixest!, si el dia és 366
	 
	 int a = sc.nextInt();
			 
			if (a == 366) {
				System.out.println("Correcte per un any bixest!");
			} else if (a >= 1 && a <=365) {
				System.out.println("Correcte per un any no bixest!");
			} else {
				System.out.println("Incorrecte!");
			}
 }}
