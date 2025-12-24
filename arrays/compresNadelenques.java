import java.util.Scanner;

public class compresNadelenques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int casos = sc.nextInt();
		
		
		for(int i=0;i<casos;i++) {
			
			int index = sc.nextInt();
			String[] arr = new String[index];
			
			
			for (int j=0;j<arr.length;j++) {
				
				arr[j] = sc.next();
				
			}
			
			
			for (int k=0; k<arr.length;k++) {
				
				if (arr[k].contains("IKEA")) {
					arr[k] = "PRIVAT";
							
					
				}System.out.print(arr[k]+ " ");
				
				
				
			}
	
			
		}

	}

}
