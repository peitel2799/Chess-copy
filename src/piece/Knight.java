package piece;

import main.GamePanel;

public class Knight extends Piece{

    public Knight(int color, int row, int col) {
        super(color, row, col);
        if(color == GamePanel.WHITE){
            image = getImage("/piece_image/w_knight");
        } else {
            image = getImage("/piece_image/b_knight");
        }
    }
    
    public boolean canMove(int targetRow , int targetCol){
        if(isWithinBoard(targetRow, targetCol) && isSamePosition(targetRow, targetCol) == false){
            if( Math.abs(targetRow - preRow) * Math.abs(targetCol - preCol) == 2){
                if(isValidSquare(targetRow, targetCol)){
                    return true;
                }
            }
        }
        return false;
    }
}
