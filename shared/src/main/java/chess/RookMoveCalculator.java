package chess;

import java.util.ArrayList;
import java.util.List;

public class RookMoveCalculator implements PieceMoveCalculator {

    @Override
    public List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessGame.TeamColor team = board.getPiece(myPosition).getTeamColor();

        List<ChessMove> moves = new ArrayList<>();

        int r = row;
        while (true) {
            r++;
            if (r > 0 && r < 9) {
                ChessPosition newPosition = new ChessPosition(r, col);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                } else {
                    if (board.getPiece(newPosition).getTeamColor() != team) {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                    break;
                }
            } else {
                break;
            }
        }

        r = row;
        while (true) {
            r--;
            if (r > 0 && r < 9) {
                ChessPosition newPosition = new ChessPosition(r, col);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                } else {
                    if (board.getPiece(newPosition).getTeamColor() != team) {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                    break;
                }
            } else {
                break;
            }
        }

        int c = col;
        while (true) {
            c++;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row, c);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                } else {
                    if (board.getPiece(newPosition).getTeamColor() != team) {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                    break;
                }
            } else {
                break;
            }
        }

        c = col;
        while (true) {
            c--;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row, c);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                } else {
                    if (board.getPiece(newPosition).getTeamColor() != team) {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                    break;
                }
            } else {
                break;
            }
        }

        return moves;
    }
}
