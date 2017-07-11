/**
 * Created by Jared on 7/11/17.
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String name;
        String exit;
        System.out.println("Let's use conditional statements to automate the decision-making process!");
        System.out.println("");
        System.out.println("What's your name, stranger?");
        System.out.println("");
        name = scan.nextLine();
        System.out.println("");
        System.out.println("Thanks for stopping by, " + name + "!");

        do {
            System.out.println(" ");
            System.out.println("Please enter a whole number between 100 and 1: ");
            System.out.println("");
            number = scan.nextInt();
            System.out.println("");
            if (number > 0 && number < 101)
            {
                integerOverHundred(number);
            }
            else
             {
                System.out.println("Incorrect. Please enter a whole number between 100 and 1: ");
                System.out.println("");
                number = scan.nextInt();
                System.out.println("");
                integerOverHundred(number);
            }
            scan.nextLine();//remove the extra newline from the input stream
            System.out.println("Continue? " +
                    "Y/N");
            System.out.println("");
            exit = scan.nextLine();
        }
        while (exit.contains("y") || exit.contains("Y")) ;
        System.out.println("");
        System.out.println("Bye " + name + "!");
        {
        }
        }
        public static void integerOverHundred(int number) {
            if (number > 0 && number < 101 && number % 2 == 0) {
                if (number < 25)
                {
                    System.out.println(number + " is even and less than 25.");
                    System.out.println(" ");
                }
                else if (number > 25 && number <= 60)
                {
                    System.out.println("Even.");
                    System.out.println(" ");
                }
                else if (number > 60)
                {
                    System.out.println(number + " is even.");
                    System.out.println("");
                }
                else
                {
                    System.out.println("Thanks for your input!");
                    System.out.println("");
                }
            }
            else if (number > 0 && number < 101 && number % 2 == 1) {
                System.out.print(number + " is odd");
                if (number > 60)
                {
                    System.out.print(" and over 60");
                }
                System.out.println(".");
                System.out.println(" ");
            }
        }

        }



