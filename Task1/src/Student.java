import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> courses = new ArrayList();

    public Student(String name)
    {
        this.name=name;
    }

    public void addCourse(Course course)
    {
        courses.add(course.toString());
    }

    @Override
    public String toString()
    {
        return String.format("Student: %s",name);
    }
}