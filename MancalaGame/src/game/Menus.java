package game;

// A class that displays various menus of the game
public class Menus {

	public void startMenu() {
	    System.out.printf("%n%n%29s%n","Welcome  to");
	    System.out.printf("%25s%n", "--");
	    System.out.printf("%30s%n","M A N C A L A");
	    System.out.printf("%n%33s%n", "1 -- Start new game");
	    System.out.printf("%36s%n", "2 -- Choose difficulty");
	    System.out.printf("%29s%n", "3 -- Show rules");
	    System.out.printf("%23s%n", "4 -- Quit");
	 }

	public void rulesMenu() {
		System.out.printf("%n%n%26s%n","Rules");
	    System.out.printf("%26s%n", "-----");
	    System.out.printf("%n%30s%n%n", "1 -- Objective");
	    System.out.println("Collect as many marbles in your Mancala as possible. \nThe Player with the most marbles in their Mancala \nin the end is the winner.\n");

	    System.out.printf("%n%29s%n", "2 -- Board");
	    System.out.printf("%32s%n","_________________");
	    System.out.printf("%15s %17s%n", "|", "|");
	    System.out.printf("%15s %3d %d %d %d %d %d %3s%n", "  |", 
	                          4, 4, 4, 4, 4, 4, "|");
	    System.out.printf("%15s %d %13d %s%n", "Opponent -> |", 0, 0, "| <- Player");
	    System.out.printf("%15s %3d %d %d %d %d %d %3s%n", "  |", 
	                          4, 4, 4, 4, 4, 4, "|");
	    System.out.printf("%33s%n","|_________________|");
	    System.out.printf("%19s %s %s %s %s %s%n", "^","^","^","^","^","^");
	    System.out.printf("%19s %s %s %s %s %s%n", "a","b","c","d","e","f");
	    System.out.println("\nEach slot starts with 4 marbles and 0 in each Mancala.\nYour Mancala (the Player) is on the right while the\nOpponent is on the left.\n\n");

	    System.out.printf("%29s%n%n", "3 -- Rules");
	    System.out.println("You control the marbles on the bottom row, labelled\nwith letters. Choose a letter to take all the marbles\nin that slot and distribute them one by one in the slots\nahead in a counter-clockwise direction.\n\nIf you pass over your Mancala, distribute your marble\nand continue.\n\nIf you pass over your opponent's Mancala, skip over it\nand continue to distribute down the board.");
	    System.out.println("\nIf the last marble you distributed lands in your Mancala,\ntake another turn.");
	    System.out.println("\nIf the last marble you distributed lands in one of \nyour slots, if the slot is empty, then that marble \nalong with the marbles in the slot of your opponent \nacross the board are taken into your Mancala.");
	    System.out.println("\nThe game ends when one player's slots are completely empty.\nThe player with the empty row then takes all the remaining \nmarbles from their opponent and places them \nin their Mancala.");
	    System.out.println("\nTotal the number of marbles in each Mancala. The player \nwith the most marbles wins.");
	}
}
