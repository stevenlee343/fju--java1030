package com.steven;
public class Studentt {
 
		String name;
		int english;
		int math;
		
		
	public Studentt(String name, int english, int math){
		this.name = name;
		this.english = english;
		this.math = math;
		
	}
	
	
	public void print(){
		
		System.out.println(name + "\t" + english + "\t" + math + "\t" + getAverage()+
				"\t" + highest());
		if(getAverage()/2 < 60){
			System.out.println("FAILED");
		}else{
			System.out.println("PASS");
		}
	}
	
	public int highest(){
		if( english > math){
			return english;
		}else{
			return math;
		}
	}
	
	
	public int getAverage(){
		return ( english + math )/2;
	}
	

}
