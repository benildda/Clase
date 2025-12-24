import java.util.Scanner;


public class MitjanaDeTos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int casos = sc.nextInt();
		
		for (int i = 0; i<casos ; i++) {  //casos a probar
			
			int index = sc.nextInt();  // tamaño array
			int[] arr = new int[index];
			
			
			for (int j = 0; j<arr.length; j++) { // relleno array
				arr[j] = sc.nextInt();
			}
			String resultado1 = "A CASA";
			String resultado2 = "A CLASSE";
			String verificador = "";
			
			for (int g=0; g< arr.length;g++) {
				verificador = "";
				if (arr[g] > 15) {
					verificador = resultado1;
					
				}if (arr[g] <= 15) {
						verificador = resultado2;
					}
				
	
			
		}System.out.println(verificador);
		
		
	}

}
}