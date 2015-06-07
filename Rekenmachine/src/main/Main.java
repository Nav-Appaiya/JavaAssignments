package main;

/**
 * Created & Updated by Nav Appaiya on 7-6-2015.
 */
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {
        /**
         * Nav Appaiya updated June 8
         *
         * "Causes runnable to have its run method called in the
         * dispatch thread of the system EventQueue.
         * This will happen after all pending events are processed."
         *
         * Reference http://docs.oracle.com/javase/7/docs/api/java/awt/EventQueue.html
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                HoofdScherm hoofdScherm = new HoofdScherm();
            }
        });
    }
}
