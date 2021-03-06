import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

import ansi_terminal.*;

public class World {

private ArrayList<Room> rooms;
    
	public World() {

	rooms = new ArrayList<Room>();
	Scanner in = new Scanner(System.in);
	try {
		FileInputStream file = new FileInputStream("Room1.txt");
		in = new Scanner(file);
		Room room1 = new Room(in);
		rooms.add(room1);
	} catch (FileNotFoundException e) {
		System.out.println("There is no where to go");
		System.exit(-1);
	}

	try {
		FileInputStream file = new FileInputStream("Room2.txt");
		in = new Scanner(file);
		Room room2 = new Room(in);
		rooms.add(room2);
	} catch (FileNotFoundException e) {
		System.out.println("There is no where to go");
		System.exit(-1);
	} 		
 		
	try {
		FileInputStream file = new FileInputStream("Room3.txt");
		in = new Scanner(file);
		Room room3 = new Room(in);
		rooms.add(room3);
	} catch (FileNotFoundException e) {
		System.out.println("There is no where to go");
		System.exit(-1);
	} 		


	}

	public Room getStartRoom() {
	
	return rooms.get(0);

	}

	public Room getSecondRoom() {

	return rooms.get(1);

	}

	public Room getFinalRoom() {

	return rooms.get(2);

	}

}

/*	public static Player givePlayerPosition(Player player) {
        	int xPlayerPosition = 0;
        	int yPlayerPosition = 0;
        	int row = 0;
        	int col = 0;
        	for (row = 0; row < grid.length; row++) {
            		if (grid[row].charAt(col) == '@') {
                		xPlayerPosition = row;
                		yPlayerPosition = col;
            		}
        	}
        return new Player(xPlayerPosition, yPlayerPosition);
	}
	

}

    private Room room1;  
    private ArrayList<Room> rooms;
    private static String[] grid;
    private static ArrayList<Item> scatteredItems;

    public World() {
        setupMap();
        scatteredItems = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            scatteredItems.add(ItemGenerator.generate());
	
	rooms = new ArrayList<Room>();
	Scanner in = new Scanner(System.in);
	try {
		FileInputStream file = new FileInputStream("Room1.txt");
		in = new Scanner(file);
		Room room1 = new Room(in);
		rooms.add(room1);
	} catch (FileNotFoundException e) {
		System.out.println("There is no where to go");

	} 	
		
	} 
    }
    

    public static void setupMap() {
        grid = new String[] {
                "##################                          #########################           ",
                "##              ##                          ##                     ##           ",
                "##              ##                          ##         I           ##           ",
                "##    I         ##################          ##                     ##           ",
                "##                              ##          ##                     ##           ",
                "##              ##############  ##          #####################  ##           ",
                "##              ##          ##  ##                             ##  ##           ",
                "##################          ##  #####################          ##  ##           ",
                "                            ##                     ##          ##  ##           ",
                "                            ##      I              ##          ##  ##           ",
                "                            ##                     ##          ##  ##           ",
                "                            ##               I     ##          ##  ##           ",
                "                            ##                     ##          ##  ##           ",
                "                            #################  ######          ##  ##           ",
                "                                           ##  ##              ##  ##           ",
                "                                           ##  ##              ##  ##           ",
                "                              ###############  ##################  ######       ",
                "                              ##                                       ##       ",
                "                              ##           I                           ##       ",
                "                              ##                                       ##       ",
                "    ############################                        I              ##       ",
                "    ##                                 I                               ##       ",
                "    ##  ########################                                       ##       ",
                "    ##  ##                    ##                                       ##       ",
                "    ##  ##                    ####################  #####################       ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                      ##  ##                          ",
                "    ##  ##                                 #######  #######                     ",
                "    ##  ##                                 ##            ##                     ",
                "######  #####                              ##      I     ##                     ",
                "##  I      ##                              ##            ##                     ",
                "##      I  ##                              ################                     ",
                "##         ##                                                                   ",
                "##  S      ##                                                                   ",
                "##         ##                                                                   ",
                "#############                                                                   "};
    }

    public static void makeMap(int hrow, int hcol) {
        Terminal.clear();
        for (int row = 0; row < 40; row++) {
            for (int col = 0; col < 80; col++) {
                if (row == hrow && col == hcol) {
                    Terminal.setForeground(Color.YELLOW);
                    System.out.print("@");
                    Terminal.reset();
                } else {
                    char cell = grid[row].charAt(col);
                    if (cell == '#') {
                        System.out.print('\u2588');
                    } else {
                        System.out.print(cell);
                    }
                }
            }
        }

        System.out.print("\n\r");
    }

    public static void listInfo() {
        Terminal.setForeground(Color.BLUE);
        Terminal.warpCursor(1, 82);
        System.out.print("Commands:");
        Terminal.warpCursor(2, 85);
        System.out.print("Move: arrow keys");
        Terminal.warpCursor(3, 85);
        System.out.print("Help: ?");
        Terminal.warpCursor(4, 85);
        System.out.print("Pickup: p");
        Terminal.warpCursor(40, 0);
        Terminal.reset();
    }

    public static int placeItemSpace(int hrow, int hcol) {
        int itemPosition = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[hrow].charAt(hcol) == 'I') {
                itemPosition = grid[hrow].charAt(hcol);
            }
        }

        return itemPosition;
    }

    public static boolean isWall(int row, int col) {
        boolean is_Wall = false;
        if (grid[row].charAt(col) == '#') {
            is_Wall = true;
        }
        return is_Wall;
    }

    public static Player givePlayerPosition(Player player) {
        int xPlayerPosition = 0;
        int yPlayerPosition = 0;
        int row = 0;
        int col = 0;
        for (row = 0; row < grid.length; row++) {
            if (grid[row].charAt(col) == '@') {
                xPlayerPosition = row;
                yPlayerPosition = col;
            }
        }
        return new Player(xPlayerPosition, yPlayerPosition);
    }

}
*/
