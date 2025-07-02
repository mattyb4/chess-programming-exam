package chess;

import java.util.ArrayList;
import java.util.Collection;

public class BishopMovesCalc implements PieceMovesCalc {
    @Override
    public Collection<ChessMove> calcMoves(ChessBoard board, ChessPosition currentPosition) {
        Collection<ChessMove> bishopMoves = new ArrayList<>();
        int row = currentPosition.getRow();
        int col = currentPosition.getColumn();
        int newRow = row;
        int newCol = col;
        var myPiece = board.getPiece(currentPosition);

        //move up right
        while(newRow < 8 && newCol < 8) {
            newRow++;
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move up left
        while(newRow < 8 && newCol > 1) {
            newRow++;
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move down right
        while(newRow > 1 && newCol < 8) {
            newRow--;
            newCol++;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
        }
        newRow = row;
        newCol = col;
        //move down left
        while(newRow > 1 && newCol > 1) {
            newRow--;
            newCol--;
            var newPosition = new ChessPosition(newRow,newCol);
            var obstructivePiece = board.getPiece(newPosition);
            if(obstructivePiece != null) {
                if(obstructivePiece.getTeamColor() != myPiece.getTeamColor()){
                    bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
                    break;
                }
                break;
            }
            bishopMoves.add(new ChessMove(currentPosition,newPosition,null));
        }

        return bishopMoves;
    }
}
