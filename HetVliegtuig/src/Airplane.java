/**
 * Created by Nav on 22-3-2015.
 */
// The Exceptions from Exceptions Package
import Exceptions.CrashException;
import Exceptions.EngineException;
import Exceptions.FlapException;
import Exceptions.PilotException;

public class Airplane {

    // Create a Parts Array
    static Part[] parts = new Part[9];

    // Boolean to define failed or not
    static boolean[] fails = new boolean[parts.length];

    Airplane(){
        // Een Boeing 747 heeft 4 motoren, genummerd van 1 t/m 4.
        // Motor 1 en 4 zijn de buitenste motoren; Motor 2 en 3 de binnenste.

        parts[0] = new Engine(); // Buitenste
        parts[1] = new Engine(); // Buitenste
        parts[2] = new Engine(); // Binnenste
        parts[3] = new Engine(); // Binnenste

        // Alleen als beide flaps uitvallen, zal het vliegtuig neerstorten.
        parts[4] = new Flap();
        parts[5] = new Flap();

        // Alleen als alle piloten uitvallen, zal het vliegtuig neerstorten.

        parts[6] = new Pilot();
        parts[7] = new Pilot();
        parts[8] = new Pilot();
    }

    static void flight(int n) throws CrashException
    {
        int engineNummer = 0;
        int flapNummer = 0;
        int pilotNummer = 0;

        for (int i=0; i<parts.length; i++)
        {
            try
            {
                parts[i].calculate();
            }
            catch (EngineException e)
            {
                engineNummer++;
                fails[i] = true;
            }
            catch (FlapException e)
            {
                flapNummer++;
                fails[i] = true;
            }
            catch (PilotException e)
            {
                pilotNummer++;
                fails[i] = true;
            }
            catch (Exception e){} // dummy
        }

        Recorder.engineFailure += engineNummer;
        Recorder.flapFailure += flapNummer;
        Recorder.pilotFailure += pilotNummer;

        // chance for fEngine is really small (0.001^3)
        // check if both inner engines failed
        boolean fEngine = (engineNummer >= 3 && fails[1] && fails[2]);

        if (fEngine || flapNummer == 2 || pilotNummer == 3)
        {
            String s = "\n\tFlight: "+n
                    +(engineNummer>0 ? "\n\tEngines: "+engineNummer : "")
                    +(flapNummer>0 ? "\n\tFlaps: "+flapNummer : "")
                    +(pilotNummer>0 ? "\n\tPilots: "+pilotNummer : "");

            throw new CrashException(s);
        }
    }

}
