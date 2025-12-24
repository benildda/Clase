import java.util.Scanner;

public class OxigenSang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int index = sc.nextInt();
			int[] arr = new int[index];

			for (int j = 0; j < arr.length; j++) {

				arr[j]=sc.nextInt();
			}
			
			int maxim = arr[0];
			int minim = arr[0];
			
			for (int r = 0; r<arr.length;r++) {
				
				if(arr[r] < minim) {
					minim= arr[r];
				}
			
				 if (arr[r] > maxim) {
					maxim = arr[r];
				}
				
				
				
			}System.out.println(minim);
			System.out.println(maxim);
			
		}
	}

}
