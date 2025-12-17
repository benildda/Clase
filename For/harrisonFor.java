package For;

import java.util.Scanner;

public class harrisonFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		
		for (int i = 1000000 ; i <= entrada ; i = i+1000000) {
			System.out.println(i);
		} 
	}

}
