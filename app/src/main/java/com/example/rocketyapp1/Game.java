package com.example.rocketyapp1;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private long start;
    private List<Player> players;
    private int rounds;

    public Game() {
        this.start = System.currentTimeMillis();
        this.players = new ArrayList<>();
        nextRound();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void nextRound() {
        // launch the first or next roundactivity
    }

    public void completeGame() {
        // start completedgameactivity showing the winner result?
    }
}
