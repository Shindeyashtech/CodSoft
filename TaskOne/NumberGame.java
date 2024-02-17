import java.util.*;
class Game {

    public int randomNum;
    public int userGuess;
    public int noOfUserGuess = 0;

    public int getNoOfUserGuess() {
        return noOfUserGuess;
    }

    public void setNoOfUserGuess(int noOfUserGuess) {
        this.noOfUserGuess = noOfUserGuess;
    }

    Game() {

        Random random = new Random();
        this.randomNum = random.nextInt(101);
        System.out.println(randomNum);
    }

    int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number Buddy!!");
        System.out.println("You Have 3 Guess");
        this.userGuess = sc.nextInt();
        return userGuess;
    }

    boolean correctGuess() {
        noOfUserGuess++;
        if (userGuess == randomNum) {
            System.out.format("Buddy!! you Won , you guessed it right, it was  %d \n you guess in %d attempts \n",
                    randomNum, noOfUserGuess);
            return true;

        } else if (userGuess > randomNum) {
            System.out.println("you are far come Back ");
        } else if (userGuess < randomNum) {
            System.out.println("you are near go forward");
        }

        return false;

    }

}

public class NumberGame {

    public static void main(String[] args) {
        System.out.println("Welcome To NUMic Guess ");

        // System.out.println(randomNum);
        Game G1 = new Game();
        boolean b = false;// b used for loop
        do {
            G1.userInput();
            b = G1.correctGuess();
        } while (!b); // It will run until it's became a true

    }
}