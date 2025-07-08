package org.example;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public void takeTurn(Die[] dice, Board board) {
        int totalSteps = 0;
        for (Die die : dice) {
            die.roll();
            totalSteps += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, totalSteps);
        piece.setLocation(newLoc);

        System.out.println(name + " moves " + totalSteps + " steps to " + newLoc.getName());
    }
}
