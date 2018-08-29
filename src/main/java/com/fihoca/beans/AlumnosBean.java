package com.fihoca.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fihoca.pojos.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import static com.fihoca.util.FileManager.readFile;

@ManagedBean(name="alumnos")
@RequestScoped
public class AlumnosBean implements Serializable{

	private final long serialVersionUID = 1L;
	private  Alumno[] alumnos =  readFile().getAlumnos().toArray();
	private String path="Alumnos.xml";
	
	
	public Alumno[] getAlumnos() {
		System.out.println("hi");
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	
	

}
