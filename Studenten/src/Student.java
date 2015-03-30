/**
 * Created by Nav on 30-3-2015.
 */
public class Student {

    private String studentNummer;
    private String naam;
    private int leeftijd;

    public Student(String studentNummer, String naam, int leeftijd){
        this.studentNummer = studentNummer;
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(String studentNummer) {
        this.studentNummer = studentNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNummer='" + studentNummer + '\'' +
                ", naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
