package org.example;

public class Board {
    private Square[] squares;

    public Board(String[] squareNames) {
        squares = new Square[squareNames.length];
        for (int i = 0; i < 40; i++) {
            squares[i] = new Square(squareNames[i]);
        }
    }

    public Square getSquare(Square oldLoc, int steps) {
        int currentIndex = -1;
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == oldLoc) {
                currentIndex = i;
            }
        }
        int newIndex = (currentIndex + steps) % squares.length;
        return squares[newIndex];
    }

    public Square getStartSquare() {
        return squares[0];
    }
}
