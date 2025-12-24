import java.util.Scanner;

public class EscalaReial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int index = 7;
			int[] arr = new int[index];

			for (int h = 0; h < arr.length; h++) {

				arr[h] = sc.nextInt();

			}
			boolean[] check = new boolean[14];

			for (int k = 0; k < arr.length; k++) {
				check[arr[k]] = true;
			}

			boolean e1_5 = check[1] && check[2] && check[3] && check[4] && check[5];
			boolean e2_6 = check[2] && check[3] && check[4] && check[5] && check[6];
			boolean e3_7 = check[3] && check[4] && check[5] && check[6] && check[7];
			boolean e4_8 = check[4] && check[5] && check[6] && check[7] && check[8];
			boolean e5_9 = check[5] && check[6] && check[7] && check[8] && check[9];
			boolean e6_10 = check[6] && check[7] && check[8] && check[9] && check[10];
			boolean e7_11 = check[7] && check[8] && check[9] && check[10] && check[11];
			boolean e8_12 = check[8] && check[9] && check[10] && check[11] && check[12];
			boolean e9_13 = check[9] && check[10] && check[11] && check[12] && check[13];

			if (e9_13) {
				System.out.println("ESCALA REIAL");
			} else if (e1_5 || e2_6 || e3_7 || e4_8 || e5_9 || e6_10 || e7_11 || e8_12) {
				System.out.println("ESCALA");
			} else {
				System.out.println("NO");
			}
		}
	}
}
