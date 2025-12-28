package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ParchisParchis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			ArrayList<Integer> partida = new ArrayList<>();

			for (int h = 0; h < 4; h++) {
                partida.add(sc.nextInt());
            }

            int posicion = partida.get(0);      
            boolean ganado = false;         

           
            for (int t = 1; t <= 3; t++) {
                int tiradas = partida.get(t);

                if (!ganado) {
                	
                    int sumaDados = posicion + tiradas;

                    if (sumaDados <= 8) {
                        posicion = sumaDados;
                    } else {
                      
                        posicion = 16 - sumaDados;   
                    }

                    if (posicion == 8) {
                        ganado = true;
                    }
                }
            }

            System.out.println(posicion);
			
			
		}
		
	}

}
