package chessgame.pieces;

import boardgame.Board;
import boardgame.Position;
import chessgame.ChessPiece;
import chessgame.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
