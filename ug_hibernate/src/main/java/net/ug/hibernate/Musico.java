package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "musico")
public class Musico {
	@Id
	@Column(name = "musico_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusico;
	
    private String nombre;
    private String instrumento;
    private String fechaNacimiento;
    private String fechaMuerte;
    
    
	public Musico() {
	}
	public void imprimir() {
		System.out.println(nombre);
	}

	public Musico(int idMusico, String nombre, String instrumento, String fechaNacimiento, String fechaMuerte ) {
		this.idMusico = idMusico;
		this.nombre = nombre;
		this.instrumento = instrumento;
		this.fechaNacimiento= fechaNacimiento;
		this.fechaMuerte = fechaMuerte;
	}



	public int getIdMusico() {
		return idMusico;
	}

	public void setIdMusico(int idMusico) {
		this.idMusico = idMusico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getFechaMuerte() {
		return fechaMuerte;
	}

	public void setFechaMuerte(String fechaMuerte) {
		this.fechaMuerte = fechaMuerte;
	}
	
	
    
    
}
