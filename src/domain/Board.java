package domain;

        import gui_fields.GUI_Field;
        import gui_fields.GUI_Street;
        import gui_main.GUI;

        import java.awt.*;
        import java.util.ArrayList;

public class Board {
    int [] fields = new int[];

    public GUI createEmptyGUI() {
        GUI_Field[] gui_fields = new GUI_Field[fields.length];

        for (int i=0; i< fields.length; i++) {
            GUI_Street field = new GUI_Street();
            field.setForeGroundColor(Color.BLACK);
            field.setBackGroundColor(Color.WHITE);
            field.setSubText("");
            field.setTitle("");
            gui_fields[i]=field;
        }
        return new GUI(gui_fields);
    }

}
