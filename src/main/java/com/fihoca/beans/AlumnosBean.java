package com.fihoca.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import com.xmlreader.dao.*;
import com.xmlreader.pojos.*;

import static com.xmlreader.util.FileManager.readFile;

@ManagedBean(name="alumnos")
@RequestScoped
public class AlumnosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Alumno[] alumnos = null;
	
	
	public Alumno[] getAlumnos() {
		System.out.println("hi");
		return  alumnos;
	}

	public void setAlumnos() {
		this.alumnos = readFile().getAlumnos().toArray(new Alumno[readFile().getAlumnos().size()]);
	}
	
	public  Alumno[] retrieveAlumnos(){
		return (Alumno []) readFile().getAlumnos().toArray();
	}
	
	
	

}
