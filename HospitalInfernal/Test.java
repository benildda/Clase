package HospitalInfernal;

public class Test {
    
    public static void main(String[] args) {
        
        //podem crear un nou Metge perquè existeix la classe i ara és un nou tipus de variable
        //el new Metge () és el seu constructor
        Metge marc = new Metge();
        //podem accedir als seus atributs interns amb el punt
        marc.nom = "Marc";
        //també podem accedir als seus mètodes interns amb el punt
        marc.diguesNom();
    }
}
