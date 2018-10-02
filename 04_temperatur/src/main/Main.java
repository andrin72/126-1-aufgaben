package main;

import java.util.Random;

public class Main {

	private Random random;
	
	public static void main(String[] args) {
		
		Main instance = new Main();
		instance.init();
				
	}
	
	private void init() {
		
		this.random = new Random();
		
		int[][][] temperature = new int[6][3][4];
	
		for(int i = 0; i < temperature.length; i++) {
			
			for(int j = 0; j < temperature[i].length; j++) {
				
				for(int k = 0; k < temperature[i][j].length; k++) {
					
					temperature[i][j][k] = getRandomNumber(20, 30);
					
				}
				
			}
			
		}
		
		
		for(int i = 0; i < temperature.length; i++) {
			
			for(int j = 0; j < temperature[i].length; j++) {
				System.out.print("( ");
				for(int k = 0; k < temperature[i][j].length; k++) {
					
					System.out.print(temperature[i][j][k] + " ");
					
				}
				System.out.print(") ");
			}
			System.out.println();
		}
		
	}

	private int getRandomNumber(int min, int max) {
		
	    int randomNumber = random.nextInt((max - min) + 1) + min;
	    return randomNumber;
		
	}
	
}
