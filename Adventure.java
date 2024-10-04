/*
 * Adventure.java
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
import java.util.Scanner;
public class Adventure {

	public static void main(String[] args) {
		Player player = new Player();
		Map map = new Map();
		Map gameMap = new Map(4); // Assuming a 4x4 map
		Scanner sc = new Scanner(System.in);
		Room currentRoom = map.getRoom(player.getX(), player.getY());
		System.out.println(currentRoom.getDescription());

		int currentX = player.getX();
		int currentY = player.getY();

		while (true) {

			String userAction = sc.nextLine().trim().toLowerCase();

			switch (userAction) {
			case "get lamp":
				if(currentRoom.getLamp() != null) {
					player.setLamp(currentRoom.getLamp());
					currentRoom.clearLamp();
					System.out.println("You have picked up the lamp.");
				} else {
					System.out.println("Sorry there is no lamp present!");
				}
				break;
			case "light lamp":
				if(player.getLamp() != null) {
					player.getLamp().lightLamp();
					System.out.println("The lamp is lit.");
				} else {
					System.out.println("You don't have a lamp to light.");
				}
				break;
			case "north":
				if(currentRoom.canGoNorth()) {
					player.setX(player.getX()- 1);
					currentRoom = map.getRoom(player.getX(), player.getY());
					System.out.println(currentRoom.getDescription());
				} else {
					System.out.println("You can't go that way.");
				}
				break;
			case "south":
				if ( currentRoom.canGoSouth()) {
					player.setX(player.getX() + 1);
					currentRoom = map.getRoom(player.getX(), player.getY());
					System.out.println(currentRoom.getDescription());

				} else {
					System.out.println("You can't go that way.");
				}
				break;
			case "west":
				if(currentRoom.canGoWest()) {
					player.setY(player.getY() - 1);
					currentRoom = map.getRoom(player.getX(), player.getY());
					System.out.println(currentRoom.getDescription());
				} else {
					System.out.println("You can't go that way.");
				}
				break;
			case "east": 
				if (currentRoom.canGoEast()) {
					player.setY(player.getY() + 1);
					currentRoom = map.getRoom(player.getX(), player.getY());
					System.out.println(currentRoom.getDescription());
				} else {
					System.out.println("Can't go that way.");
				}
				break;
			case "look":
				printRoom(currentRoom);
				if(currentRoom.getLamp() != null) {
					System.out.println("There is a lamp present");
				}
                break;
			case "get key":
				if(currentRoom.getKey() != null) {
					player.setKey(currentRoom.getKey());
					currentRoom.clearKey();
					System.out.println("OK");
				} else {
					System.out.println("No key present");
				}
				break;
			case "open chest": 
				if(currentRoom.getChest() != null) {
					if (!currentRoom.getChest().isLocked()) {
						System.out.println(currentRoom.getChest().getContents());
						System.out.println("Game Over!");
						System.exit(0);
					} else {
						System.out.println("The chest is locked");
					}
				} else {
					System.out.println("No chest present");
				}break; 
			case "unlock chest":
				if (player.getKey() != null ) {
					player.getKey().use(currentRoom.getChest());
					if (currentRoom.getChest() != null) {
						System.out.println("OK");	
					} else {
						System.out.println("No chest to unlock");
					}
				} else {
					System.out.println("Need a key to do any unlocking!");
				}
				break;	
			case "map": 
				gameMap.displayFancyMap(player.getX(), player.getY());
				break;
			case "help":
				System.out.println("These are the list of commands");
				System.out.println("look");
				System.out.println("get lamp");
				System.out.println("light lamp");
				System.out.println("get key");
				System.out.println("unlock chest");
				System.out.println("open chest");
				System.out.println("north");
				System.out.println("south");
				System.out.println("east");
				System.out.println("west");
				break;
			default:
				System.out.println("I'm sorry I don't know how to do that");
			}
			if (currentRoom.isDark() && (player.getLamp() == null || !player.getLamp().getIsLit())) {
				System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");

				userAction = sc.nextLine().trim().toLowerCase();
				if (userAction.equals("north") || userAction.equals("south") || 
						userAction.equals("east") || userAction.equals("west")) {
					System.out.println("You have stumbled into a passing grue, and have been eaten.");
					break; 
				}
			}


		}

	}
	private static void printRoom(Room room) {
        System.out.println(room.getDescription());
        
        // Print exits
        System.out.print("Exits are: ");
        if (room.canGoNorth()) {
            System.out.print("north ");
        }
        if (room.canGoSouth()) {
            System.out.print("south ");
        }
        if (room.canGoEast()) {
            System.out.print("east ");
        }
        if (room.canGoWest()) {
            System.out.print("west ");
        }
        System.out.println();
    }
}
