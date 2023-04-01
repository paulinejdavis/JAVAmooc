import java.util.Scanner;

public class TicTacToe {
//    keyword that are reserved in java (public, class, static, void -OOP
        public static void main(String[] args) {

            //print to screen
            //welcome to tictactoe
//            System.out.println("Welcome Tic Tac Toe");
//            //datatupe name = value;
//
//            String greeting = "Welcome";
//            System.out.println(greeting);
//
//            int userNumber = 1;
//            System.out.println(userNumber);
//
//            double userScore = 0.5;
//            System.out.println(userScore);
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("What's your name?");
//            String userName = input.nextLine();
//            System.out.println(greeting+ " "+userName);
//
//            System.out.println("Enter a marker(number)");
//            int userMarker = input.nextInt();
//
//            System.out.println("You get to choose marker to mark squares " +userMarker+ " to mark squares");

            int count = 2;
            int winningNum = 3;
            //compare count to winning num
            System.out.println(count == winningNum);

            Scanner input = new Scanner(System.in);
            System.out.println("Input x or o");
            String userName = input.nextLine();
           // System.out.println((userName == "x")||(userName == "o"));
            System.out.println((userName.equals("x"))||(userName.equals("o")));
        }
    }
