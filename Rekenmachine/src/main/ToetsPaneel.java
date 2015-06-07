package main;

/**
 * Created by Nav Appaiya on 7-6-2015.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ToetsPaneel extends JPanel {
    private static String num1 = "";
    private static String num2 = "";
    private static String cmd = "";
    private static boolean decimal = false;
    protected static final HashMap <String, JButton> keys = new HashMap<>();

    private void _addButton(String label, ActionListener listener) {
        JButton btn = new JButton(label);
        btn.addActionListener(listener);
        keys.put(label, btn);
    }

    private void _render() {
        this.setLayout(new GridLayout(4,4));
        int key = 9;

        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                String num = new Integer(key).toString();

                if (keys.get(num) != null) {
                    this.add(keys.get(num));
                    key -= 1;
                } else {
                    this.add(keys.get("0"));
                    this.add(keys.get("."));
                    this.add(keys.get("="));
                }
            }

            switch (i) {
                case 0:
                    this.add(keys.get("+"));
                    break;

                case 1:
                    this.add(keys.get("-"));
                    break;

                case 2:
                    this.add(keys.get("*"));
                    break;

                case 3:
                    this.add(keys.get("/"));
                    break;
            }
        }
    }

    private double _calculate() {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double result = 0.0;

        switch (cmd) {
            case "+":
                result =  n1 + n2;
                break;

            case "-":
                result = n1 - n2;
                break;

            case "*":
                result = n1 * n2;
                break;

            case "/":
                result = n1 / n2;
                break;
        }

        return result;
    }

    public ToetsPaneel() {
        for (int i=0; i<10; i++) {
            _addButton(new Integer(i).toString(), new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String oldText = WeergavePaneel.display.getText();
                    String newText = event.getActionCommand();

                    if (oldText.equals("0.0")) {
                        WeergavePaneel.display.setText(newText);
                    } else {
                        WeergavePaneel.display.setText(oldText + newText)  ;
                    }
                }
            });
        }

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                num1 = WeergavePaneel.display.getText();
                cmd = event.getActionCommand();
                decimal = false;
                WeergavePaneel.display.setText("0.0");
            }
        };

        for (int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    _addButton("+", listener);
                    break;

                case 1:
                    _addButton("-", listener);
                    break;

                case 2:
                    _addButton("*", listener);
                    break;

                case 3:
                    _addButton("/", listener);
                    break;

                case 4:
                    _addButton(".", new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            String oldText = WeergavePaneel.display.getText();

                            if (!decimal) {
                                WeergavePaneel.display.setText(oldText + ".");
                                decimal = true;
                            }
                        }
                    });
                    break;

                case 5:
                    _addButton("=", new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            num2 = WeergavePaneel.display.getText();
                            WeergavePaneel.display.setText(new Double(_calculate()).toString());
                        }
                    });
            }
        }

        _render();
    }
}

