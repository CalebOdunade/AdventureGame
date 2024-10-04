/*
 * Lamp.java
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
