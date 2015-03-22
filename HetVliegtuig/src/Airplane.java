/**
 * Created by Nav on 22-3-2015.
 */

import Exceptions.CrashException;
import Exceptions.EngineException;
import Exceptions.FlapException;
import Exceptions.PilotException;

public class Airplane {

    static Part[] parts = new Part[9];
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
        int numEngine = 0;
        int numFlap = 0;
        int numPilot = 0;

        for (int i=0; i<parts.length; i++)
        {
            try
            {
                parts[i].calculate();
            }
            catch (EngineException e)
            {
                numEngine++;
                fails[i] = true;
            }
            catch (FlapException e)
            {
                numFlap++;
                fails[i] = true;
            }
            catch (PilotException e)
            {
                numPilot++;
                fails[i] = true;
            }
            catch (Exception e){} // dummy
        }

        Recorder.tEngine += numEngine;
        Recorder.tFlap += numFlap;
        Recorder.tPilot += numPilot;

        // chance for fEngine is really small (0.001^3)
        // check if both inner engines failed
        boolean fEngine = (numEngine >= 3 && fails[1] && fails[2]);

        if (fEngine || numFlap == 2 || numPilot == 3)
        {
            String s = "\n\tFlight: "+n
                    +(numEngine>0 ? "\n\tEngines: "+numEngine : "")
                    +(numFlap>0 ? "\n\tFlaps: "+numFlap : "")
                    +(numPilot>0 ? "\n\tPilots: "+numPilot : "");

            throw new CrashException(s);
        }
    }

}
