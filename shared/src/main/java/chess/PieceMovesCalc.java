package chess;

import java.util.Collection;

public interface PieceMovesCalc {
    public Collection<ChessMove> calcMoves(ChessBoard board, ChessPosition currentPosition);
}
