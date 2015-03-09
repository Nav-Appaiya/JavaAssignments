/**
 * Created by Nav on 7-3-2015.
 * Tetraeder (english name: tetrahedron) calculator:
 * http://onlinemschool.com/math/assistance/figures_volume/tetrahedron/
 *
 * By 10 cm riblength the volume
 * should be like           117.9
 * and the surface area     173.2
 */
public class Tetraeder extends Vorm {

    public Tetraeder(double riblengte) {
        /**
         * Super => references to Vorm() constructor
         * By passing the `riblengte` to the construct
         * of the extending class, we're passing the rib
         * lengte for the current Tetraeder to the Super Vorm class.
         */
        super(riblengte);
    }

    /**
     * @TODO: Write a new calculation to get the
     * right volume for this shape
     * @return
     */
    @Override
    public double inhoud() {
        return super.inhoud();
    }

    @Override
    public double oppervlakte() {
        //return super.oppervlakte();
        Double deel1 = Math.pow(this.getRiblengte(), 2); //riblength in kwadraat
        Double deel2 = Math.sqrt(3);
        return deel1 * deel2;
    }
}
