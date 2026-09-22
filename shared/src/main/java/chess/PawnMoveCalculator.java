package chess;

import java.util.ArrayList;
import java.util.List;

public class PawnMoveCalculator implements PieceMoveCalculator{
    static List<ChessMove> pieceMovesGetter(ChessBoard board, ChessPosition myPosition) {
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessGame.TeamColor team = board.getPiece(myPosition).getTeamColor();

        List<ChessMove> moves = new ArrayList<>();

        if (team == ChessGame.TeamColor.WHITE) {
            int c = col - 1;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row + 1, c);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != team) {
                    if (newPosition.getRow() == 8) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
            c = col + 1;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row + 1, c);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != team) {
                    if (newPosition.getRow() == 8) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
            if (row == 2) {
                ChessPosition newPosition = new ChessPosition(3, col);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                    ChessPosition newPosition2 = new ChessPosition(4, col);
                    if (board.getPiece(newPosition2) == null) {
                        moves.add(new ChessMove(myPosition, newPosition2, null));
                    }
                }
            } else {
                ChessPosition newPosition = new ChessPosition(row + 1, col);
                if (board.getPiece(newPosition) == null) {
                    if (newPosition.getRow() == 8) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
        }

        if (team == ChessGame.TeamColor.BLACK) {
            int c = col - 1;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row - 1, c);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != team) {
                    if (newPosition.getRow() == 1) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
            c = col + 1;
            if (c > 0 && c < 9) {
                ChessPosition newPosition = new ChessPosition(row - 1, c);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != team) {
                    if (newPosition.getRow() == 1) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
            if (row == 7) {
                ChessPosition newPosition = new ChessPosition(6, col);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                    ChessPosition newPosition2 = new ChessPosition(5, col);
                    if (board.getPiece(newPosition2) == null) {
                        moves.add(new ChessMove(myPosition, newPosition2, null));
                    }
                }
            } else {
                ChessPosition newPosition = new ChessPosition(row - 1, col);
                if (board.getPiece(newPosition) == null) {
                    if (newPosition.getRow() == 1) {
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moves.add(new ChessMove(myPosition, newPosition, null));
                    }
                }
            }
        }

        return moves;
    }
}
