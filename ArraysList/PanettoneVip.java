package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class PanettoneVip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
		int casos = sc.nextInt();
		
		for (int i=0;i<casos;i++) {
			
			int longitudArray = sc.nextInt();
			
			ArrayList<String> alumnos = new ArrayList<>(longitudArray);
			
			
			for (int g=0;g<longitudArray;g++) {
				
				alumnos.add(sc.next());
				
			}
			
			ArrayList<Integer> posicion = new ArrayList<Integer>();
			
			for (int p=0;p<alumnos.size();p++) {
				
				posicion.add(sc.nextInt());
				
			}
			
			
			
			
			
			
			System.out.println(alumnos);
			System.out.println();
			
			
			
			
			
			
			
			
		}
	}

}
