//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
for (int i = 0; i < 11; i++) {
	int randomNumber = randomMaker.nextInt(3);
System.out.println(randomNumber);

if(randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You look cool");	
}
else if(randomNumber==1) {
	JOptionPane.showMessageDialog(null, "Your hair is nice");
}

else if(randomNumber==2) {
	JOptionPane.showMessageDialog(null, "Your shoes look cool");
}
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	
}
}