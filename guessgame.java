import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);

        int min = 1;
        int max = 20;
        int total_attempts = 10;

        boolean play_again = true;
        while (play_again) {
            int randomNum = min + 1 + (int) (Math.random() * ((max - min - 1) + 1));
            System.out.println("\n...Lets play the guess game...\n\n");
            System.out.println("The computer has generated a number between " + min + " and " + max);
            System.out.println("\n\nNow you have to guess the number so lets begin:");

            int attempts = 0;
            while (attempts < total_attempts) {

                int guess = gs.nextInt();
                attempts++;

                if (guess > randomNum) {
                    System.out.println("try small number");
                }

                else if (guess < randomNum) {
                    System.out.println("try big number");
                }

                else {
                    System.out.println("***You have guessed the correct number***");
                    System.out.println("You have guessed the number in " + attempts + " attempts out " + total_attempts
                            + " attempts");

                            if (attempts >= 1 && attempts <= 3) {
                                System.out.println("**************************************************");
                                System.out.println("\t\t===>Excellent<===");
                                System.out.println("\n**************************************************");
                            }
        
                            else if (attempts >= 4 && attempts <= 6) {
                                System.out.println("**************************************************");
                                System.out.println("\t\t===>Good<===");
                                System.out.println("\n**************************************************");
                            }
        
                            else {
                                System.out.println("***********************************************************");
                                System.out.println("\t\t===>You can do better<===");
                                System.out.println("\n***********************************************************");
                            }
                    break;
                }

            }
            if (attempts == total_attempts) {
                System.out.println("Oh no! you have reached the maximum number of attempts better luck next time");
            }

            System.out.println("Are you willing to play again (yes/no)");
            String playnot = gs.next().toLowerCase();

            play_again = playnot.equals("yes");
        }
    }
}






