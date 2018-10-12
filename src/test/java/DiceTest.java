import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void getDie1and2() {
        // Arrange
        Dice cup = new Dice();

        // Act
        cup.rollDice();

        // Assert
        assertTrue((cup.getDie1() < 7) && (cup.getDie1() > 0));
        assertTrue((cup.getDie2() < 7) && (cup.getDie2() > 0));
    }

    @Test
    /**
     * Test case ID 01
     */
    void rollDiceAndCheckDie() {

        // Arrange
        Dice cup = new Dice();
        int die, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        // Act
        for (int i = 0; i < 60000; i++) {
            cup.rollDice();
            die = cup.getDie1();

            switch (die) {
                case 1:
                    count1 = count1 + 1;
                    break;
                case 2:
                    count2 = count2 + 1;
                    break;
                case 3:
                    count3 = count3 + 1;
                    break;
                case 4:
                    count4 = count4 + 1;
                    break;
                case 5:
                    count5 = count5 + 1;
                    break;
                case 6:
                    count6 = count6 + 1;
                    break;
            }
        }

        // Assert
        assertTrue(count1 > 9600 && count1 < 10400);
        assertTrue(count2 > 9600 && count2 < 10400);
        assertTrue(count3 > 9600 && count3 < 10400);
        assertTrue(count4 > 9600 && count4 < 10400);
        assertTrue(count5 > 9600 && count5 < 10400);
        assertTrue(count6 > 9600 && count6 < 10400);
        assertTrue((count1 + count2 + count3 + count4 + count5 + count6) == 60000);
    }

    @Test
    /**
     * Test case ID 02
     */
    void rollDiceAndCheckPairs() {

        // Arrange
        Dice cup = new Dice();
        int die1, die2, sum, total = 0, pair1 = 0, pair2 = 0, pair3 = 0, pair4 = 0, pair5 = 0, pair6 = 0;

        // Act
        for (int i = 0; i < 60000; i++) {
            cup.rollDice();
            die1 = cup.getDie1();
            die2 = cup.getDie2();
            sum = cup.getSum();

            if (die1 == die2) {
                total = total + 1;
                switch (sum) {
                    case 2:
                        pair1 = pair1 + 1;
                        break;
                    case 4:
                        pair2 = pair2 + 1;
                        break;
                    case 6:
                        pair3 = pair3 + 1;
                        break;
                    case 8:
                        pair4 = pair4 + 1;
                        break;
                    case 10:
                        pair5 = pair5 + 1;
                        break;
                    case 12:
                        pair6 = pair6 + 1;
                        break;
                }
            }
        }

        // Assert
        assertTrue(pair1 > 1500 && pair1 < 1800);
        assertTrue(pair2 > 1500 && pair2 < 1800);
        assertTrue(pair3 > 1500 && pair3 < 1800);
        assertTrue(pair4 > 1500 && pair4 < 1800);
        assertTrue(pair5 > 1500 && pair5 < 1800);
        assertTrue(pair6 > 1500 && pair6 < 1800);
    }
}