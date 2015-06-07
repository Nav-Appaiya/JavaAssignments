import Exceptions.CrashException;

/**
 * Created by Nav on 22-3-2015.
 */
public class Recorder {

    // Keeps count of engine failures
    static int engineFailure = 0;

    // Keeps count of the flap failures
    static int flapFailure = 0;

    // Keeps count of the pilot failures
    static int pilotFailure = 0;

    // Keeps count of the crashes
    static int crashes = 0;

    void simulate(int flights) {
        for (int i=1; i<=flights; i++) {
            Airplane a = new Airplane();
            try {
                a.flight(i);
            } catch (CrashException e) {
                crashes++;
                System.out.println(e);
            }
        }

        System.out.println("--------- Results for " + flights + " Flights");
        System.out.println("Crashed: " + crashes);
        System.out.println("Fails:");
        System.out.println("Engine failure: " + (double) engineFailure/(flights*4)*100);
        System.out.println("Flap failure: " + (double) flapFailure/(flights*4)*100);
        System.out.println("Pilot failure: " + (double) pilotFailure/(flights*4)*100);
    }

}
