package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class totsmoltaladreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for (int m=0;m<casos;m++) {
			
			int longuest = sc.nextInt();
			
			ArrayList<Integer> derecha = new ArrayList<>(longuest);
			
			for (int y=0;y<longuest;y++) {
				
				derecha.add(sc.nextInt());
				
			}
			
			int desplazamiento = sc.nextInt();
			
		
				
				Collections.rotate(derecha, desplazamiento);
				
				
				for (int j = 0; j < derecha.size(); j++) {
					
	                System.out.print(derecha.get(j));
	                
	                if (j < derecha.size() - 1) System.out.print(" ");
	            }
				
	            System.out.println();
				
			
		}
	}

}
