import Exceptions.CrashException;

/**
 * Created by Nav on 22-3-2015.
 */
public class Recorder {

    static int tEngine = 0;
    static int tFlap = 0;
    static int tPilot = 0;
    int tCrash = 0;

    void simulate(int numFlights)
    {
        for (int i=1; i<=numFlights; i++)
        {
            Airplane a = new Airplane();

            try
            {
                a.flight(i);
            }
            catch (CrashException e)
            {
                tCrash++;
                System.out.println(e);
                //e.printStackTrace();
            }
        }

        System.out.println("Gegevens voor " + numFlights + " Vluchten: ");
        System.out.println("Gecrashte vluchten: " + tCrash);
        System.out.println(String.format("\t%s (%.2f%%) engines malfunctioned", tEngine, (double) tEngine/(numFlights*4)*100));
        System.out.println(String.format("\t%s (%.2f%%) flaps broke off", tFlap, (double) tFlap/(numFlights*2)*100));
        System.out.println(String.format("\t%s (%.2f%%) pilots dozed off", tPilot, (double) tPilot/(numFlights*3)*100));
    }

}
