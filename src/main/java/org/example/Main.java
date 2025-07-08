package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MGame game = new MGame(2, new String[]{"Player 1", "Player 2"});
        game.playGame();
    }
}