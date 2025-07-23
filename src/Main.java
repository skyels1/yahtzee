import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int rollDie() {
        Random rand = new Random();
        int[] die = {1,2,3,4,5,6};
        int power = rand.nextInt(50);
        int turns = rand.nextInt(power+1);
        int startNum = rand.nextInt(6);
        int roll = (turns + startNum)%6;

        return die[roll];
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int die1 = rollDie();
        int die2 = rollDie();
        int die3 = rollDie();
        int die4 = rollDie();
        int die5 = rollDie();
        int[] iniRoll = {die1, die2, die3, die4, die5};

        System.out.println("Select the dice you want to re-roll, \n" +
                "and type their position, then separate \n" +
                "them with ',' eg (1,4,5) do not just put the number rolled, \n" +
                "put the position");
        System.out.println("First roll is " + Arrays.toString(iniRoll));



        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            String[] tokens = input.split(",");
            for (String token : tokens) {
                try {
                    int dieIndex = Integer.parseInt(token) - 1;
                    if (dieIndex >= 0 && dieIndex < 5) {
                        iniRoll[dieIndex] = rollDie();
                    } else {
                        System.out.println("Invalid die number: " + (dieIndex + 1));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: " + token);
                }
            }
        }


        System.out.println("Second roll is " + Arrays.toString(iniRoll));


        String input2 = scanner.nextLine();

        if (!input2.isEmpty()) {
            String[] tokens = input2.split(",");
            for (String token : tokens) {
                try {
                    int dieIndex = Integer.parseInt(token) - 1;
                    if (dieIndex >= 0 && dieIndex < 5) {
                        iniRoll[dieIndex] = rollDie();
                    } else {
                        System.out.println("Invalid die number: " + (dieIndex + 1));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: " + token);
                }
            }
        }


        System.out.println("Third roll is " + Arrays.toString(iniRoll));
    }

}