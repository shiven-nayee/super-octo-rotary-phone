package Assessment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age; 
        
        System.out.println("How old are you?");
        age = Integer.parseInt(input.nextLine());

        int max = 220 - age;
        int low = max/2;
        int high = (int)Math.round(max * .85);

        System.out.println("Max heart rate is: " + max);
        System.out.println("Max heart rate zone is " + low + " - " + high);
    }
}
