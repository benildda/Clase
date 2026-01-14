package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplintRatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for (int i = 0; i< casos; i++) {
			
			int ratio = sc.nextInt();
			
			ArrayList<String> clase = new ArrayList<>(ratio);
			
			for(int y=0; y< ratio;y++) {
				
				clase.add(sc.next());
				
			}
			
			int posicionBorrar = sc.nextInt();
			
			clase.remove(posicionBorrar);
			
			for (int j = 0; j < clase.size(); j++) {
			    if (j > 0) System.out.print(" ");
			    System.out.print(clase.get(j));
			}
			System.out.println();
		}
		
		
	}

}
