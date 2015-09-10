package com.Aug08292015;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public class TestExceptionIV {
	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException | JAXBException e) {
			//e = new Exception("");
			e.printStackTrace();
		}catch(Exception e){
			e = new Exception("");
			e.printStackTrace();
		}
	}
 
	public static void foo() throws IOException, JAXBException{
		 
	}

}
