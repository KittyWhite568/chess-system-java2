package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
		
		public ChessPiece[][] getPieces() {
			ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; 
			for (int i=0; i<board.getRows(); i++) {
				for (int j=0; j<board.getColumns(); j++) {
					mat[i][j] = (ChessPiece) board.piece(i, j);
				}
			}
			return mat;
		
	}
		
		
		private void initialSetup() {
			board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
<<<<<<< HEAD
			board.placePiece(new King(board, Color.BLACK), new Position(2, 1));
=======
			board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
>>>>>>> a5097031a2cd100c5b2ace5a2f3a88c44332f07b
			board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
		}

}
