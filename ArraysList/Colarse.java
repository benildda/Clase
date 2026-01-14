package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Colarse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			
			int persones = sc.nextInt();
			ArrayList<Integer> cola = new ArrayList<>(persones);
			
			for(int j=0; j< persones; j++) {
				
				cola.add(sc.nextInt());
			}
			
			int dona = sc.nextInt();
			int lugarCola = sc.nextInt();
			
			
			
		cola.add(lugarCola, dona);

		for (int j = 0; j < cola.size(); j++) {
			
		    System.out.print(cola.get(j)+" ");
		}
		

		
		
	}

}}
