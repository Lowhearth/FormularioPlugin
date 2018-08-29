package com.fihoca.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.fihoca.dao.AlumnoDao;
import com.fihoca.pojos.Alumno;

@ManagedBean(name="alumno", eager = true)
@RequestScoped

public class AlumnoBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int idAlumno;
	private String nombre;
	private String apellido;
	private String dni;
	private AlumnoDao alumnoDao = new AlumnoDao();
	

	
	public String add(){
		System.out.println("adding");
		System.out.println(nombre);
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(idAlumno);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setDni(dni);
		System.out.println(alumno.getApellido());
		alumnoDao.add(alumno);
		return "sucess";
		
		
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	

}
