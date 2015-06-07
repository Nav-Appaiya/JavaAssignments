package main;

/**
 * Created by Nav Appaiya on 7-6-2015.
 */
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WeergavePaneel extends JPanel {
    protected static final JTextField display = new JTextField("0.0", 20);

    public WeergavePaneel() {
        this.display.setEditable(false);
        this.add(this.display);
    }
}

