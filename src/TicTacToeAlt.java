import java.util.Scanner;

public class TicTacToeAlt {
    Board tBoard;
    public TicTacToeAlt() {
        System.out.println("Welcome to Tic Tac Toe");
        tBoard=new Board();
    }
    public void gameLoop() {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (Yes/No)?");
        String userAnswer = input.nextLine();

        while (userAnswer.equals("Yes")) {
            tBoard.displayBoard();

            System.out.println("Do you want to display the board (Yes/No)?");
            userAnswer = input.nextLine();
        }
        System.out.println("Bye");
    }

    public static void main(String[] args) {
//        TicTacToeAlt tt = new TicTacToeAlt();
//        tt.gameLoop();

        User auser = new User();
        auser.setUsername("Donnie");
        auser.setMarker('x');

        System.out.println(auser.getUserName());
        System.out.println(auser.getMarker());
    }
}
