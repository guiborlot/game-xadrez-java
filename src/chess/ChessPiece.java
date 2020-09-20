package chess;

import boardgame.Board;
import boardgame.Piece;


public abstract class ChessPiece extends Piece {
	
	private Color color;

	// Passa pra classe Piece o board e recebe a cor das peças
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Retorna a cor das peças
	public Color getColor() {
		return color;
	}

	
}
