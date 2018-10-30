package domain;

import gui_main.GUI;
import java.util.ResourceBundle;

/**
 * The Game class handles game-logic and controls the flow between GUI and domain classes.
 */
public class Game {

    //Todo: fix - wait for issue #9
    //private Board board;
    private GUI gui;
    private Dice dice;
    //Todo: fix - wait for issue #6
    private Player[] players;
    private Player currentPlayer;
    private ResourceBundle boardLabels;
    private ResourceBundle fieldLabels;

    /**
     * This method initializes a new game.
     * It sets players and the language (i18n).
     */
    public void newGame() {

    }

    /**
     * This method starts a game when players has been added.
     * It loops until there is a winner.
     */
    private void playGame() {

    }

    /**
     * This method takes one turn for a particular player.
     * @param player Takes Player-object as an argument.
     */
    private void makeTurn() { //Todo: parameter - Player player, issue #6

    }

    /**
     * This method changes the currentPlayer to the next in the array.
     */
    private void setNextPlayer() {

    }
}
