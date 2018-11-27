package com.kodilla.rps;

import java.util.*;

public class RpsGame {
    private int numberOfGames;
    private int maxNumberOfWinningRoundsInActualGame;
    private Human humanPlayer;
    private Computer computerPlayer;
    private boolean finish;
    private String possibleMovesMessage;
    private Map<Character, GameMove> gamePossibleMoves;
    private boolean gameInProgress;

    public RpsGame() {
        gamePossibleMoves = new HashMap<>();
    }

    public void start() {
            initializeAllGames();
            initializeNewGame();
            gameInProgress = true;
            numberOfGames +=1;
            Character choice;
            boolean gameInProgress = true;

            while(!finish) {
                System.out.println();
                choice = returnCharacterFromKeyboard(possibleMovesMessage);
                switch(choice) {
                    case 'x' : {
                        finish = true;
                        System.out.println("Thanks for playing");
                        break;
                    }
                    case 'n' : {
                        numberOfGames+=1;
                        System.out.println("New game started");
                        initializeNewGame();
                        gameInProgress = true;
                        break;
                    }
                    case '1' :
                    case '2' :
                    case '3' :{
                           Random r = new Random();
                           if(gameInProgress) {
                               Integer computerMove = r.nextInt(3) + 1;
                               Character parsedComputerMove = computerMove.toString().charAt(0);
                               boolean winCheck = false;
                               checkMove(parsedComputerMove, choice);

                               winCheck = checkWinCondition();

                               if (winCheck) {
                                   gameInProgress = false;
                               }
                           }
                           else {
                               System.out.println("Not possible to make moves when game is not started ");
                           }
                           break;
                    }
                    case 's' : {
                        showStatistics();
                        break;
                    }
                    default : {
                        System.out.println("Wrong value selected !!");
                        break;
                    }
                }
            }

    }

    public void showStatistics() {

        System.out.println("Number of games: " + numberOfGames);
        System.out.println("Number of wins to end current game: " + maxNumberOfWinningRoundsInActualGame);
        System.out.println("PLAYER STATISTICS");
        System.out.println(humanPlayer);
        System.out.println(computerPlayer);

    }

    private void initializeAllGames() {
        Scanner s = new Scanner(System.in);

        numberOfGames =0;
        gameLogicPreparation();
        maxNumberOfWinningRoundsInActualGame =0;

        System.out.println("Choose your name");
        humanPlayer = new Human(s.next());
        computerPlayer = new Computer();

        possibleMovesMessage = "Possible moves: \n" +
                               "x - exit \n" +
                               "n - new game \n" +
                               "s - statistics \n" +
                               "1 - Stone \n" +
                               "2 - Paper \n" +
                               "3 - Scissors \n" +
                               "Please choose one option" ;

    }

    private void gameLogicPreparation() {

        GameMove stone = new GameMove("Stone");
        GameMove paper = new GameMove("Paper");
        GameMove scissors = new GameMove("Scissors");

        stone.addWinningMove('3');
        scissors.addWinningMove('2');
        paper.addWinningMove('1');

        gamePossibleMoves.put('1',stone);
        gamePossibleMoves.put('2',paper);
        gamePossibleMoves.put('3',scissors);

    }

    private void checkMove(Character computerMove, Character playerMove) {

        System.out.println("Computer move: " + gamePossibleMoves.get(computerMove).getName());
        System.out.println("Player "  + humanPlayer.getName() + " move: " + gamePossibleMoves.get(playerMove).getName());

        if(computerMove==playerMove) {
            humanPlayer.addDraw();
            computerPlayer.addDraw();
            System.out.println("Draw - no one have winning move");
        }
        else {
            List<Character> playerWinningMoves =   gamePossibleMoves.get(playerMove).getWinningBeats();
            List<Character> computerWinnigMoves = gamePossibleMoves.get(computerMove).getWinningBeats();

            if(playerWinningMoves.contains(computerMove)) {
                System.out.println("Player " + humanPlayer.getName() + " won this round");
                System.out.println(gamePossibleMoves.get(playerMove).getName() + " beat " + gamePossibleMoves.get(computerMove).getName());
                humanPlayer.addWinInActualGame();
            } else {
                if(computerWinnigMoves.contains(playerMove)) {
                    System.out.println("Computer won this round");
                    System.out.println(gamePossibleMoves.get(computerMove).getName() + " beat " + gamePossibleMoves.get(playerMove).getName());
                    computerPlayer.addWinInActualGame();
                } else {
                    System.out.println("No one win in this round !! . Keep on going");

                }
            }
        }
    }

    private boolean checkWinCondition() {
        boolean winExist = false;
        if(humanPlayer.getNumberOfWinsInActualGame() == maxNumberOfWinningRoundsInActualGame) {
            winExist = true;
            System.out.println("Player " + humanPlayer.getName() + " wins this game");
            humanPlayer.addWin();
        } else if(computerPlayer.getNumberOfWinsInActualGame() ==maxNumberOfWinningRoundsInActualGame) {
            winExist = true;
            System.out.println("Computer win this game");
            computerPlayer.addWin();
        }

        return winExist;
    }

    private void initializeNewGame() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose how many wins end current game:");
        maxNumberOfWinningRoundsInActualGame = s.nextInt();
        humanPlayer.setNumberOfDrawsInActualGame(0);
        humanPlayer.setNumberOfWinsInActualGame(0);
        computerPlayer.setNumberOfDrawsInActualGame(0);
        computerPlayer.setNumberOfWinsInActualGame(0);

    }

    private Character returnCharacterFromKeyboard(String promptMessage) {
        Scanner s = new Scanner(System.in);
        System.out.println(promptMessage);
        String result = s.next();

        return result.charAt(0);
    }

}
