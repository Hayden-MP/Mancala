package game;

public class Board {
	
	int[] board;
	int playerPosition = 0;

	public Board() {
	  board = new int[14];
	  setUp();
	}
	
	  
	// Move Player marbles around board - returns the index of where the last marble dropped
	public int playerMoveMarbles(int index) {
		playerPosition = index;
	    int numMarbles = board[index];

	    // If they try to move marbles from an empty slot - forfeit a turn
	    if(board[playerPosition] == 0) {
	      System.out.println("You picked a slot with 0 marbles!");
	      return playerPosition;
	    }
	    
	    // If there are marbles in the slot -- start at 0, increment for the number of marbles at index
	    for(int i = 0; i <= numMarbles; i++) {
	      
	      // CHECKS

	      // Check to see if on first increment, set slot to 0
	      if(i == 0) {
	        board[playerPosition] = 0;
	        playerPosition++;
	        continue;
	      }
	      
	      // check first to see if player is at end of board
	      if(playerPosition == board.length) {
	        playerPosition = 0;
	      }

	      // if player position is in opponent manacala, do not distribute a marble
	      if(playerPosition == 0) {
	        playerPosition++;
	        continue;
	      } 
	      
	      // Add one marble to each passed slot
	      board[playerPosition] = board[playerPosition] + 1;
	      
	      // Increment player position on board
	      playerPosition++;


	      // DETERMINE RULES 



	      
	    }

	    return playerPosition - 1;
	  }


	// Creates a brand new board
	public void setUp() {

		for(int i = 0; i < board.length; i++) {

	      // Opponents mancala slot
	      if(i == 0) {
	        board[i] = 0;
	        continue;
	      }
	      // player's mancala slot
	      else if(i == 7) {
	        board[i] = 0;
	        continue;

	      // testing operations
	      //} else if (i == 6) {
	        //board[i] = 10;
	        //continue;

	      } else {
	        board[i] = 4;
	      }  
	        
	    }
	  }

	// Displays the current board array
	public void displayBoard() {

	    System.out.printf("%n%n%30s%n","M A N C A L A");
	    System.out.printf("%32s%n","_________________");
	    System.out.printf("%15s %17s%n", "|", "|");
	    System.out.printf("%15s %3d %d %d %d %d %d %3s%n", "  |", 
	                          board[13], board[12], board[11], board[10], board[9], board[8], "|");
	    System.out.printf("%15s %d %13d %s%n", "  |", board[0], board[7], "|");
	    System.out.printf("%15s %3d %d %d %d %d %d %3s%n", "  |", 
	                          board[1], board[2], board[3], board[4], board[5], board[6], "|");
	    System.out.printf("%33s%n","|_________________|");
	    System.out.printf("%19s %s %s %s %s %s%n", "^","^","^","^","^","^");
	    System.out.printf("%19s %s %s %s %s %s%n", "a","b","c","d","e","f");

	  }

	
	public String toString() {

		StringBuilder sb = new StringBuilder();
	    for(int i : board) {
	      sb.append(board[i] + " ");
	    }
	    return sb.toString();
	}

}
