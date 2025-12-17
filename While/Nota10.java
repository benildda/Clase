package While;

import java.util.Scanner;

public class Nota10 {

	public static void main(String[] args) {
		// Es mostrarà un missatge indicant el nombre total de notes correctes llegides
		// i el nombre total de notes 10. Una nota és vàlida si es troba entre 0 i 10.

		// El format del missatge de sortida serà el següent:

		// TOTAL NOTES: xxx NOTES10: xxx
		Scanner sc = new Scanner(System.in);

		
		int note10 = 0;
		int totalnotes = 0;
		int escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada = sc.nextInt();

		while(escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada != -1) {


			if (escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada == 10) {
				note10++;

			}
			if (escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada >= 0 && escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada <= 10) {
				totalnotes++;
			}
			

			 escaneaTodoLoQueVaDepuesDeLaPrimeraEntrada = sc.nextInt();
		}
		System.out.println("TOTAL NOTES: " + totalnotes + " NOTES10: " + note10);

	}

}
