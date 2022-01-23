package com.generic;

public class javacollaection {

  static  int [] myArray = {2,3,3,4,5,6,6};
 	
	
	public static void main(String[] args) {
		
	for (int i=0; i< myArray.length;i++) {	
		
	for (int j=(1+i);j <myArray.length;j++) {
		if (myArray[i]==myArray[j]) {
		System.out.println(myArray[i]);
System.out.println("find out my duplicate value="+myArray[j]);
	}
	}		
	}	
}
}