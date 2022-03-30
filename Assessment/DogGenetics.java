package Assessment;

import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("What is your dogs name?");
        name = input.nextLine();
        int[] percents = new int[5];
        int maxNum = 100;

        for(int i = 0; i < 5; i++) {
            if(maxNum > 1) {
                int random  = (int)(Math.floor(Math.random() * (maxNum-1+1)+1));
                System.out.println(random);
                percents[i] = random;
                maxNum -= random;
            }
        }
        
        System.out.println(percents[0] + "% St. Bernard");
        System.out.println(percents[1] + "% Chihuahua");
        System.out.println(percents[2] + "% Dramatic Rednosed Asian Pug");
        System.out.println(percents[3] + "% Common Cur");
        System.out.println(percents[4] + "% King Doberman");
        System.out.println("GOOD DOG");
    }
}
