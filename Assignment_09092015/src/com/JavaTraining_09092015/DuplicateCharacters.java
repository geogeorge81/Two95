package com.JavaTraining_09092015;

public class DuplicateCharacters {
private String refString;

public String getRefString() {
	return refString;
}

public void setRefString(String refString) {
	this.refString = refString;
	//System.out.println("Test Setter");
}

public String findDuplicates (){
	StringBuffer dupBuffer = new StringBuffer();
	StringBuffer retBuffer = new StringBuffer();
	Character testChar;
	
	boolean noRepeats;
	
	dupBuffer.append(refString);
		
	for (int i=0; i< dupBuffer.length(); i++){
		testChar = dupBuffer.charAt(i);
		noRepeats=false;
						
		for (int c=i+1; c < (dupBuffer.length()); c++){
			if((testChar.equals(dupBuffer.charAt(c)))==true){
				if(noRepeats==false){
					retBuffer.append(testChar);
					noRepeats=true;
				}
				dupBuffer.deleteCharAt(c);
			}
		}
	}
	String dupString=retBuffer.toString();
	
	return (dupString);
}
}
