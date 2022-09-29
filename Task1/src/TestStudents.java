public class TestStudents {

    public static void main(String[] args) {

        //Student student1 = new Student("Lars");
        Course course1 = new Course ("Fransk");
        Student student1 = new Student ("Lars");
        student1.addCourse(course1);
        System.out.println(student1);
    }
}
