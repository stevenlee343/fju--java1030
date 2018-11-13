package com.steven;

import java.util.Random;

public class MidGuess {
	int secret;
	public MidGuess(){
		Random random = new Random();	
		secret = random.nextInt(10) + 1;
		System.out.println(secret);
	}
	
	public int guess(int number){
		return secret - number;
	}
}
