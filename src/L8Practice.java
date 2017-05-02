//http://faculty.strose.edu/avitabij/csc202fall11/solutions/solution5.htm
//https://www.google.com/webhp?sourceid=chrome-instant&rlz=1C1CHZL_enUS679US679&ion=1&espv=2&ie=UTF-8#q=calculate+a+player%E2%80%99s+batting+statistics+java+solution

//created by Saritha on 04/20/17

import java.util.Scanner;

public class L8Practice {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);

        char anotherBatter;
        int hits, singles, doubles, triples, homeruns, walks, at_bats;
        double batting_average, slugging_average, on_base_percentage;


        //Prompt user for input
        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println("");


        do {


            System.out.print("Enter the number of hits: ");
            hits = scan.nextInt();

            System.out.print("Enter the number of doubles: ");
            doubles = scan.nextInt();

            System.out.print("Enter the number of triples: ");
            triples = scan.nextInt();

            System.out.print("Enter the number of homeruns: ");
            homeruns = scan.nextInt();

            System.out.print("Enter the number of walks: ");
            walks = scan.nextInt();

            System.out.print("Enter the number of at bats");
            at_bats = scan.nextInt();
            System.out.println();

            //Calculate the averages

            singles = (hits - homeruns - doubles - triples);
            batting_average = ((double) hits / at_bats);
            on_base_percentage = ((double) hits + walks) / ((double) at_bats + walks);
            slugging_average = ((double) singles + 2 * doubles + 3 * triples + 4 * homeruns) / at_bats;

            //print out values

            System.out.println("The number of singles is: " + singles);
            System.out.println("The batting average is: " + batting_average);
            System.out.println("The on base percentage is: " + on_base_percentage);
            System.out.println("The slugging average is: " + slugging_average);
            System.out.println("");

            boolean isValidInput = false;
            do {
                System.out.println("Would you like to calculate for another batter?(y/n): ");
                scan.nextLine();
                anotherBatter = scan.next().charAt(0);
                if (Character.toLowerCase(anotherBatter) == Character.toLowerCase('y')) {
                    System.out.println("Let's continue!");
                } else if (Character.toLowerCase(anotherBatter) == Character.toLowerCase('n')) {
                    System.out.println("Good Bye!");
                    isValidInput = true;
                    ;
                } else {
                    System.out.println("Sorry,Is not a valid input.");
                }
            } while (!isValidInput) ;

            } while (Character.toLowerCase(anotherBatter) == Character.toLowerCase('y'));


        }

    }



