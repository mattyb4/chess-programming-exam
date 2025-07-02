package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        if(type == PieceType.BISHOP) {
            return new BishopMovesCalc().calcMoves(board, myPosition);
        }
        if(type == PieceType.ROOK) {
            return new RookMovesCalc().calcMoves(board, myPosition);
        }
        if(type == PieceType.QUEEN) {
            Collection<ChessMove> queenMoves = new ArrayList<>();
            queenMoves.addAll(new RookMovesCalc().calcMoves(board,myPosition));
            queenMoves.addAll(new BishopMovesCalc().calcMoves(board,myPosition));
            return queenMoves;

        }
        if(type == PieceType.KNIGHT) {
            return new KnightMovesCalc().calcMoves(board, myPosition);
        }
        if(type == PieceType.KING) {
            return new KingMovesCalc().calcMoves(board, myPosition);
        }
        if(type == PieceType.PAWN) {
            return new PawnMovesCalc().calcMoves(board, myPosition);
        }
        else {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPiece that = (ChessPiece) o;
        return pieceColor == that.pieceColor && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, type);
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "pieceColor=" + pieceColor +
                ", type=" + type +
                '}';
    }
}
