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
                if(board.getPiece(new ChessPosition(r, c)) != null) {
                    moves.add(new ChessMove(myPosition, new ChessPosition(r, c), null));
                }
            }
        }
        return moves;
    }

}
