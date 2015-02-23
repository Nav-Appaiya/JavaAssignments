import java.util.Objects;

/**
 * Created by Nav on 23-2-2015.
 * Tirprog02/Infprg01 Practicumopdracht 1
 */
public class App {

    /**
     * The entry point of application.
     * Each assignment is in its own method.
     * Remove the slashes and run the method to
     * see resulting output in the console.
     *
     * @param args the input arguments
     */
    public static void main(String [ ] args) {
        App app = new App();
        app.opdracht1();
        //app.opdracht2();
        //app.opdracht3();
        //app.opdracht4(new Auto().autoArray());
    }

    /**
     * Opdracht 1.
     * Make a Autoclass with some properties
     * and add 2 custom properties for auto.
     * @see Auto class
     *
     * @return auto
     */
    public Auto opdracht1() {
        System.out.println("Made the Auto Class: ");
        System.out.println(new Auto().print());
        return new Auto();
    }

    /**
     * Opdracht 2.
     * Make some Auto objects and set/get some
     * of their values.
     */
    public void opdracht2() {
        Auto bmw = new Auto();
        Auto mercedes = new Auto();
        Auto fiat = new Auto();

        bmw.setDeuren(5);
        bmw.setGewicht(1000);
        bmw.setKenteken("52-23-BB");
        bmw.setKleur("Rood");
        bmw.setMerk("BMW");
        bmw.setPrijs(16000);
        bmw.setSnelheid(220);
        bmw.setType("Sport");

        mercedes.setDeuren(3);
        mercedes.setGewicht(800);
        mercedes.setKenteken("12-TT-GG");
        mercedes.setKleur("Geel");
        mercedes.setMerk("Mercedes");
        mercedes.setPrijs(22000);
        mercedes.setSnelheid(180);
        mercedes.setType("Bedrijfsauto");

        fiat.setDeuren(5);
        fiat.setGewicht(100);
        fiat.setKenteken("99-TZ-VV");
        fiat.setKleur("Blauw");
        fiat.setMerk("Fiat");
        fiat.setPrijs(9000);
        fiat.setSnelheid(200);
        fiat.setType("Personenauto");

        System.out.println("Kenteken van de Fiat = " + fiat.getKenteken());
        System.out.println("Kenteken van de BMW = " + bmw.getKenteken());
        System.out.println("Kenteken van de Mercedes = " + mercedes.getKenteken());
    }

    /**
     * Opdracht 3.
     * Create an array of Autos and set
     * their `snelheid` differently.
     * After that, print the objects.
     */
    public void opdracht3() {
        // New Auto Array with space for 5 Cars
        Auto[] autos = new Auto[5];
        // Creating 5 new Cars and put them in array
        autos[0] = new Auto();
        autos[1] = new Auto();
        autos[2] = new Auto();
        autos[3] = new Auto();
        autos[4] = new Auto();

        autos[0].setSnelheid(200);
        autos[1].setSnelheid(120);
        autos[2].setSnelheid(40);
        autos[3].setSnelheid(180);
        autos[4].setSnelheid(196);

        // Loop through and print it all
        for(int i=0; i< autos.length; i++){
            System.out.println(autos[i].print() + "\n");
        }
    }

    /**
     * Opdracht 4.
     * Write a method that takes an array
     * of Autos as argument and returns a
     * pointer to the Auto object with
     * the highest `snelheid`
     *
     * @return the string
     */
    public String opdracht4(Auto[] autos) {
        int i;
        int max = 0;
        Auto fastest = autos[0];
        for(i=0;i<autos.length;i++){
            if(autos[i].getSnelheid() > max){
                fastest = autos[i];
                max = autos[i].getSnelheid();
            }
        }
        System.out.println(fastest.print());
        return fastest.toString();
    }

}
