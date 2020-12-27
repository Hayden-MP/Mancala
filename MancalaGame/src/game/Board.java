package game;

public class Board {
	
	int[] board;
	int playerPosition;

	public Board() {
	  board = new int[14];
	  setUp();
	}
	
	  
	// Move marbles around board - returns the index of where the last marble dropped
	public int playerMoveMarbles(int index) {
		// Player position starts at index
	    playerPosition = index;
	    int numMarbles = board[index];

	    // If they try to move marbles from an empty slot - forfeit a turn
	    if(board[playerPosition] == 0) {
	      System.out.println("You picked a slot with 0 marbles!");
	      return playerPosition;
	    }
	    
	    // If there are marbles in the slot -- start at 0, increment for the number of marbles at index
	    for(int i = 0; i <= numMarbles; i++) {
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
	      // increment player position to index 1 and distribute there instead
	      if(playerPosition == 0) {
	        playerPosition++;
	      } 

	      board[playerPosition] = board[playerPosition] + 1;
	      playerPosition++;
	    }
	    // DETERMINE RULES - seperate methods

	    return playerPosition - 1;
	  }


	  // lastIndex = playerPosition
	public void rules(int lastIndex) {
		
		// Index 7 is the players Mancala
		if(lastIndex == 7) {
	      System.out.println("Player gets another turn");
	    }

	    if((lastIndex > 0) && (lastIndex < 7) && (board[lastIndex] == 1)) {
	      int playerDistance = 7 - lastIndex;
	      int opponentDistance = 7 + playerDistance;

	      if(board[opponentDistance] != 0) {

	        int opponentMarbles = board[opponentDistance];
	        int playerMarbles = board[lastIndex];
	        board[opponentDistance] = 0;
	        board[lastIndex] = 0;

	        // Index 7 is the players Mancala
	        board[7] = board[7] + opponentMarbles + playerMarbles;
	        System.out.println("Captured!");

	      }
	    }
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
