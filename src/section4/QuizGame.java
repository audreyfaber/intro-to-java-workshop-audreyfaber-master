package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		    int score=0;
		
		// 2.  Ask the user a question 
		    String answer= JOptionPane.showInputDialog("Was the first programmer a man or a woman?");
		
		// 3.  Use an if statement to check if their answer is correct
		       if(answer.equals("a woman")) {
		        JOptionPane.showMessageDialog(null, "Correct!");
		        score++;
		       }
		// 4.  if the user's answer is correct
		       else {
		    	   JOptionPane.showMessageDialog(null, "Incorrect. It was a woman.");
		        }
		        
		       String question= JOptionPane.showInputDialog("What is the most popular color in the world?");
		        if(question.equals("blue")) {
		        	JOptionPane.showMessageDialog(null, "Correct!");
		        	score++;
		        }
		        	else {
		        	JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is blue.");
		        	}
		        
	
	            String quiz= JOptionPane.showInputDialog("What is California's nickname?");
	            if(quiz.equals("The Golden State")) {
	             JOptionPane.showMessageDialog(null, "Correct!");
	            	score++;
	            }
	            else {
	            	JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is The Golden State.");
	            }
	            
	     String test=JOptionPane.showInputDialog("What is Earth- the third planet from the sun, the fourth, the fifth, or the second?");
	      if(test.equals("the third planet")){   
	    	  JOptionPane.showMessageDialog(null, "Correct!");
	    	  score++;
	      }
	      else {
	    	  JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is the third planet.");
	      }
	      
	      String game=JOptionPane.showInputDialog("In a pride of lions, do male lions hunt or female lions?");
	       if(test.equals("the female lions")) {
	    	   JOptionPane.showMessageDialog(null, "Correct!");
	    	   score++;
	    	   }
	       else {
	    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is female lions.");
	       }
	       System.out.println(score);
	       
	
	
	
	
	
	}
}
	
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	

