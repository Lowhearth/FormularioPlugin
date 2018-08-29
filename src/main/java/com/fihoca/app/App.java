package com.fihoca.app;


import static com.fihoca.util.FileManager.readFile;
import com.fihoca.dao.AlumnoDao;
import com.fihoca.pojos.Alumno;
import com.fihoca.pojos.Alumnos;

public class App {

	public static void main(String[] args) {
		
		
		Alumno alumno = new Alumno(1, "Daniel", "Vilanova", "4658455-R");
		AlumnoDao alumnoDao = new AlumnoDao();
		Alumno alumno2 = new Alumno(2, "AFSklj", "kjlksaf", "fasg455-R");
		Alumnos alumnos = new Alumnos();
		alumnos.getAlumnos().add(alumno);
		alumnos.getAlumnos().add(alumno2);
		
		
		alumnoDao.add(alumno);
		
		readFile().getAlumnos().forEach(d-> System.out.println(d.getNombre()));
		
		
		
		
		

	}

}
