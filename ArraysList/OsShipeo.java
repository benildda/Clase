package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class OsShipeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int alumnos = sc.nextInt();

			ArrayList<Integer> medidas = new ArrayList<>(alumnos);
			
			for (int j = 0; j < alumnos; j++) {
				
				medidas.add(sc.nextInt());
				
			}
			int min = medidas.get(0);
            int max = medidas.get(0);

            for (int j = 1; j < medidas.size(); j++) {
            	
                int h = medidas.get(j);
                
                if (h < min) min = h;
                if (h > max) max = h;
            }

            System.out.println(max - min);
			

		}

	}
}
