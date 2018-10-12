import gui_fields.GUI_Player;

/**
 * Player.java - class that represents a player
 * Extends GUI_Player and adds points-control
 */
public class Player extends GUI_Player {

    private int points = 0;
    Dice dice = new Dice();

    public Player(String name) {
        super(name);
        setBalance(0);
    }

    /**
     * @author
     * @return All points for player
     */
    public int getPoints() {
        return points;
    }

    /**
     * @author
     * @return Add points to the player
     */
    public void addPoints() {
        points = (points + dice.getSum());
        this.setBalance(points);
    }

    /**
     * @author
     * @return Resets points to zero
     */
    public void resetPoints() {
        points = 0;
    }
}
