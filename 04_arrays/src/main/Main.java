package main;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Arrays:");
		Random random = new Random();
		int[] randomNumbers = new int[30];
		int max = 50;
		int min = 1;
		int temp;
		int positionGreaterAmount = 0;
		
		for (int i = 0; i < randomNumbers.length; i++) {
			
			randomNumbers[i] = random.nextInt((max - min) + 1) + min;
		}
		
		System.out.print("Unsortierte Zahlen: ");
		
		for (int i = 0; i < randomNumbers.length; i++) {
			
			System.out.print(randomNumbers[i] + " ");
			
		}
		
		for (int i = 1; i < randomNumbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (randomNumbers[j] < randomNumbers[j - 1]) {
				temp = randomNumbers[j];
				randomNumbers[j] = randomNumbers[j - 1];
				randomNumbers[j - 1] = temp;
				}
		     } 
		}
		
		System.out.println("");
		System.out.print("Sortierte Zahlen: ");
		
		for (int i = 0; i < randomNumbers.length; i++) {
			
			System.out.print(randomNumbers[i] + " ");
		}
		    
	} 
}
