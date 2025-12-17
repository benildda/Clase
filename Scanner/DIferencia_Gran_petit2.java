package Scanner;

import java.util.Scanner;

public class DIferencia_Gran_petit2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Per cada cas es dirà la diferència més gran entre els números.
		// És a dir, la diferència entre el més gran i el més petit

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c && b >= c) {		 // A-B-C
			System.out.println(a - c);
		} else if (b >= a && b >= c && a <= c) {// B-C-A
			System.out.println(b - a);
		} else if (c >= a && c >= b && a >= b) {// C-A-B
			System.out.println(c - b);
		} else if (b >= c && b >= a && a >= b) {// B-A-C
			System.out.println(b - c);
		} else if (a >= c && a >= b && c >= b) {// A-C-B
			System.out.println(a - b);
		} else if (c >= b && c >= a && b >= a) {// C-B-A
			System.out.println(c - a);
		}
	}

}
