/**
 * Created by Nav on 22-3-2015.
 */
public class App {


    /**
     *  In de main methode van de App klasse wordt een Recorder object aangemaakt.
        Deze Recorder dient als een gegevensverzamelaar en simuleert 1
        miljoen vluchten.
        Tijdens iedere vlucht wordt een nieuw Airplane object aangemaakt.

     * @param args
     */
    public static void main(String args[]) {
        Recorder rec = new Recorder();
        rec.simulate(1000000);
    }

}
