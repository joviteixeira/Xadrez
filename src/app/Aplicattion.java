package app;

import chessgame.ChessMatch;

public class Aplicattion {

    public static void main(String []args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
