package chess;

import java.util.ArrayList;
import java.util.Collection;

public class RookMovesCalc implements PieceMovesCalc {
    @Override
    public Collection<ChessMove> calcMoves(ChessBoard board, ChessPosition currentPosition) {
        Collection<ChessMove> rookMoves = new ArrayList<>();
        int row = currentPosition.getRow();
        int col = currentPosition.getColumn();
        int newRow = row;
        int newCol = col;
        var myPiece = board.getPiece(currentPosition);

        //move up
        while(newRow < 8) {
            newRow++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    rookMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            rookMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move down
        while(newRow > 1) {
            newRow--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    rookMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            rookMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move right
        while(newCol < 8) {
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    rookMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            rookMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move left
        while(newCol > 1) {
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    rookMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            rookMoves.add(new ChessMove(currentPosition,newPosition,null));
        }

        return rookMoves;
    }
}
