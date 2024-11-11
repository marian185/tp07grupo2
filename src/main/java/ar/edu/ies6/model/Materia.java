package ar.edu.ies6.model;

import org.springframework.stereotype.Component;

@Component

public class Materia {
	//atributos
	
	private String nombre;
	private String codigo;
	private int creditos;
	private String profesor;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	//constructor
	public Materia(String nombre, String codigo, int creditos, String profesor) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.profesor = profesor;
		}
	//getters y setterrs
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos (int creditos) {
		this.creditos = creditos;
	}
	public String getProfesor() {
		return profesor;
	}
	
	public void setProfesor (String profesor) {
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos + ", profesor=" + profesor
				+ "]";
	}

}
	
	
	
	