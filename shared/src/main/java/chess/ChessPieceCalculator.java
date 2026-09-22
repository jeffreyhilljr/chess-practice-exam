package chess;

import java.util.ArrayList;
import java.util.List;

public interface ChessPieceCalculator {
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        return new ArrayList<>();
    }
}
