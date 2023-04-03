import java.util.Scanner;

public class DemoFunctions {
    //write a function
    //ask user for name
    //(get user input)
    //display
    public static String getName(int userNumber) {
        Scanner inputGetter = new Scanner(System.in);
//        int userNumber = 1;
        String askForName = "What's your name (user " + userNumber + ")?";
//        String greeting = "Hello ";
        String userName;

        System.out.println(askForName);
        userName = inputGetter.nextLine();
        return userName;
//        System.out.println(greeting+userName);
    }

    public static int[] createArray() {
        int[] tempArray = {1, 2, 3};
        return tempArray;
    }

    public static int[] createArray2() {
        int[] tempArray = new int[3];
        tempArray[0] = 4;
        tempArray[1] = 5;
        tempArray[2] = 6;
        return tempArray;
    }

    public static void displayArray(int[] numbers) {
        int len = numbers.length;
        System.out.println("Length of array");
        System.out.println(len);
        System.out.println("Elements");
        for (int elem_no = 0; elem_no < len; elem_no++)
            System.out.println(numbers[elem_no]);


//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
    }

    public static char[][] createBoard() {
        char[][] board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = (char) ('a' + col + row);
            }
        }
        return board;
    }

    public static void displayBoard(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("row: " + row + ", col: " + col + " | " + board[row][col]);
            }
        }

    }

    public static void gameLoop() {
        //ask user to display board
        char[][] board = createBoard();

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to display the board (Yes/No)?");
        String userAnswer = input.nextLine();


        while(userAnswer.equals("Yes")) {
            displayBoard(board);
            System.out.println("Do you want to display the board (Yes/No)?");
            userAnswer = input.nextLine();
        }
        System.out.println("bye");

    }


    public static void main(String[] args) {

        gameLoop();
//        int number = 2;
//        String username = getName(number);
//        System.out.println("Hello " +username);

        //arrays
//        int[] nums = createArray();
//        int[] arrays_again = createArray2();
//
//        displayArray(nums);
//        displayArray(arrays_again);
//
//        char[][] board = createBoard();
//        displayBoard(board);

    }

}
