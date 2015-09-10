package com.JavaTraining_09092015;

public class ModifyHashEquals {
private int value1;
private int value2;

public int getValue1() {
	return value1;
}

public void setValue1(int value1) {
	this.value1 = value1;
}

public int getValue2() {
	return value2;
}

public void setValue2(int value2) {
	this.value2 = value2;
}


public ModifyHashEquals(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
}

public boolean equals(Object toBeEvaluated){
	ModifyHashEquals a = (ModifyHashEquals) toBeEvaluated;
	return ((a.getValue1() == this.getValue1())&&(a.getValue2()==this.getValue2()));
}

public int hashcode(){
	return(value1+value2);
}
}
