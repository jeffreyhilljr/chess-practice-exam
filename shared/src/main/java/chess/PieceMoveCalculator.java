package chess;

import java.util.List;

public interface PieceMoveCalculator {
    List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition);
}
