package multiDimensional;

public class Play {

    //Allows user to enter the row and column they want to place the X in
    public static void userTurn() {
        System.out.println("Enter a number for row and column 0 - 2 >>");
        int row = TicTacToe.input.nextInt();
        int column = TicTacToe.input.nextInt();
        if (TicTacToe.board[row][column] != TicTacToe.emptyMarker) {
            System.out.println("Error. You entered coordinates that match a marker already placed. Try again >> ");
            userTurn();
        } else {
            TicTacToe.board[row][column] = TicTacToe.userMarker;
        }
    }

    //Allows computer to play user. It first attempts to place an O in a logical position, and then moves on to a
    //random cell if the cell is taken
    public static void compTurn() {
        if(TicTacToe.board[1][1] == TicTacToe.userMarker){
            if(TicTacToe.board[2][0] == TicTacToe.emptyMarker){
                TicTacToe.board[2][0] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[0][0] == TicTacToe.userMarker){
            if(TicTacToe.board[1][1] == TicTacToe.emptyMarker){
                TicTacToe.board[1][1] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[0][1] == TicTacToe.userMarker){
            if(TicTacToe.board[2][1] == TicTacToe.emptyMarker){
                TicTacToe.board[2][1] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[0][2] == TicTacToe.userMarker){
            if(TicTacToe.board[0][0] == TicTacToe.emptyMarker){
                TicTacToe.board[0][0] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[1][0] == TicTacToe.userMarker){
            if(TicTacToe.board[0][0] == TicTacToe.emptyMarker){
                TicTacToe.board[0][0] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[1][2] == TicTacToe.userMarker){
            if(TicTacToe.board[0][2] == TicTacToe.emptyMarker){
                TicTacToe.board[0][2] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[2][0] == TicTacToe.userMarker){
            if(TicTacToe.board[1][0] == TicTacToe.emptyMarker){
                TicTacToe.board[1][0] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[2][1] == TicTacToe.userMarker){
            if(TicTacToe.board[0][1] == TicTacToe.emptyMarker){
                TicTacToe.board[0][1] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else if(TicTacToe.board[2][2] == TicTacToe.userMarker){
            if(TicTacToe.board[1][1] == TicTacToe.emptyMarker){
                TicTacToe.board[1][1] = TicTacToe.compMarker;
            }
            else{
                randomAI();
            }
        }
        else{
            System.out.println("hi");
        }

    }
    //Fills an empty grid slot with an O if needed by the computerTurn() method
    public static void randomAI(){
        if(TicTacToe.board[0][0] == TicTacToe.emptyMarker){
            TicTacToe.board[0][0] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[0][1] == TicTacToe.emptyMarker){
            TicTacToe.board[0][1] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[0][2] == TicTacToe.emptyMarker){
            TicTacToe.board[0][2] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[1][0] == TicTacToe.emptyMarker){
            TicTacToe.board[1][0] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[1][1] == TicTacToe.emptyMarker){
            TicTacToe.board[1][1] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[1][2] == TicTacToe.emptyMarker){
            TicTacToe.board[1][2] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[2][0] == TicTacToe.emptyMarker){
            TicTacToe.board[2][0] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[2][1] == TicTacToe.emptyMarker){
            TicTacToe.board[2][1] = TicTacToe.compMarker;
        }
        else if(TicTacToe.board[2][2] == TicTacToe.emptyMarker){
            TicTacToe.board[2][2] = TicTacToe.compMarker;
        }
        else{
            int row;
            int column;
            for(row = 0; row < TicTacToe.board.length; row++){
                for(column = 0; column < TicTacToe.board.length; column++){
                    if(TicTacToe.board[row][column] != TicTacToe.emptyMarker){
                        TicTacToe.displayBoard();
                        System.out.println("CAT GAME!");
                        System.exit(0);
                    }
                }
            }
        }
    }
}