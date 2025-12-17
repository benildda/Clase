package Scanner;

import java.util.Scanner;

public class OkBoomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		// Sí l'any està entre 1945 i 1965, incloent els dos, es dirà "ok boomer"; 
		// en cas contrari, es dirà "nah"
	

		if ((a >= 1945) && (a <= 1965)) {
			System.out.println("ok boomer");
		}else {
			System.out.println("nah");
		}
	}
}
