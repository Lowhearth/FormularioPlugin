package com.fihoca.dao;

import static com.fihoca.util.FileManager.*;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import static com.fihoca.util.FileManager.readFile;


import com.fihoca.pojos.Alumno;
import com.fihoca.pojos.Alumnos;


public class AlumnoDao implements IDao<Alumno> {
	
	static String path = "Alumno.xml";
	static File file = null;
	
	static{
		file = createFile(path);
	}


	public Alumno add(Alumno alumno) {
		
		
	
	    JAXBContext jaxbContext;
		try {
			Alumnos alumnos =readFile();
			jaxbContext = JAXBContext.newInstance(Alumnos.class);
			 Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			    alumnos.getAlumnos().add(alumno);
			    jaxbMarshaller.marshal(alumnos, file);
			    jaxbMarshaller.marshal(alumnos, System.out);
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
	   
	    
		return null;
	}

	
	


}
