package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args){
		int score=0;
		JOptionPane.showMessageDialog(null,"Hello...");
		JOptionPane.showMessageDialog(null,"Today we will be doing a short quiz...");
		JOptionPane.showMessageDialog(null,"Let's start with question #1");
		String User=JOptionPane.showInputDialog("Can a cow sleep standing up?");
		if(User.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null,"Correct...");
		score=score+1;
		}
		else{JOptionPane.showMessageDialog(null, "Wrong...");
		JOptionPane.showMessageDialog(null,"Next question...");
		String User1=JOptionPane.showInputDialog("Can sloths swim?");
		if(User1.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null,"Correct...");
			score=score+1;
		}
		else{JOptionPane.showMessageDialog(null, "Wrong...");
		JOptionPane.showMessageDialog(null,"Next question...");
	}

}
}
}