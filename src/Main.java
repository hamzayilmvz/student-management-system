//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* //FIRST TRY
       StudentManager manager = new StudentManager();

        Course math=new Course(1,"Math");
        Course physics=new Course(2,"Physics");
        Course java=new Course(3,"Java");

        Student s1=new Student(100,"S1");
        Student s2=new Student(101,"S2");
        Student s3=new Student(103,"S3");

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        manager.addStudent(new Student(100, "Duplicate"));

        manager.enrollStudentToCourse(100, math);
        manager.enrollStudentToCourse(100, physics);
        manager.enrollStudentToCourse(100, math); // tekrar

        manager.enrollStudentToCourse(999, java); // olmayan öğrenci

        manager.listStudents();*/

        //SECOND

        StudentManager manager = new StudentManager();

        Course math=new Course(1,"Math");
        Course physics=new Course(2,"Physics");

        Student s1=new Student(100,"S1");
        Student s2=new Student(101,"S2");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.enrollStudentToCourse(100,math);

        manager.dropStudent(100);
        manager.enrollStudentToCourse(100,physics);

        manager.graduateStudent(101);
        manager.enrollStudentToCourse(101,physics);

        manager.dropStudent(101);
        manager.graduateStudent(100);

        manager.listStudents();








    }
}