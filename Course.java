public class Course
{
    private String courseName;
    private int testMarks;
    public Course(String CourseName, int TestMarks)
    {
        courseName = CourseName;
        testMarks = TestMarks;
    }
    
    public String toString()
    {
        return courseName + ", " + testMarks;
    }
}
