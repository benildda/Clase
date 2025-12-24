import java.util.Scanner;

public class SaturacionOxigen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int casos = sc.nextInt();
		
		
		for (int i = 0; i< casos;i++) {
			
			int index = sc.nextInt();
			int [] arr= new int[index];
			
			for (int j=0; j<arr.length; j++) {
				
				arr[j]=sc.nextInt();
			}
			
			String millora = "";
			String estable = "";
			
			for (int k=0;k<arr.length -2;k++) {
				
				if(arr[k+1] == arr[k]+1 && arr[k+2] == arr[k]+2) {
					millora = "MILLORA";
				} else if(arr[k+1] == arr[k] && arr[k] == arr[k+2]) {
					estable ="ESTABLE";
				}
				
				
			}System.out.println(millora);
			System.out.println(estable);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		

	}

}
