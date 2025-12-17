import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> students;
    public StudentManager() {
        students = new HashMap<>();
    }
    public void addStudent(Student student) {
         if (students.containsKey(student.getId())) {
             System.out.println("Student already exists");
             return;
         }
        students.put(student.getId(), student);
        System.out.println("Student added");
    }
    public Student getStudent(int id) {
            return students.get(id);
        }


    public void listStudents() {
        for(Student s : students.values()) {
            System.out.println(s);
        }
    }
    public void enrollStudentToCourse(int studentId, Course course) {
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found");
            return;
        }
        boolean success = student.enrollCourse(course);
        if (!success) {
            System.out.println("Course could not be added ");
            return;
        }
        System.out.println("Course added successfully");

    }

    public void dropStudent(int studentId){
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        boolean success=student.drop();

        if(!success){
            System.out.println("Student cannot be dropped");
            return;
        }
        System.out.println("Student dropped successfully");

    }

    public void graduateStudent(int studentId){
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found");
            return;
        }
        boolean success=student.graduate();
        if(!success){
            System.out.println("Student cannot be graduated");
            return;
        }
        System.out.println("Student graduated successfully");

    }

}
