package com.Aug08292015;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public class TestExceptionII {

		public static void main(String[] args) {
			try {
				foo();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(JAXBException e){
				e.printStackTrace();
			}catch(NullPointerException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	 
		public static void foo() throws IOException{
			 
		}

}
