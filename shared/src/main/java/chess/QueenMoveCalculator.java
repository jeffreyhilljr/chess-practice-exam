package chess;

import java.util.ArrayList;
import java.util.List;

public class QueenMoveCalculator implements PieceMoveCalculator {
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        List<ChessMove> moves = new ArrayList<>();

        moves.addAll(RookMoveCalculator.pieceMovesGetter(board, myPosition));
        moves.addAll(BishopMoveCalculator.pieceMovesGetter(board, myPosition));

        return moves;
    }
}
