package com.JavaTraining_09092015;

import java.util.*;

public class StringReversal {
	private String refString;

	public String getRefString() {
		return refString;
	}

	public void setRefString(String refString) {
		this.refString = refString;
	}
	
	public void stringReversal(){

		List reversalAL = new ArrayList();
			
		for(int i = 0; i < refString.length(); i++){
			reversalAL.add(refString.charAt(i));
		}
	
		System.out.print("The reverse of " + refString+ " is ");
	
		ListIterator itr = reversalAL.listIterator(reversalAL.size());
	
		while(itr.hasPrevious()){
			System.out.print(itr.previous());
		}
		
	}
}
