package domain;

import gui_main.GUI;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        
    }

    @org.junit.jupiter.api.Test
    void createEmptyGUI() {

        Board boardtest = new Board();

       gui: = boardtest.createEmptyGUI()

    }
}