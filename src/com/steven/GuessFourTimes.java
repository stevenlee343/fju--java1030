package com.steven;

import java.util.Random;
import java.util.Scanner;

public class GuessFourTimes {

	public static void main(String[] args) {
		int count = 1;
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int guess = 0;
		while(guess != secret && count <= 4){
			System.out.print("You guess("+count+"/4):");
			guess = scanner.nextInt();
			if(guess < secret){
				System.out.println("higher");
			}else{
				if(guess > secret){
					System.out.println("lower");
				}else{
					break;
				}
			}
			count++;
		}
		if (count>2){
			System.out.println("Great! The secret number is "+secret);
		}else{
			System.out.println("Excellent! The secret number is "+secret);
		}

	}

}
