package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot r2d2=new Robot();
	
	

	void go() {
		r2d2.setSpeed(10);
		r2d2.penDown();
		for(int i=0;i<4;i++){
		r2d2.setPenWidth(5);
		r2d2.setRandomPenColor();
		r2d2.move(100);
		r2d2.turn(90);
		}
		
		
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
