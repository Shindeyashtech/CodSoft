# CodSoft
CodSoft Internship Program (Java Programming )
1. Import Statements:
   import java.util.*;
   - This imports all classes from the `java.util` package, which includes the `Scanner` and `Random` classes used in the program.
2. Game Class
   - This class represents the game logic.
3. Fields of Game Class:
   private int randomNum;
   private int userGuess;
   private int noOfUserGuess = 0;
   private boolean isGameOver = false;
   private int level;
   - These fields represent the game state, including the randomly generated number (`randomNum`), user's guess (`userGuess`), number of guesses made by the user (`noOfUserGuess`), game over status (`isGameOver`), and the game level (`level`).
4. Getters and Setters:
   // Getters and setters for various fields (randomNum, noOfUserGuess, isGameOver, level)
     - These methods provide encapsulated access to the private fields of the `Game` class.
5. Constructor
   Game(int level) {
       // Constructor that initializes the game with a specified level
       // Generates a random number within the range based on the level
   }
   - This constructor initializes the game with a specified level. It generates a random number within the range based on the selected level.
6. Switch Statement in Constructor
   switch (level) {
       // Generates random number based on the selected level
   }
   - This `switch` statement sets the `randomNum` based on the selected level. It generates a random number within different ranges for different levels.
7. User Input Method:
   int userInput() {
       // Takes user input for guessing the number
   }
   - This method prompts the user to input their guess and returns the entered value.
8. Correct Guess Method:
   boolean correctGuess() {
       // Checks if the user's guess is correct and provides feedback
   }
   - This method compares the user's guess with the random number and provides feedback to the user. It returns `true` if the guess is correct.
9. Main Class (NumberGame):
   - This class contains the main method to start the game.
10. Main Method:
    public static void main(String[] args) {
        // Main method to start the game
    }
    - This is the entry point of the program where the game is initialized and played.
11. Scanner Initialization
    Scanner sc = new Scanner(System.in);
    - This initializes a `Scanner` object to read input from the user.
12. Game Initialization and Level Selection
    System.out.println("Choose a level: ");
    // Displays level options (Easy, Medium, Hard)
    int level = sc.nextInt();
    // Reads the user's selected level
    Game G1 = new Game(level);
    // Initializes the game with the selected level
    - This prompts the user to choose a game level (Easy, Medium, Hard) and initializes the game accordingly.
13. Game Loop:
    while (!b && attempts > 0) {
        // Game loop continues until the user guesses correctly or runs out of attempts
        G1.userInput();
        // Takes user input for guessing the number
        b = G1.correctGuess();
        // Checks if the guess is correct
        attempts--;
        // Decrements the number of attempts
    }
   - This loop allows the user to make guesses until they either guess correctly or run out of attempts.
14. End of Game Message:
    if (!b) {
        // Displays a message if the user runs out of attempts
        System.out.println("Sorry, you've run out of attempts. The correct number was " + G1.getRandomNum());
    }
    - This displays a message if the user runs out of attempts without guessing the correct number.
15. Restart Option:
    System.out.println("Do you want to play again? (yes/no)");
    // Prompts the user to play again
    String playAgain = sc.next();
    // Reads the user's response
    if (playAgain.equalsIgnoreCase("no")) {
        // Exits the game if the user chooses not to play again
        isRestart = false;
    } else {
        // Resets the game if the user chooses to play again
        G1.setGameOver(false);
        G1.setNoOfUserGuess(0);
    - This prompts the user to play again and resets the game if they choose to do so.
16.Resource Cleanup
    sc.close();
    - This closes the `Scanner` object to release system resources.

 

