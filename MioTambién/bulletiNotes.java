package MioTambién;

import java.util.Scanner;

public class bulletiNotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Per cada cas es dira el següent:
		// 0-4: "Suspes"
		// 5-6: "Aprovat"	
		// 7-8: "Notable"
		// 9-10: "Excelent"
		//(Excel·lent du punt volat però és molt mala idea posar caràcters especials en els casos de prova...)
		 int a = sc.nextInt();
		  
		 if (a < 5) {
		System.out.println("Suspes");
		 }else if (a < 7) {
			 System.out.println("Aprovat");
		 }else if (a < 9) {
			 System.out.println("Notable");
		 }else if (a < 11) {
			 System.out.println("Excelent");
		 }
	}

}
