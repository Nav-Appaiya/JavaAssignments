package main;

/**
 * Created by admin on 7-6-2015.
 */
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                HoofdScherm hoofdScherm = new HoofdScherm();
            }
        });
    }
}
