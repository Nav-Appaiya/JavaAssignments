/**
 * Created by Nav on 21-2-2015.
 */
public class Main extends Vorm{

    public static void main(String [] args){
        Main main = new Main();
        //main.opd1();
        //main.opd2();
        main.opd3();
    }

    public void opd1() {
        this.setRiblengte(15);
        System.out.println("Name: "+this.toString());
        System.out.println("Riblengte: "+this.getRiblengte());
        System.out.println("Inhoud: "+this.inhoud());
        System.out.println("Oppervlakte: "+this.oppervlakte());
    }

    public void opd2() {
        Kubus kubus = new Kubus(3);
        kubus.print();
    }

    public void opd3() {
        Tetraeder tetraeder = new Tetraeder(5);
        tetraeder.print();
    }


}
