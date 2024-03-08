import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>(List.of(new Student("Aurora", 24),
                new Student("Marta", 21)));
        System.out.println(studentsList);

        studentsList.add(new Student("Andrea", 26));
        studentsList.add(new Student("Gabriele", 19));
        studentsList.add(new Student("Lara", 17));
        studentsList.add(new Student("Maria", 28));
        
        System.out.println(studentsList);

    }
}