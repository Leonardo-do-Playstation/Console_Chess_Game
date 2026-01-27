package application;

import boardgame.Board;
import boardgame.Position;

public class Aplic {

	public static void main(String[] args) {	
		Position pos = new Position(4,5);
		System.out.println(pos);
		
		Board board = new Board(8, 9);
		
		System.out.printf("%d,%d", board.getRows(), board.getColumns());
	}

}
