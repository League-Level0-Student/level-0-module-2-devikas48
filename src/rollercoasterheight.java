import javax.swing.JOptionPane;

public class rollercoasterheight {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("How tall are you?");
	int howtallareyou = Integer.parseInt(question);
	if (howtallareyou >48) {
		JOptionPane.showMessageDialog(null, "You can ride the roller coaster");
	}
		
	if (howtallareyou <48) {
		JOptionPane.showMessageDialog(null, "You need to grow more first");
	}
	
			
}
}

