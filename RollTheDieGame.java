package chapter4;
/* The objective of this game is to travel the entire game board of 20 spaces withing 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 -6) and advance the user that number of spaces on the game board. [Code for this is in Independent Exercise section]
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they're won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message like "You advance to space 22" is a bug.
 */
import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String[] args){

        Random random = new Random();

        //Initialize known variable
        int spaces = 20;
        int rolls = 5;
        int rollnumber = 1;
        int die = random.nextInt(6)+1;
        int dietotal = die;
        String blank = "";
        Scanner scanner = new Scanner(System.in);

        //Get unknown variables
        System.out.println("Lets play this game!");
        blank = scanner.nextLine();
        System.out.println("The rules of this game is pretty simple");
        blank = scanner.nextLine();
        System.out.println("You have board of 20 spaces");
        blank = scanner.nextLine();
        System.out.println("You have die and 5 rolls to reach last 20th space");
        blank = scanner.nextLine();
        System.out.println("If you will reach exactly 20th space - you win, otherwise - you lose");
        blank = scanner.nextLine();
        System.out.println("Lets try! Roll your first time!");
        blank = scanner.nextLine();
        while (dietotal!= spaces) {

            if (dietotal != spaces && rollnumber <= rolls) {
                rollnumber = 1;
                dietotal = die;
                while (rollnumber <= rolls && dietotal < spaces) {
                    System.out.println("Wow, nice throw!");
                    if (dietotal == spaces) {
                        System.out.println("Roll#" + rollnumber + " is " + die + ". And your position on board right now is " + dietotal);
                        System.out.println("Congratulations, you win!");
                    }
                    else {
                        System.out.println("Roll#" + rollnumber + " is " + die + ". And your position on board right now is " + dietotal + " and you have to go " + (spaces - dietotal) + " more");
                    }
                    rollnumber = rollnumber + 1;
                    if (rollnumber <= rolls && dietotal != spaces) {
                        die = random.nextInt(6) + 1;
                        dietotal = dietotal + die;
                    }
                    blank = scanner.nextLine();
                }
            }
            if (dietotal == spaces) {
                System.out.println("Roll#" + rollnumber + " is " + die + ". And your position on board right now is " + dietotal);
                System.out.println("Congratulations, you win!");
            }
            else if (dietotal > spaces) {
                System.out.println("Roll#" + rollnumber + " is " + die + ". It looks like your total die number more than 20, let me check it ...");
                blank = scanner.nextLine();
                System.out.println("Yep, your total is " + dietotal + ". It's too much, you need exactly 20 to win in this game, try one more time!");
                blank = scanner.nextLine();
                System.out.println("To start your new game just press enter");
                blank = scanner.nextLine();
            }
            else if (dietotal < spaces) {
                System.out.println("Oops, looks like your total die numbers is " + dietotal + ". It's not enough to win in this game, try one more time!");
                blank = scanner.nextLine();
                System.out.println("To start your new game just press enter");
                blank = scanner.nextLine();
            }
            if (dietotal != spaces){
                dietotal = 0;
                rollnumber = 1;
            }

        }
        scanner.close();
        //Results


    }
}
