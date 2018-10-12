/**
 * Dice.java - Dice class
 */
public class Dice {

    private  int die1, die2, sum;
    private boolean pair, pairOne;

    /**
     * @author
     * @return the number of die 1
     */
    public int getDie1() {
        return die1;
    }

    /**
     * @author
     * @return the number of die 2
     */
    public int getDie2() {
        return die2;
    }

    /**
     * @author
     * @return the sum of die 1 and 2
     */
    public int getSum() {
        return sum;
    }

    /**
     * @author
     * @return true if dice has a pair, otherwise false
     */
    public boolean hasPair() {
        return pair;
    }

    /**
     * @author
     * @return true if dice has pair one, otherwise false
     */
    public boolean hasPairOne() {
        return pairOne;
    }

    /**
     * @author
     * @return roll dice and set die 1 and 2 + check for pair and pairOne
     */
    public void rollDice() {
        die1 = rollDie();
        die2 = rollDie();

        sum = (die1 + die2);

        if (die1 == die2) {
            pair = true;
            if (sum == 2)
                pairOne = true;
            else
                pairOne = false;
        } else {
            pair = false;
            pairOne = false;
        }
    }

    /**
     * Code from UseDice
     * @return number from 1-6
     */
    private int rollDie() {
        return (int) (Math.random() * 6) +1;
    }
}
