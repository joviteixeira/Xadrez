package boardgame;

public class Board {

    private int rows;
    private int colomns;
    private Piece[][] pieces;

    public Board(int rows, int colomns) {
        if (rows < 1 || colomns < 1){
            throw new BoardException("Error creating board: the must be at least 1 row and 1 column.");
        }
        this.rows = rows;
        this.colomns = colomns;
        pieces = new Piece[rows][colomns];
    }

    public int getRows() {
        return rows;
    }

    public int getColomns() {
        return colomns;
    }

    public Piece piece(int row, int colomn){
        if (!positionExist(row, colomn)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][colomn];
    }

    public Piece piece(Position position){
        if (!positionExist(position)){
            throw new BoardException("Position not on the board");
         }
        return pieces[position.getRow()] [position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExist(int row, int column){
        return row >=0 && row < rows && column >= 0 && column < colomns;
    }

    public boolean positionExist(Position position){
        return positionExist(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (positionExist(position)){
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}
