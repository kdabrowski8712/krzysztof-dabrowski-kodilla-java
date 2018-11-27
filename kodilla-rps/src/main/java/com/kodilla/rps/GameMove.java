package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class GameMove {
    private String name;
    private List<Character> winningBeats;

    public GameMove(String name) {
        this.name = name;
        winningBeats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Character> getWinningBeats() {
        return winningBeats;
    }

    public void addWinningMove(Character move) {
        this.winningBeats.add(move);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameMove gameMove = (GameMove) o;

        if (!name.equals(gameMove.name)) return false;
        return winningBeats.equals(gameMove.winningBeats);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + winningBeats.hashCode();
        return result;
    }
}
