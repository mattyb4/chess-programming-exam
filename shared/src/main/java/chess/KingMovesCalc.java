package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KingMovesCalc implements PieceMovesCalc {
    @Override
    public Collection<ChessMove> calcMoves(ChessBoard board, ChessPosition currentPosition) {
        Collection<ChessMove> kingMoves = new ArrayList<>();
        int row = currentPosition.getRow();
        int col = currentPosition.getColumn();
        int newRow = row;
        int newCol = col;
        var myPiece = board.getPiece(currentPosition);

        //move up
        if(newRow < 8) {
            newRow++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move up right
        if(newRow < 8 && newCol < 8) {
            newRow++;
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move up left
        if(newRow < 8 && newCol > 1) {
            newRow++;
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move right
        if(newCol < 8) {
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move left
        if(newCol > 1) {
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down
        if(newRow > 1) {
            newRow--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down right
        if(newRow > 1 && newCol < 8) {
            newRow--;
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down left
        if(newRow > 1 && newCol > 1) {
            newRow--;
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                kingMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }

        return kingMoves;
    }
}
