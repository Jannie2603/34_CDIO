import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import java.awt.*;

/**
 * Game.java - main program
 * @version 0.1
 */
public class Game {

    // Instantiates GUI and BoardController objects
    private GUI gui;

    // Instantiates player 1 and 2
    private Player player1;
    private Player player2;
    private Player activePlayer;

    public Game() {

        gui = boardSetup(gui);

        // Assign player names to players and add to board
        player1 = new Player(
                gui.getUserString("Indtast spiller 1's navn")
        );
        gui.addPlayer(player1);

        player2 = new Player(
                gui.getUserString("Indtast spiller 2's navn")
        );
        gui.addPlayer(player2);

        // First round defaults to player 1
        activePlayer = player1;
    }

    public void play() {

        while (player1.getPoints() < 40 && player2.getPoints() < 40) {

            // Show active user and registers button-click
            String b = gui.getUserButtonPressed(activePlayer.getName() + "' tur", "Slå terninger");

            // Roll dice and shows them on the board
            activePlayer.dice.rollDice();
            gui.setDice(activePlayer.dice.getDie1(), activePlayer.dice.getDie2());

            // Reset car if player has any points
            if (activePlayer.getPoints() != 0)
                gui.getFields()[activePlayer.getPoints()-1].setCar(activePlayer, false);

            if (activePlayer.dice.hasPair()) {
                if (activePlayer.dice.hasPairOne()) {
                    activePlayer.resetPoints();
                }
                else {
                    activePlayer.addPoints();
                    if (activePlayer.getPoints() < 40)
                        gui.getFields()[activePlayer.getPoints()-1].setCar(activePlayer, true);
                }
            }
            else {
                activePlayer.addPoints();
                if (activePlayer.getPoints() < 40)
                    gui.getFields()[activePlayer.getPoints()-1].setCar(activePlayer, true);
                setNextPlayer();
            }
        }

        // Game finished
        if (player1.getPoints() > player2.getPoints()) {
            gui.showMessage(player1.getName() + " har vundet. Congrats!");
        }
        else {
            gui.showMessage(player2.getName() + " har vundet. Congrats!");
        }
    }

    /**
     * @author
     * Method that changes activePlayer
     */
    private void setNextPlayer() {
        if (activePlayer == player1)
            activePlayer = player2;
        else
            activePlayer = player1;
    }
    
    /**
     * @author
     * Set color and titles for all fields on board
     * @param gui An instance of GUI
     */
    private GUI boardSetup(GUI gui) {
        final int noFields = 40;
        GUI_Field[] gui_fields = new GUI_Field[noFields];
        for (int i = 0; i < noFields;i++) {
            GUI_Street field = new GUI_Street();
            field.setForeGroundColor(Color.BLACK);
            field.setBackGroundColor(Color.WHITE);
            field.setSubText(Integer.toString(i + 1));
            field.setTitle("");
            gui_fields[i]= field;
        }

        gui = new GUI(gui_fields);
        return gui;
    }
}

