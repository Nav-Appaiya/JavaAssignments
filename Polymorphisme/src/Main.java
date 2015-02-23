/**
 * Created by Nav on 21-2-2015.
 */
public class Main extends Vorm{

    public static void main(String [] args){
        Main main = new Main();
        main.run();
    }

    public void run() {
        this.setRiblengte(5);
        System.out.println("Name: "+this.toString());
        System.out.println("Riblengte: "+this.getRiblengte());
        System.out.println("Inhoud: "+this.inhoud());
        System.out.println("Oppervlakte: "+this.oppervlakte());
    }


}
