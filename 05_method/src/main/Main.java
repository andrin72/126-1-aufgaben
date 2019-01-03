package main;

public class Main {

	public static void main(String[] args) {

		Main instance = new Main();
		System.out.println(instance.calc(5, 2, 2));

	}

	private int calc(int operand1, int operand2, int operator) {
		
		int result = 0;
		
		if(operator < 1 || operator > 5) {
			
			System.out.println("Ungültige Angabe");
			return result;
			
		}
		
		switch(operator) {
		
		case 1:	result = operand1 + operand2;
				break;
		case 2: result = operand2 - operand1;
				break;
		case 3: result = operand1 * operand2;
				break;
		case 4: result = operand1 / operand2;
				break;
		case 5: result = operand1 % operand2;
				break;
				
		}
		
		return result;
		
	}
	
}
