package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	          Robot r2d2= new Robot ();
               r2d2.hide();

        // 3. Put the robot's pen down
    	          r2d2.penDown();


        // 6. Make the robot move as fast as possible
    	          r2d2.setSpeed(100);


        // 5. Use a for loop to repeat everything below 4 times. 
    	          for(int i=0; i<20; i++) {
    	          


        //         2. Move your robot 200 pixels
    	                  r2d2.move(50);


        //         4. Turn the robot 90 degrees to the right
    	                  r2d2.turn(360/10);

    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
    }
}