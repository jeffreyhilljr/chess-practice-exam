package chess;

import java.util.ArrayList;
import java.util.List;

public class KnightMoveCalculator implements PieceMoveCalculator {
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessGame.TeamColor team = board.getPiece(myPosition).getTeamColor();

        List<ChessMove> moves = new ArrayList<>();

        int[][] positions = {{row + 1, col + 2}, {row + 1, col - 2}, {row - 1, col + 2}, {row - 1, col - 2}, {row + 2, col + 1}, {row + 2, col - 1}, {row - 2, col + 1}, {row - 2, col - 1}};

        for (int[] position : positions) {
            int r = position[0];
            int c = position[1];
            if (r > 0 && r < 9 && c > 0 && c < 9) {
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
        return moves;
    }
}
