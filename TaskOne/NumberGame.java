import java.util.*;

class Game {
    private int randomNum;
    private int userGuess;
    private int noOfUserGuess = 0;
    private boolean isGameOver = false;
    private int level;

    public int getNoOfUserGuess() {
        return noOfUserGuess;
    }

    public void setNoOfUserGuess(int noOfUserGuess) {
        this.noOfUserGuess = noOfUserGuess;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public Game(int level) {
        Random random = new Random();
        this.level = level;

        switch (level) {
            case 1:
                this.randomNum = random.nextInt(20) + 1; // Random number between 1 and 20
                break;
            case 2:
                this.randomNum = random.nextInt(50) + 1; // Random number between 1 and 50
                break;
            case 3:
            default:
                this.randomNum = random.nextInt(100) + 1; // Random number between 1 and 100
                break;
        }

        System.out.println("\nThe range of guess is between 1 to  " + ((level == 1) ? 20 : (level == 2) ? 50 : 100));
        System.out.println("\nYou have only 3 Guess attempts limit \n");
        System.out.println("GUESS THE NUMBER BUDDY !!\n");
    }

    

    int userInput() {
        Scanner sc = new Scanner(System.in);
        this.userGuess = sc.nextInt();
        return userGuess;
    }

    boolean correctGuess() {
        noOfUserGuess++;
        if (userGuess == randomNum) {
            System.out.format("\nBuddy!! you Won , you guessed it right, it was  %d \n you guess in %d attempts \n",
                    randomNum, noOfUserGuess);
            setGameOver(true);
            return true;

        } else if (userGuess > randomNum) {
            System.out.println("you are far come Back  \n");
        } else if (userGuess < randomNum) {
            System.out.println("you are near go forward");
        }

        return false;

    }

}

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRestart = true;
        while (isRestart) {
            System.out.println("\n\n\nWelcome To NUMic Guess ");
            System.out.println("Choose a level: ");
            System.out.println("1. Easy (1 to 20)\n");
            System.out.println("2. Medium (1 to 50)\n");
            System.out.println("3. Hard (1 to 100)");
            System.out.print("\nEnter your choice: ");
            int level = sc.nextInt();
            Game G1 = new Game(level);
            boolean b = false;// b used for loop
            int attempts = 3;
            while (!b && attempts > 0) {
                G1.userInput();
                b = G1.correctGuess();
                attempts--;
            }

            if (!b) {
                System.out.println("\nSorry, you've run out of attempts. The correct number was " + G1.getRandomNum());
            }

            System.out.println("\nDo you want to play again? (yes/no)\n");
            String playAgain = sc.next();
            if (playAgain.equalsIgnoreCase("no")) {
                isRestart = false;
            } else {
                G1.setGameOver(false);
                G1.setNoOfUserGuess(0);
            }
        }
        sc.close();
    }
}