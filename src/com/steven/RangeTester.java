package com.steven;

import java.util.Scanner;
import java.*;
public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Please enter an integer:");
		Scanner scanner = new Scanner(System.in);
		int ans = scanner.nextInt();
		//boolean betw = ans.toUpperCase().equals("5");
		boolean betw = ((ans >= -3) && (ans <= 5)) ;
		System.out.println(betw);
	
			
		}
	}


