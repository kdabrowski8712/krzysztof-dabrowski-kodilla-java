package com.kodilla.rps;

public class GenericPlayer {
    private String name;
    private int overallNumerOfWins;
    private int numberOfWinsInActualGame;
    private int numberOfDrawsInActualGame;

    public GenericPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOverallNumerOfWins() {
        return overallNumerOfWins;
    }

    public int getNumberOfWinsInActualGame() {
        return numberOfWinsInActualGame;
    }

    public void setOverallNumerOfWins(int overallNumerOfWins) {
        this.overallNumerOfWins = overallNumerOfWins;
    }

    public void setNumberOfWinsInActualGame(int numberOfWinsInActualGame) {
        this.numberOfWinsInActualGame = numberOfWinsInActualGame;
    }

    public int getNumberOfDrawsInActualGame() {
        return numberOfDrawsInActualGame;
    }

    public void setNumberOfDrawsInActualGame(int numberOfDrawsInActualGame) {
        this.numberOfDrawsInActualGame = numberOfDrawsInActualGame;
    }

    public void addDraw() {
        numberOfDrawsInActualGame+=1;
    }

    public void addWinInActualGame() {
        numberOfWinsInActualGame+=1;
    }

    public void addWin() {
        overallNumerOfWins+=1;
    }

    @Override
    public String toString() {
        return "Player: " + name + "\n"
                + "Overall wins ( in all games ): " + overallNumerOfWins + "\n"
                + "Wins in actual game: " + numberOfWinsInActualGame + "\n"
                + "Draws in actual game: " + numberOfDrawsInActualGame + "\n";

    }
}
