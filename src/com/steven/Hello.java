package com.steven;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inch = 150;
		double CM_PER_INCH = 2.54;
		double cm = inch * CM_PER_INCH;
		System.out.printf("%d in = %.2f cm\n",inch , cm);
		  
		double c = 24; 
		double f = c * (9.0/5) + 32;
		System.out.printf("%f\n",f); 
		System.out.printf("%.1f C = %.1f F", c,f);  
	}

}
