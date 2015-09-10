package com.JavaTraining_09092015;

import java.util.ArrayList;

public class Permutations {
private String refString;

public String getRefString() {
	return refString;
}

public void setRefString(String refString) {
	this.refString = refString;
}

public void callPermutation(){
	permutationMethod("", refString);
}

private void permutationMethod(String start, String origString){
	  int n = origString.length();
	    if (n == 0){
	    	System.out.println(start);
	    }
	    	
	    else {
	        for (int i=0;i<n;i++)
	            permutationMethod(start + origString.charAt(i), origString.substring(0, i) + origString.substring(i+1, n));
	    }
	
}

}

