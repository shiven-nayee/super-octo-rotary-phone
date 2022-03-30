package Assessment;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, numOfRounds;

        System.out.println("How many rounds do you want to play?");
        numOfRounds = Integer.parseInt(input.nextLine());

        if(numOfRounds <= 10) {
            for(int i = 0; i < numOfRounds; i++) {
                int computerChoice  = (int)(Math.floor(Math.random() * (3-1+1)+1));
                System.out.print("Playing round: " + (i+1));
                System.out.println("Enter your choice \n (1) Rock \n (2) Paper \n (3) Scissors");
                choice = Integer.parseInt(input.nextLine());
                System.out.println("Computers Choice" + computerChoice);
                System.out.println("Users choice " + choice);
                if(choice == computerChoice) {
                    System.out.println("Ties");
                } else if (choice == 1 && computerChoice == 2) {
                    System.out.println("Computer wins with Paper(2)");
                } else if (choice == 1 && computerChoice == 3) {
                    System.out.println("User wins with Rock");
                } else if (choice == 2 && computerChoice == 1)  {
                    System.out.println("User wins with paper");
                } else if (choice == 2 && computerChoice == 3) {
                    System.out.println("Computer wins with scissors");
                } else if (choice == 3 && computerChoice == 1) {
                    System.out.println("Computer wins with Rock");
                } else if (choice == 3 && computerChoice == 1) {
                    System.out.println("User wins with scissors");
                } else {
                    System.out.println("Incorrect");
                }
            }
        } else {
            System.out.println("The number of rounds entered was incorrect.");
        }
    }
}