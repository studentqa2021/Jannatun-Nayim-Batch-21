package com.generic;

public  class swipvariable {

	public void getSwap(int a,int b) {
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		System.out.println("A value after swap="+a);
		System.out.println("B value after swap="+b);
		System.out.println("A value before swap="+a);
		System.out.println("B value before swap="+b);
		}
	
	public static void main(String[] args) {
		
		new swipvariable().getSwap(10, 20);
		
		
	}
		
}
	
	

