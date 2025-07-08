package org.example;

public class MGame {
    private int roundCnt;
    private Board board;
    private Die[] dice;
    private Player[] players;

    public MGame(int roundCnt, String[] playerNames) {
        this.roundCnt = roundCnt;
//        String[] b = new String[]{};
//        for (int i = 0; i < 40; i++) {
//            b[i] = String.valueOf(i);
//        }
        this.board = new Board(new String[]
                {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                        "31", "32", "33", "34", "35", "36", "37", "38", "39"
                });
        this.dice = new Die[]{ new Die(), new Die() };

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            Piece p = new Piece(board.getStartSquare());
            players[i] = new Player(playerNames[i], p);
        }
    }

    public void playGame() {
        for (int i = 0; i < roundCnt; i++) {
            playRound();
        }
    }

    private void playRound() {
        for (Player p : players) {
            p.takeTurn(dice, board);
        }
    }
}
