package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Aplic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();

		
		System.out.println("================================");
	    System.out.println("         CHESS GAME");
	    System.out.println("================================");
	    
		while (true) {
			try {
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				UI.clearScreen();
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				UI.clearScreen();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				UI.clearScreen();
			}
		}
	}

}
