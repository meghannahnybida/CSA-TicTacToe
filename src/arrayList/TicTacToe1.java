package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe1 {

    //uses Lists to check for entered integers at the possible win combinations
    public static String checkForWinner(){
        List horizontalTop = Arrays.asList(1, 2, 3);
        List horizontalMiddle = Arrays.asList(4, 5, 6);
        List horizontalBottom = Arrays.asList(7, 8, 9);
        List verticalLeft = Arrays.asList(1, 4, 7);
        List verticalMiddle = Arrays.asList(2, 5, 8);
        List verticalRight = Arrays.asList(3, 6, 9);
        List diagonalLeft = Arrays.asList(1, 5, 9);
        List diagonalRight = Arrays.asList(3, 5, 7);

        ArrayList<List> winnerMatch = new ArrayList<>(); //an arrayList that adds each List to check for a win combination of positions
        winnerMatch.add(horizontalTop);
        winnerMatch.add(horizontalMiddle);
        winnerMatch.add(horizontalBottom);
        winnerMatch.add(verticalLeft);
        winnerMatch.add(verticalMiddle);
        winnerMatch.add(verticalRight);
        winnerMatch.add(diagonalLeft);
        winnerMatch.add(diagonalRight);

        for(List list : winnerMatch){ //a for each loop that checks to see if the user or comp ArrayList contain one of the win combinations
            if(Main1.user.containsAll(list)){
                return "Congrats!! You beat the computer.";
            }
            else if(Main1.comp.containsAll(list)){
                return "Yikes!! You lost...";
            }
        }
        if(Main1.user.size() + Main1.comp.size() == 9){ //checks to see if entire board is full (9 cells filled), it is a cat game
            return "CAT GAME!!! ";
        }
        return ""; //if board doesn't contain a winning condition or cat game, it returns this empty String back to the main method Main(); and loops through program again
    }
}
