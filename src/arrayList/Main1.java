package arrayList;

import java.util.*;

public class Main1 {

    public static char userMarker = 'X';
    public static char compMarker = 'O';
    public static ArrayList<Integer> user = new ArrayList<>();
    public static ArrayList<Integer> comp = new ArrayList<>();

    //message that is displayed at the start of the game
    public static void openingMessage(char[][] board){
        System.out.println("        Tic Tac Toe");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("You: X, Computer: O");
        displayBoard(board);
        System.out.println("Example input: entering 1 would put an X in the top left corner");
    }
    //initializes the appropriate amount of spaces for the board
    public static void displayBoard(char[][] board)
    {
        for(int r = 0; r < board.length; ++r){
            for(int c = 0; c < board[r].length; ++c){
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        char[][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}}; //the design of the board
        boolean userTurn = true;
        openingMessage(board);
        while(true){
            System.out.println();
            int entry = 0;
            if(userTurn){ //if it is the user's turn they are prompted to place an X
                System.out.println("Enter a number (1 - 9) to place an X >> ");
                entry = input.nextInt();
                while(user.contains(entry) || comp.contains(entry)){ //this while loop checks the ArrayLists to see if user entered a cell that is already counted for in the ArrayList
                    System.out.println("Error!! Choose a cell that isn't full >> ");
                    entry = input.nextInt();
                }
            }
            if(!userTurn){ //if it is not the user's turn, the computer places an X
                entry = r.nextInt(9) + 1;
                System.out.println("Comp is thinking of its next move . . .");
                Thread.sleep(1700); //a medium length wait time to simulate thinking
                while(user.contains(entry) || comp.contains(entry)){
                        entry = r.nextInt(9) + 1; //computer chooses its position randomly from 1 - 9. My multidimensional tic tac toe's AI is slightly more complex than this, but this is still good ! :)

                }
            }

            Play1.placeMarker(board, entry, userTurn);
            displayBoard(board);

            String gameOutcome = TicTacToe1.checkForWinner(); //initialized this variable to be the "checker" for the String class checkForWinner
            if(gameOutcome.length() > 1){ //program is able to simply check if there was a winner by seeing if the String returned was over 1 length long. The default return length was 0.
                System.out.println("\n");
                System.out.println("End of game board:");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                displayBoard(board);
                System.out.println(gameOutcome); //prints the end of game message that was returned in the method checkForWinner
                break;
            }
            //this block of code simply loops the program
            if(userTurn){
                userTurn = false;
            }
            else if(!userTurn){
                userTurn = true;
            }
        }
    }
}
