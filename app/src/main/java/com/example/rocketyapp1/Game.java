package com.example.rocketyapp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    private long start;
    private List<Player> players;
    private int rounds; // we can add an option for this later
    private Map<Long, Integer> wins;

    public Game() {
        this.start = System.currentTimeMillis();
        this.players = new ArrayList<>();
        this.wins = new HashMap<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addWin(Player player) {
        // add a win to the map, if player has enough wins/rounds, complete the game
        // and announce the winner?
    }

    public void completeGame() {

    }
}
