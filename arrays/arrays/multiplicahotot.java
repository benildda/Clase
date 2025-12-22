package arrays;

import java.util.Scanner;

public class multiplicahotot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        int Long = sc.nextInt();
        int[] arr = new int[Long];

        for(int i=0;i<casos;i++){
            arr [i] = sc.nextInt();
        }
        int multiplicador = sc.nextInt();
        for(int j=0 ; j<arr.length;j++) {
            arr[j] = arr[j]*multiplicador;
System.out.print(arr[j]);
        }

    }
}
