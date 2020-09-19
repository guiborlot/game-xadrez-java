package applicattion;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {		
		
		/*Instacia da partida de xadrez*/
		ChessMatch chessMatch = new ChessMatch();
		
		/*Printa na tela o tabuleiro passando como parametro as peças*/
		UI.printBoard(chessMatch.getPieces());
	}
}
