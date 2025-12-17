package Scanner;

import java.util.Scanner;

public class DifGranPetit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Per cada cas es dirà la diferència entre A i B

			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > b ) {
		System.out.println(a - b);
			}else {
				System.out.println(b - a);
			}
	}
}
