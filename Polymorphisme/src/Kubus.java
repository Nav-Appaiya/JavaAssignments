/**
 * Created by Nav on 7-3-2015.
 */
public class Kubus extends Vorm{

    public Kubus() {
        super();
    }

    public Kubus(double riblengte) {
        super(riblengte);
    }

    @Override
    public double getRiblengte() {
        return super.getRiblengte();
    }

    @Override
    public void setRiblengte(double riblengte) {
        super.setRiblengte(riblengte);
    }

    @Override
    public double inhoud() {
        // Inhoud van een kubus = zijde x zijde x zijde
        return this.getRiblengte() * this.getRiblengte() * this.getRiblengte();
    }

    @Override
    public double oppervlakte() {
        // Kubus heeft 6 vlakken = 6 x riblengte2
        return (this.getRiblengte() * this.getRiblengte()) * 6;
    }

    @Override
    public void print() {
        super.print();
    }
}
