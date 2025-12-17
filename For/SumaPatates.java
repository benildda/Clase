package For;
	import java.util.Scanner;
	
	public class SumaPatates {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	
			// Entrada
			// Cada cas compta amb 1 linea amb diversos números.
			// El primer nombre de camions que arriben,
			// k. Després hi haurà k nombres, que és les patates que du cada camió
	
			// Sortida
			// Per cada cas de prova caldrà respondre:
			// La quantitat total de patates descarregades aquell dia
	
			int escaner = sc.nextInt();
			int Total = 0;
	
			for (int i = 0; i < escaner; i++) {
				int escanerInterno = sc.nextInt();
			
				Total = Total + escanerInterno;
				
	
			}System.out.println(Total);
	
		}
	}
