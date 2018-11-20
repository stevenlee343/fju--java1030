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
		int average = getAverage();
		System.out.println(name + "\t" + english + "\t" + math + "\t" + "Average: " + getAverage()+
				"\t" + "Highest: " + highest());
		if(getAverage() < 60){
			System.out.println("FAILED");
		}else{
			System.out.println("PASS");
		}
		System.out.println(getGrade());
	}
	
	public char getGrade(){
		char grading = 'F';
		int average = getAverage();
		if(average >= 90 && average <= 100){
			grading = 'A'; 
		}else if(average >= 80 && average <= 89){
			grading = 'B'; 
		}else if(average >= 70 && average <= 79){
			grading = 'C';
		}else if(average >= 60 && average <= 69){
			grading = 'D';
		}
		return grading;
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
