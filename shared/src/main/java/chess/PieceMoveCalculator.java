package chess;

import java.util.ArrayList;
import java.util.List;

public interface PieceMoveCalculator {
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        return new ArrayList<>();
    }
}
