package game;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	    
	    Scanner keyboard = new Scanner(System.in);
	    
	    Menus display = new Menus();
	    boolean end = false;

	    do {
	    	
	    	
	      display.startMenu();
	      int menuChoice = keyboard.nextInt();

	      // play new game
	      if(menuChoice == 1) {

	        Board board = new Board();
	        board.displayBoard();

	        // play game method
	        continue;
	   
	      } else if(menuChoice == 2) {

	        //choose difficulty of opponent
	        // 1 - random (easy)
	        // 2 - medium
	        // 3 - hard
	        continue;

	      } else if(menuChoice == 3) {

	        // display rules
	        display.rulesMenu();
	        continue;

	      } else if(menuChoice == 4) {

	        System.out.println("Thanks for playing!");
	        keyboard.close();
	        end = true;

	      } else {
	        System.out.println("Please choose a valid menu number");
	        continue;
	      }

	    } while(end == false);


	  }
}
