/*
 * Chest.java
 * Author:  Caleb Odunade
 */
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */
	private boolean locked;
	private Key lockedBy;
	private Key key;
	private String contents;
	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key key) {
		if (key != null) {
            this.locked = true;
            this.key = key;
        }
	}

	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {
		if (key != null && key.equals(this.key)) {
            this.locked = false;
            this.key = null; 
        }
	}

	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}



}
