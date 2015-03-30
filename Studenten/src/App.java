/**
 * Created by Nav on 30-3-2015.
 */
public class App {

    public static void main(String [ ] args)
    {
        School school = new School();

        // één implementatie die sorteert op basis van leeftijd
        StudentenVergelijker leeftijd = new StudentenVergelijker() {
            @Override
            public boolean isGroter(Student s1, Student s2) {
                if(s1.getLeeftijd() > s2.getLeeftijd()){
                    return false;
                }
                return true;
            }
        };

        // een ander die sorteert op basis van naam
        StudentenVergelijker naam = new StudentenVergelijker() {
            @Override
            public boolean isGroter(Student s1, Student s2) {
                return false;
            }
        };
        school.add(new Student("5224", "Albert", 23));
        school.add(new Student("5234", "Bas", 22));
        school.add(new Student("5254", "Cedric", 25));

        // school.printStudenten(leeftijd); // Sorteerd op leeftijd
        school.printStudenten(naam);        // Sorteerd op naam

    }

}
