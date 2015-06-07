import java.util.*;

/**
 * Created by Nav on 30-3-2015.
 */
public class School {

    private List<Student> studenten = new ArrayList<Student>();

    void add(Student student){
        studenten.add(student);
    }

    public void printStudenten(final StudentenVergelijker vergelijker) {
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return vergelijker.isGroter(o1, o2) ? -1 : 1;
            }
        };

        List<Student> copy = new ArrayList<Student>(studenten);
        Collections.sort(copy, comp);

        for (Student s : copy) {
            System.out.println(s);
        }

    }

}
