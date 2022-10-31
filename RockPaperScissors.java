import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int userchoice, compchoice;
        do {
            System.out.println("\nMenu: \n1.Rock \n2.Paper \n3.Scissors \n0.Exit");
            System.out.println("Choose your option! [1 or 2 or 3 or 0]");
            userchoice = sc.nextInt();

            if (userchoice == 0) {
                System.out.println("Exited Successfully!");
            } else {
                //Computer Choice
                compchoice = r.nextInt(3) + 1;

                switch (userchoice) {
                    case 1: {
                        System.out.println("Player's Choice: Rock!");
                        break;
                    }
                    case 2: {
                        System.out.println("Player's Choice: Paper!");
                        break;
                    }
                    case 3: {
                        System.out.println("Player's Choice: Scissors!");
                        break;
                    }
                }

                switch (compchoice) {
                    case 1: {
                        System.out.println("Computer's Choice: Rock!");
                        break;
                    }
                    case 2: {
                        System.out.println("Computer's Choice: Paper!");
                        break;
                    }
                    case 3: {
                        System.out.println("Computer's Choice: Scissors!");
                        break;
                    }
                }

                //Actual Function
                if (compchoice == userchoice) {
                    System.out.println("Result: It's a Tie");
                } else if (userchoice == 1 && compchoice == 2) {
                    System.out.println("Result: Computer Wins!");
                } else if (userchoice == 2 && compchoice == 3) {
                    System.out.println("Result: Computer Wins");
                } else if (userchoice == 3 && compchoice == 1) {
                    System.out.println("Result: Computer Wins!");
                } else
                    System.out.println("Result: Player Wins!!");
            }
        } while (userchoice != 0) ;
    }
}
