package HospitalInfernal;

public class Metge {
    //atributs del pacient
    String nom;
    int anysTreballats;
    double sou;


    public void diguesNom() {
        //per a accedir a un atribut fem this.nomDelAtribut
        //this és una paraula especial que fa referència a nosaltres mateixos.
        System.out.println(this.nom);
    }
}
