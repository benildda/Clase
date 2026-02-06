package HospitalInfernal;

import java.util.ArrayList;

public class Metge {
    //atributs del pacient
    String nom;
    int anysTreballats;
    double sou;
    String departament;


    public void diguesNom() {
        //per a accedir a un atribut fem this.nomDelAtribut
        //this és una paraula especial que fa referència a nosaltres mateixos.
        System.out.println(this.nom);
    }
 
    
    public void augmentarAnysTreballats() {
    this.anysTreballats++;
    this.sou *= 1.02;
    if(sou%6==0) {
    	this.sou *= 1.05;
    }}
    
    //fixa't que el constructor no té retorn, ja que el que retorna és la pròpia classe
    
    
    public Metge() {
        this.nom = "Sense definir";
        this.anysTreballats = 0;
        this.sou = 1000.0;
    }
    
    
    //podem crear múltiples constructors sempre que tinguin paràmetres diferents
    
    
    public Metge(String nom) {
    	
        //this.nom fa referència a la variable global i nom a la local que hem passat per paràmetre
    	
        this.nom = nom;
        this.anysTreballats = 0;
        this.sou = 1000.0;
    }
    
    public Metge(String nom, int anysTreballats) {
        //aquest constructor crida al constructor de nom primer, per això el this(nom), amb el que farà tot el que el constructor de nom digui
        this(nom);
        //podem fer fors dintre d'un constructor com si fos una funció normal
        for (int i = 0; i < anysTreballats; i++) {
            //podem cridar a funcions de la nostra pròpia classe amb el this
            this.augmentarAnysTreballats();
        }
    }

    
}
    
