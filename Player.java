/*
 * Player.java
 * Author:  Caleb Odunade
 * Submission Date:  [Submission date here]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
public class Player {
    private int xCoord;
    private int yCoord;
    private Lamp lamp;
    private Key key;
    
    public Player () {
    	this.xCoord = 0;
    	this.yCoord = 0;
    	this.lamp = null;
    	this.key = null;
    }
    public int getX() {
        return xCoord;
    }
    
    public int getY() {
        return yCoord;
    }
    public void setX(int xCoord) {
        this.xCoord = xCoord;
    }
    
    public void setY(int yCoord) {
        this.yCoord = yCoord;
    }
    
    public void setPosition(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    
    public Lamp getLamp() {
    	return lamp;
    }
    
    public void setLamp(Lamp lamp) {
    	this.lamp = lamp;
    }
    
    public Key getKey () {
    	return key;
    }
    public void setKey (Key key) {
    	this.key =key;
    }
}
