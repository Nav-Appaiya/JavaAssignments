/**
 * Created by Nav on 21-2-2015.
 */


abstract class Vorm {

    private double riblengte;

    /** Constructs a new Vorm. */
    public Vorm() {
        this.riblengte = 1;
    }

    public Vorm(double riblengte) {
        this.riblengte = riblengte;
    }

    /**
     * Getter for property 'riblengte'.
     *
     * @return Value for property 'riblengte'.
     */
    public double getRiblengte() {
        return riblengte;
    }

    /**
     * Setter for property 'riblengte'.
     *
     * @param riblengte Value to set for property 'riblengte'.
     */
    public void setRiblengte(double riblengte) {
        this.riblengte = riblengte;
    }

    public double inhoud() {
        return this.getRiblengte() * this.getRiblengte() * this.getRiblengte();
    }

    public double oppervlakte() {
        return this.getRiblengte() * this.getRiblengte();
    }

    public void print() {
        System.out.println("Riblengte: "+this.riblengte);
        System.out.println("Oppervlakte: "+this.oppervlakte());
        System.out.println("Inhoud: "+this.inhoud());
    }
}
