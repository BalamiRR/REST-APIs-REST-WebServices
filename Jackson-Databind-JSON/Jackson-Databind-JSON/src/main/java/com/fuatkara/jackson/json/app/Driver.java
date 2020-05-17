package com.fuatkara.jackson.json.app;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			//create the object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to JSON POJO:
			//data/simple-lite.json
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);
			
			//print first and last name
			System.out.println("First Name : " + theStudent.getFirstName());
			System.out.println("First Name : " + theStudent.getLastName());
			
			//print out the address
			Address studentAddress = theStudent.getAddress();
			System.out.println("Street : " + studentAddress.getStreet());
			System.out.println("City : " + studentAddress.getCity());
			
			System.out.print("Lanuages = ");
			//print out languages
			for(String language : theStudent.getLanguages()) {
				System.out.println(language);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
