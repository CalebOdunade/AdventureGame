/*
 * Lamp.java
 */
public class Lamp {
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
