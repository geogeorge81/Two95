package com.JavaTraining_09092015;

import java.util.*;

public class StringToList {
	public StringToList(String A, String B, String C, String D){
		String[] refString = {A, B, C, D};
		
		List convertedList = new ArrayList();
		
		for(int i=0;i<refString.length;i++){
			convertedList.add(refString[i]);
		}
		System.out.println(convertedList);
		
		ListIterator itr = convertedList.listIterator(convertedList.size());
		
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+ " ");
		}
			
	}

}
