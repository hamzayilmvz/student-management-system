import java.util.HashSet;
import java.util.Set;

public class Student {

    private int id;
    private String name;
    private StudentStatus status;

    private Set<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = StudentStatus.ACTIVE;
        this.courses = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public boolean enrollCourse(Course course){
        if(status==StudentStatus.DROPPED || status==StudentStatus.GRADUATED){
            return false;
        }
        else if(this.courses.contains(course)){
            return false;
        }
        else{
            courses.add(course);
            return true;
        }
    }

    public boolean drop(){
        if(status==StudentStatus.DROPPED || status==StudentStatus.GRADUATED){
            return false;
        }
        status = StudentStatus.DROPPED;
        return true;
    }

    public boolean graduate(){
        if(status==StudentStatus.GRADUATED || status==StudentStatus.DROPPED){
            return false;
        }

        status = StudentStatus.GRADUATED;
        return true;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", courses=" + courses +
                '}';
    }
}
