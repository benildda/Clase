package While;

import java.util.Scanner;

public class fitxeswhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int num = 1;
		while(entrada >= num) {
			System.out.println(num);
			num++;
		}
	}

}
