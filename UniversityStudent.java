public class UniversityStudent
{
    private String studentName;
    private int courseNumber;
    private Course[] course;
    public UniversityStudent(String StudentName, int CourseNumber, Course[] Course)
    {
        studentName = StudentName;
        courseNumber = CourseNumber;
        course = Course;
    }
    
    public void print(){
        System.out.println("Student Name: " + studentName);
        for(int i = 0; i < courseNumber; i++){
            System.out.println(course[i].toString());
        }
    }
}
