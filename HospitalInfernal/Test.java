package HospitalInfernal;

public class Test {

	public static void main(String[] args) {

		// podem crear un nou Metge perquè existeix la classe i ara és un nou tipus de
		// variable
		// el new Metge () és el seu constructor

		Metge marc = new Metge();
		marc.nom = "Marc";
		marc.sou = 1500;
		marc.anysTreballats = 37;
		marc.departament = "Director general";
		
		Metge montse = new Metge();
		montse.nom = "Montserrat";
		montse.sou = 200;
		montse.anysTreballats = 15;
		montse.departament = "manteniment";
		
		Metge faustino = new Metge();
		faustino.nom = "Dr.Faustino";
		faustino.sou = 1000;
		faustino.anysTreballats = 10;
		faustino.departament = "limpieza";
		
		Metge alberto = new Metge("alberto",30,1500,"DevOps");

	
		
		// podem accedir als seus atributs interns amb el punt

		
		
		

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

		faustino.diguesNom();
		faustino.augmentarAnysTreballats();
		faustino.augmentarAnysTreballats();
		faustino.augmentarAnysTreballats();
		faustino.augmentarAnysTreballats();
		faustino.augmentarAnysTreballats();
		faustino.augmentarAnysTreballats();
		System.out.println(faustino.sou);
		System.out.println("--------------------------------------");

		faustino.imprimirObjeto();
		System.out.println("--------------------------------------");

		alberto.imprimirObjeto();
		System.out.println("--------------------------------------");

		montse.imprimirObjeto();
		System.out.println("--------------------------------------");

		marc.imprimirObjeto();
		System.out.println("--------------------------------------");

		Metge pepo = new Metge("Pepo", Categoria.ESPECIALISTA);
        System.out.println(pepo.nom+" "+pepo.sou);
        if(pepo.categoria == Categoria.ESPECIALISTA) {
            System.out.println("Pepo es un Especialista!");
        }

	}
}
