package For;

import java.util.Scanner;

public class RepartimentDeFitxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Entrada
		// Cada cas conté un número enter N que representa quantes fitxes té cada pila.	
	
		//Sortida
		//Mostra la taula de repartiment des de 1 fins a 10 piles, indicant quantes fitxes totals hi ha. El format és: N x P = TOTAL on N és el nombre de fitxes per pila, P és el nombre de piles (de 1 a 10), i TOTAL és el resultat.

		//Exemple d'Entrada
		//5
		
		//Exemple de Sortida
		//5 x 1 = 5
		//5 x 2 = 10
		//5 x 3 = 15
		//5 x 4 = 20
		//5 x 5 = 25
		//5 x 6 = 30
		//5 x 7 = 35
		//5 x 8 = 40
		//5 x 9 = 45
		//5 x 10 = 50
		int entry = sc.nextInt();
		int total = 0;
		
		for (int i= 0; i < 10; i++)	{
			total++;
		System.out.println(entry + " x " + total + " = " + entry*total);		
		}
	}}
