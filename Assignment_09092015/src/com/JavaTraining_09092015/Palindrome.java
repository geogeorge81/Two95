package com.JavaTraining_09092015;

public class Palindrome {
	private String refString;

	public String getRefString() {
		return refString;
	}

	public void setRefString(String refString) {
		this.refString = refString;
	}
	
	public boolean CheckPalindrome(){
		StringBuffer pBuffer = new StringBuffer();
		pBuffer.append(refString);
		
		if(pBuffer.equals(pBuffer.reverse())){
			return(true);
		}
		else
			return(false);
		
	}

}
