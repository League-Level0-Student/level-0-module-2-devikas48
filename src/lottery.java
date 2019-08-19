import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	
	String message = "";
	
	for (int i = 0; i < 5; i++) {
	int randomNumber = new Random().nextInt(60);
	message=message+randomNumber+" ";
	System.out.println(message);
	}
	
	JOptionPane.showMessageDialog(null, message, "Lottery Ticket", JOptionPane.QUESTION_MESSAGE);
	
	
	
	
	
	
	
	
	
}
}
