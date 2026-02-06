package Objetos;

import java.util.ArrayList;

public class Humano {

	String nombre;
	int estatura;
	String profesion;
	ArrayList<OrganoVital> organos = new ArrayList<>();
	
	public Humano(String nombre, int estatura, String profesion) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.profesion = profesion;
		
		
	}
	
	
	public boolean meterOrgano(OrganoVital o) {
		
		organos.add(o);
		System.out.println("La operacion ha salido bien");
		return true;
	}
	
	
}
