import java.util.ArrayList;
import java.util.Scanner;

public class PremiInesperat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		int valor = sc.nextInt();
		int carlota = sc.nextInt();
		int joana = sc.nextInt();
		String carlota1 = "CARLOTA";
		String joana1 = "JOANA";
		
		while (valor != 0) {
		    lista.add(valor);
		    valor = sc.nextInt();
		    
		}System.out.println(lista);
		
		    
		    
		}
		

	}


