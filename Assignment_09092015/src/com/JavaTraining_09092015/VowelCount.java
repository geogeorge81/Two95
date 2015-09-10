package com.JavaTraining_09092015;

public class VowelCount {
private String refString;
private int vowelNumber=0;

public String getRefString() {
	return refString;
}

public void setRefString(String refString) {
	this.refString = refString;
}

public void countVowels(){
	for(int i=0;i<refString.length();i++){
		if ((refString.charAt(i)=='a')||
				(refString.charAt(i)=='e')||
				(refString.charAt(i)=='i')||
				(refString.charAt(i)=='o')||
				(refString.charAt(i)=='u')){
			vowelNumber++;
	}
}

System.out.println("There are " + vowelNumber + " vowels in " + refString);

}
}
