package com.fihoca.util;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.fihoca.pojos.Alumnos;

public class FileManager {
	
	public static Alumnos readFile(){
		
        try {

            File file = new File("Alumno.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Alumnos.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Alumnos alumnos = (Alumnos) jaxbUnmarshaller.unmarshal(file);
            
            return  alumnos;

           

        } catch (JAXBException e) {

            e.printStackTrace();

        }
		return null;

    }
		
}


