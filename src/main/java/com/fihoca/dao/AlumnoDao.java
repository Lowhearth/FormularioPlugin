package com.fihoca.dao;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import static com.fihoca.util.FileManager.readFile;


import com.fihoca.pojos.Alumno;
import com.fihoca.pojos.Alumnos;


public class AlumnoDao implements IDao<Alumno> {
	
	


	public Alumno add(Alumno alumno) {
		
		
		File file = new File("Alumno.xml");
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
