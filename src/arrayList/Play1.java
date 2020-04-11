package arrayList;

public class Play1 {
    //dictates what marker is used for user vs computer
    //places a marker at the entered position on the board
    public static void placeMarker(char[][] board, int pos, boolean userTurn){
        char marker;
        if(userTurn){
            marker = Main1.userMarker;
            Main1.user.add(pos);
        }
        else{
            marker = Main1.compMarker;
            Main1.comp.add(pos);
        }
        if(pos == 1){
            board[0][0] = marker;
        }
        else if(pos == 2){
            board[0][2] = marker;
        }
        else if(pos == 3){
            board[0][4] = marker;
        }
        else if(pos == 4){
            board[2][0] = marker;
        }
        else if(pos == 5){
            board[2][2] = marker;
        }
        else if(pos == 6){
            board[2][4] = marker;
        }
        else if(pos == 7){
            board[4][0] = marker;
        }
        else if(pos == 8){
            board[4][2] = marker;
        }
        else if(pos == 9){
            board[4][4] = marker;
        }
    }
}
