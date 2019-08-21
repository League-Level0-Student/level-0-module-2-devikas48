import javax.swing.JOptionPane;

public class voting {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("How old are you? (in years)");
	int Howoldareyouinyears = Integer.parseInt(question);
	if  (Howoldareyouinyears >18) {
		JOptionPane.showMessageDialog(null, "Who should the next president be?");
	}
	
	if (Howoldareyouinyears <18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think haha");
	}
	
}
}
