package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Aplic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();

		System.out.println("================================");
		System.out.println("         CHESS GAME");
		System.out.println("================================");

		while (!chessMatch.getCheckMate()) {
			try {
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

				if (capturedPiece != null) {
					captured.add(capturedPiece);
				}
				if (chessMatch.getPromoted() != null) {
					System.out.print("Enter a piece for promotion (B/H/R/Q): ");
					String type = sc.nextLine().toUpperCase();
					while (type == null || !type.equals("B") && !type.equals("H") && !type.equals("R") && !type.equals("Q")) {
						System.out.print("Invalid value! Enter a piece for promotion (B/H/R/Q): ");
						type = sc.next().toUpperCase();
					}
						chessMatch.replacePromotedPiece(type);
				}

				UI.clearScreen();
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				UI.clearScreen();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				UI.clearScreen();
			}
		}
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
	}

}
