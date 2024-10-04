/*
 * Player.java
 * Author:  Caleb Odunade
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
