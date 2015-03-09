/**
 * Created by Nav on 7-3-2015.
 * Tetraeder (english name: tetrahedron) calculator:
 * http://onlinemschool.com/math/assistance/figures_volume/tetrahedron/
 * http://rechneronline.de/pi/tetrahedron.php
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
     * @TODO: Write a new calculation to get the right volume for this shape
     * @return
     */
    @Override
    public double inhoud() {
        //return super.inhoud(); // We override this for a Tetraeder
        Double SquareRootOfTwo  = Math.sqrt(2);
        Double theSide          = Math.pow(this.getRiblengte(), 3);

        SquareRootOfTwo = (SquareRootOfTwo/12);

        return SquareRootOfTwo * theSide;
    }

    /**
     * 2 new math functions used:
     * Math.pow => The method returns the value of the first argument
     * raised to the power of the second argument.
     * Mat.sqrt => The method returns the square root of the argument
     * Formule: r2√3
     * @return
     */
    @Override
    public double oppervlakte() {
        //return super.oppervlakte();
        Double theRoot  = Math.sqrt(3);
        Double theSide  = Math.pow(this.getRiblengte(), 2);

        return theRoot * theSide;
    }
}
