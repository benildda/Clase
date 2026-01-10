package ArraysList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int casos = sc.nextInt();
		
		for (int i=0;i<casos ;i++) {
			
			int tamaño = sc.nextInt();
			
			ArrayList<String> gente = new ArrayList<>(tamaño);
			
			for (int h=0;h<tamaño;h++) {
				
				gente.add(sc.next());
				
			}
			
			Set<String> sinRepetidos = new HashSet<>(gente);
			
			
			gente = new ArrayList<>(sinRepetidos);
			
			
			System.out.println(gente);
			
			
		}
	}

}
