package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	 

	public Color getColor() {
		return color;
	}

	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	private Color color;
	
}
