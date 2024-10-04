/*
 * Lamp.java
 * Author:  Caleb Odunade
 * Submission Date:  [Submission date here]
 *
 * Purpose: This turns on and off the Lamp and checks if the lamp is lit
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class Lamp {
	
	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	private boolean isLit = false;
	
    public boolean getIsLit() {
        return isLit;
    }
    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
    }
    public void lightLamp() {
        isLit = true;
    }
    
    public void unLightLamp() {
        isLit = false;
    }
}