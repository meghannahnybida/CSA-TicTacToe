package multiDimensional;

import java.util.Scanner;

public class TicTacToe {

    public static Scanner input = new Scanner(System.in);
    public static char userMarker = 'X';
    public static char compMarker = 'O';
    public static char emptyMarker = ' ';
    public static char[][] board = new char[3][3];

    //Message for user when game begins
    public static void openingMessage() {
        System.out.println("     Tic Tac Toe");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("You: X, Computer: O");
        System.out.println("Example input: the entry 0 0 will place an X in the top left grid\n");
    }

    //Creates appropriate amount of empty char spaces for the board
    public static void makeBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = emptyMarker;
            }
        }
    }

    //Displays the design of the board
    public static void displayBoard() {
        String top = "================";
        String barrier = "  ------------";
        System.out.println("   0   1    2   ");
        System.out.println(top);
        System.out.println("0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(barrier);
        System.out.println("1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(barrier);
        System.out.println("2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println(top);
    }

    //Checks for a winner horizontally, vertically, and diagonally.
    public static char winnerFound() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0]; //returns the winning piece (X or O) back to the Main()
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i]; //returns the winning piece (X or O) back to the Main()
            }
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2]){
            return board[2][0]; //returns the winning piece (X or O) back to the Main()
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return board[0][0]; //returns the winning piece (X or O) back to the Main()
        }
        return emptyMarker; //if no winner was found, it returns an empty char ' ' back to the Main()
    }
}