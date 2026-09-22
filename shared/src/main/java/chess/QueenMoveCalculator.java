package chess;

import java.util.ArrayList;
import java.util.List;

public class QueenMoveCalculator implements PieceMoveCalculator {

    @Override
    public List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        List<ChessMove> moves = new ArrayList<>();

        RookMoveCalculator ob = new RookMoveCalculator();
        BishopMoveCalculator ob2 = new BishopMoveCalculator();

        moves.addAll(ob.pieceMovesGetter(board, myPosition));
        moves.addAll(ob2.pieceMovesGetter(board, myPosition));

        return moves;
    }
}
