package com.example.model;

import java.util.*;

public class RandomFunction {

	public static int[] returnRandom(int min,int max){
		Random rand = new Random();
		int random[] = new int[10];
		
		for(int i=0; i<10;i++){
			random[i] = rand.nextInt((max-min)+1) + min;
		}

		return random;
	}
}
