package domain;

public class Dice {
    /**
     * creating integers for 2 dice and sum of these
     */
    private int dice1, dice2, sum;

    /**
     * Gets the number of die1
     */
    public int getDie1() {
        return dice1;
    }

    /**
     * Gets number of die2
     */
    public int getDie2() {
        return dice2;
    }

    /**
     * Gets the sum of both dice
     */
    public int getSum() {
        return sum;
    }

    /**
     * Rolls the dice and gets sum for both dice
     */
    public void rollDice() {
        dice1 = rollDie();
        dice2 = rollDie();

        sum = (dice1 + dice2);
    }

    /**
     *
     * @return
     * Makes the dice roll randomly from 1-6
     */
    private int rollDie() {return (int) ((Math.random()*6));}

}
