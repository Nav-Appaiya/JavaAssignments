/**
 * Created by Nav on 23-2-2015.
 */
public class Auto {

    private String kenteken;

    private int deuren;

    private String kleur;

    private String merk;

    private String type;

    private int snelheid;

    private int gewicht;

    private int prijs;

    /**
     * Print string.
     *
     * @return the string
     */
    public String print(){
        System.out.println("Kenteken: "+this.kenteken);
        System.out.println("Deuren: "+this.deuren);
        System.out.println("Kleur: "+this.kleur);
        System.out.println("Merk: "+this.merk);
        System.out.println("Type: "+this.type);
        System.out.println("Snelheid: "+this.snelheid);
        System.out.println("Gewicht: "+this.gewicht);
        System.out.println("Prijs: "+this.prijs);
        return this.toString();
    }


    /**
     * Auto array.
     * Gives back an Array of Auto's (5x)
     * To be used as argument in Opdracht4 method
     *
     * @return the auto [ ]
     */
    public Auto[] autoArray() {
        Auto[] autos = new Auto[5];
        autos[0] = new Auto();
        autos[1] = new Auto();
        autos[2] = new Auto();
        autos[3] = new Auto();
        autos[4] = new Auto();

        // Set some snelheid
        autos[0].setSnelheid(100);
        autos[1].setSnelheid(870);
        autos[2].setSnelheid(150);
        autos[3].setSnelheid(250);
        autos[4].setSnelheid(330);
        return autos;
    }

    /**
     * Sets new kenteken.
     *
     * @param kenteken New value of kenteken.
     */
    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    /**
     * Sets new merk.
     *
     * @param merk New value of merk.
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets new snelheid.
     *
     * @param snelheid New value of snelheid.
     */
    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    /**
     * Gets kenteken.
     *
     * @return Value of kenteken.
     */
    public String getKenteken() {
        return kenteken;
    }

    /**
     * Gets gewicht.
     *
     * @return Value of gewicht.
     */
    public int getGewicht() {
        return gewicht;
    }

    /**
     * Sets new gewicht.
     *
     * @param gewicht New value of gewicht.
     */
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * Gets snelheid.
     *
     * @return Value of snelheid.
     */
    public int getSnelheid() {
        return snelheid;
    }

    /**
     * Gets deuren.
     *
     * @return Value of deuren.
     */
    public int getDeuren() {
        return deuren;
    }

    /**
     * Sets new prijs.
     *
     * @param prijs New value of prijs.
     */
    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    /**
     * Gets kleur.
     *
     * @return Value of kleur.
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * Gets merk.
     *
     * @return Value of merk.
     */
    public String getMerk() {
        return merk;
    }

    /**
     * Sets new deuren.
     *
     * @param deuren New value of deuren.
     */
    public void setDeuren(int deuren) {
        this.deuren = deuren;
    }

    /**
     * Sets new kleur.
     *
     * @param kleur New value of kleur.
     */
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    /**
     * Gets prijs.
     *
     * @return Value of prijs.
     */
    public int getPrijs() {
        return prijs;
    }
}
