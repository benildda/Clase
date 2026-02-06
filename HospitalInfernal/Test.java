package HospitalInfernal;

public class Test {

	public static void main(String[] args) {

		// podem crear un nou Metge perquè existeix la classe i ara és un nou tipus de
		// variable
		// el new Metge () és el seu constructor

		Metge marc = new Metge();
		Metge montse = new Metge();

		// podem accedir als seus atributs interns amb el punt

		marc.nom = "Marc";
		marc.sou = 1500;
		montse.nom = "Montserrat";
		montse.sou = 200;

		// també podem accedir als seus mètodes interns amb el punt

		System.out.println("--------------------------------------");
		montse.diguesNom();
		montse.augmentarAnysTreballats();
		System.out.println(montse.sou);
		System.out.println("--------------------------------------");

		marc.diguesNom();
		marc.augmentarAnysTreballats();
		System.out.println(marc.sou);

		System.out.println("--------------------------------------");

		Metge perDefecte = new Metge();

		System.out.println(perDefecte.nom);

		System.out.println("--------------------------------------");

		Metge house = new Metge("House");
		System.out.println(house.nom + " " + house.sou);

		System.out.println("--------------------------------------");

		Metge wilson = new Metge("Wilson", 10);
		System.out.println(wilson.nom + " " + wilson.anysTreballats);

		System.out.println("--------------------------------------");

	}
}
