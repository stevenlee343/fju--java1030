package com.steven;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18 (y/N)");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		boolean betw = answer.equalsIgnoreCase("y");

		if(betw){
			System.out.println("Your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Your name?");
			String name = scanner.nextLine();
			System.out.print("Your nick name");
			String nickName = scanner.nextLine();
			System.out.println(age+"/"+name+"/"+nickName+".");

		}else{
			System.out.println("wrong, bye");
		}
		
		
				
	}

}
