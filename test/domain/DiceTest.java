package domain;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    /**
     * Creates test
     */
    @org.junit.jupiter.api.Test
    public void rollDice() {
        /**
         * creates a dice that we can test, here 'mytestdice"
         */
    Dice mytestdice = new Dice();
    assertEquals(mytestdice.rollDice());


    }
}