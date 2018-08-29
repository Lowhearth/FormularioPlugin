package com.fihoca.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "alumnos")


public class Alumnos {
	
	List<Alumno> alumnos = new ArrayList<Alumno>();

	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	
	@XmlElement(name="alumno")
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Alumnos(List<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}
	
	public Alumnos(){
		
	}

}
