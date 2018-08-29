package com.fihoca.pojos;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "alumno")
public class Alumno {
	
	private int idAlumno;
	private String nombre;
	private String apellido;
	private String dni;
	
	
	public int getIdAlumno() {
		return idAlumno;
	}
	@XmlElement
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}
	@XmlElement
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	@XmlElement
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	@XmlElement
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Alumno(int idAlumno, String nombre, String apellido, String dni) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Alumno(){
		
	}

}
