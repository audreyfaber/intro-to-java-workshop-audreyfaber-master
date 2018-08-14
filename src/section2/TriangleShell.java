package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot r2d2 = new Robot();

	void go() {

		// 6. Make the robot go as fast as possible
		r2d2.setSpeed(100);
		r2d2.penDown();
		r2d2.hide();

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {

			// 9. Change the color of the pen to a random color
			r2d2.setPenColor(Color.pink);

			// 8. Increase the length variable by 10
			length += 10;

			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
			    r2d2.turn(6);

		}

	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			r2d2.move(length);
			r2d2.turn(360/3);

		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}