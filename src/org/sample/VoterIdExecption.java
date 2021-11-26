package org.sample;



public class VoterIdExecption extends Exception {
	
	public VoterIdExecption(int age) {
		System.out.println("nothong"+age);
	}
	public static void verifyAge(int age ) {
		if(age<18) {
			
			try {
				throw new ArithmeticException();
				
			}catch (Exception e) {
				System.out.println("Exception handled");
			}
		}
		

	}
	
	
	
	
	
	

	}


