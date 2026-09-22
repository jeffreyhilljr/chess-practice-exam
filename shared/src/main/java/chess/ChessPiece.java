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

    private ChessGame.TeamColor pieceColor;
    private ChessPiece.PieceType type;

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
        if (type == PieceType.KING) {
            return KingMoveCalculator.pieceMovesGetter(board, myPosition);
        } else if (type == PieceType.KNIGHT) {
            return KnightMoveCalculator.pieceMovesGetter(board, myPosition);
        } else if (type == PieceType.ROOK) {
            return RookMoveCalculator.pieceMovesGetter(board, myPosition);
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj)) {
            return false;
        } else if (obj.getClass() != ChessPiece.class) {
            return false;
        } else {
            ChessPiece other = (ChessPiece) obj;
            return this.type == other.type && this.pieceColor == other.pieceColor;
        }
    }

    @Override
    public String toString() {
        if (pieceColor == ChessGame.TeamColor.WHITE) {
            if (type == PieceType.PAWN) {
                return "P";
            } else if (type == PieceType.ROOK) {
                return "R";
            } else if (type == PieceType.KNIGHT) {
                return "N";
            } else if (type == PieceType.BISHOP) {
                return "B";
            } else if (type == PieceType.KING) {
                return "K";
            } else if (type == PieceType.QUEEN) {
                return "Q";
            } else {
                return "";
            }
        } else {
            if (type == PieceType.PAWN) {
                return "p";
            } else if (type == PieceType.ROOK) {
                return "r";
            } else if (type == PieceType.KNIGHT) {
                return "n";
            } else if (type == PieceType.BISHOP) {
                return "b";
            } else if (type == PieceType.KING) {
                return "k";
            } else if (type == PieceType.QUEEN) {
                return "q";
            } else {
                return "";
            }
        }
    }

//    public static void main(String[] args) {
//        ChessPiece piece = new ChessPiece(ChessGame.TeamColor.WHITE, PieceType.PAWN);
//        System.out.println(piece.toString());
//    }
}
