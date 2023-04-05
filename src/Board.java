import java.util.Scanner;

public class Board {
    private char[][] board;
    private char defaultCellValue= '*';

    public Board(){
        System.out.println("Initialising board");
        createBoard();
    }

    //static means stays the same for each instance
    public void displayBoard() {

        for (int row = 0; row < 3; row++) {
            String row_str = "";
            for (int col = 0; col < 3; col++) {
                row_str+= "| "+board[row][col];
//                System.out.println("row: " + row + ", col: " + col + " | " + board[row][col]);
            }
            System.out.println(row_str);
        }
    }

    private char[][] createBoard() {
        board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = defaultCellValue;
                        //(char) ('a' + col + row);
            }
        }
        return board;
    }

    public void gameLoop() {
        //ask user to display board char[][] board =
        //createBoard();

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (Yes/No)?");
        String userAnswer = input.nextLine();


        while (userAnswer.equals("Yes")) {
            displayBoard();
            System.out.println("Do you want to display the board (Yes/No)?");
            userAnswer = input.nextLine();
        }
        System.out.println("Bye");

    }


    public static void main(String[] args) {
        //Board testBoard = new Board();
        //testBoard.displayBoard();
        //testBoard.gameLoop();
    }

}