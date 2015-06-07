package main;

/**
 * Created by Nav Appaiya on 7-6-2015.
 */
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class HoofdScherm extends JFrame {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;
    private static final String DEFAULT_TITLE = "Simpele Rekenmachine";

    public HoofdScherm() {
        super(HoofdScherm.DEFAULT_TITLE);
        this.add(new WeergavePaneel(), "North");
        this.add(new ToetsPaneel(), "Center");
        this.setSize(HoofdScherm.DEFAULT_WIDTH, HoofdScherm.DEFAULT_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
