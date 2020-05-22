package multiDimensional;

public class Main {

    public static void main(String [] args){

        char decider; //the char used to check if someone won the game through the char method winnerFound()

        TicTacToe.openingMessage();
        TicTacToe.makeBoard();

        do{
            TicTacToe.displayBoard();
            Play.userTurn(); //user plays
            decider = TicTacToe.winnerFound(); //checks to see if the user won after his/her last entry
            if(decider != TicTacToe.emptyMarker){ //if he/she didn't win, it moves on
                break;
            }
            Play.compTurn(); //computer plays
            decider = TicTacToe.winnerFound(); //checks to see if the computer won after its last placement
        } while(decider == TicTacToe.emptyMarker); //the program runs while the char decider is an empty char ' '

        //if the method winnerFound() finds a winner, it sends the winning piece (X or O) here
        if(decider == TicTacToe.userMarker){
            TicTacToe.displayBoard();
            System.out.println("Congrats! You won!!!"); //X wins (user, you!)
        }
        else{
            TicTacToe.displayBoard();
            System.out.println("You lost. Yikes...");  //O wins (opponent)
        }
    }
}
