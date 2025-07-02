package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KnightMovesCalc implements PieceMovesCalc {
    @Override
    public Collection<ChessMove> calcMoves(ChessBoard board, ChessPosition currentPosition) {
        Collection<ChessMove> knightMoves = new ArrayList<>();
        int row = currentPosition.getRow();
        int col = currentPosition.getColumn();
        int newRow = row;
        int newCol = col;
        var myPiece = board.getPiece(currentPosition);

        //move up, two right
        if(newRow < 8 && newCol < 7) {
            newRow = newRow + 1;
            newCol = newCol + 2;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move two up, one right
        if(newRow < 7 && newCol < 8) {
            newRow = newRow + 2;
            newCol = newCol + 1;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move up, two left
        if(newRow < 8 && newCol > 2) {
            newRow = newRow + 1;
            newCol = newCol - 2;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move two up, one left
        if(newRow < 7 && newCol > 1) {
            newRow = newRow + 2;
            newCol = newCol - 1;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down, two right
        if(newRow > 1 && newCol < 7) {
            newRow = newRow - 1;
            newCol = newCol + 2;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down two, right one
        if(newRow > 2 && newCol < 8) {
            newRow = newRow - 2;
            newCol = newCol + 1;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down, left two
        if(newRow > 1 && newCol > 2) {
            newRow = newRow - 1;
            newCol = newCol - 2;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }
        newRow = row;
        newCol = col;

        //move down two, left one
        if(newRow > 2 && newCol > 1) {
            newRow = newRow - 2;
            newCol = newCol - 1;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece == null) {
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
            else if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                knightMoves.add(new ChessMove(currentPosition,newPosition,null));
            }
        }

        return knightMoves;
    }
}
