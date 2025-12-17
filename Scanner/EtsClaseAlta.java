	package Scanner;
	
	import java.util.Scanner;
	
	import com.sun.tools.javac.Main;
	
	public class EtsClaseAlta {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// TODO Auto-generated method stub
	
			// Entrada
			// Cada cas és de una línea, i conté un número, el sou brut anual.
	
			// Sortida
			// Per cada cas es dira "SI" si el sou es igual o superior a 30400 euros bruts i
			// "NO" en cas contrari
	
			int a = sc.nextInt();
	
			if (a >= 30400) {
				System.out.println("SI");
			} else if (a < 30400) {
				System.out.println("NO");
			}
		}
	}
