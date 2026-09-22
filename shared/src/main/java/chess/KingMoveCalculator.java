package chess;

import java.util.ArrayList;
import java.util.List;

public class KingMoveCalculator implements PieceMoveCalculator {
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessGame.TeamColor team = board.getPiece(myPosition).getTeamColor();

        List<ChessMove> moves = new ArrayList<>();

        for (int r = row - 1; r < row + 2; r++) {
            for (int c = col - 1; c < col + 2; c++) {
                if (r >= 0 && r <= 8 && c >= 0 && c <= 8) {
                    ChessPosition newPosition = new ChessPosition(r, c);
                    if (board.getPiece(newPosition) == null) {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    } else {
                        if (board.getPiece(newPosition).getTeamColor() != team) {
                            moves.add(new ChessMove(myPosition, newPosition, null));
                        }
                    }
                }
            }
        }
        return moves;
    }

}
