package mod8;

import java.util.ArrayList;
import java.util.List;
class Course {
    private Integer courseId;
    private String courseName;
    private Double courseFee;
    private Integer duration;
 
    public Course(Integer var1, String var2, Double var3, Integer var4) {
       this.courseId = var1;
       this.courseName = var2;
       this.courseFee = var3;
       this.duration = var4;
    }
 
    public Integer getCourseId() {
       return this.courseId;
    }
 
    public void setCourseId(Integer var1) {
       this.courseId = var1;
    }
 
    public String getCourseName() {
       return this.courseName;
    }
 
    public void setCourseName(String var1) {
       this.courseName = var1;
    }
 
    public Double getCourseFee() {
       return this.courseFee;
    }
 
    public void setCourseFee(Double var1) {
       this.courseFee = var1;
    }
 
    public Integer getDuration() {
       return this.duration;
    }
 
    public void setDuration(Integer var1) {
       this.duration = var1;
    }
 }
 
public class CourseData {

    // Static list to hold the courses
    private static List<Course> courseList = new ArrayList<>();

    //Private static instance of the singleton class
    private static CourseData instance;

    // Static block to initialize courseList
    static {
        courseList.add(new Course(101, "BTech", 450000.00, 48));
        courseList.add(new Course(202, "MTech", 405000.00, 24));
        courseList.add(new Course(303, "BCA", 425000.00, 48));
        courseList.add(new Course(404, "MCA", 450000.00, 24));
    }

    //Private constructor to prevent instantiation from outside
    private CourseData() {
        // Private constructor ensures no external instantiation
    }

    //Public static method to access the instance
    public static CourseData getInstance() {
        if (instance == null) {
            synchronized (CourseData.class) {
                if (instance == null) {
                    instance = new CourseData();
                }
            }
        }
        return instance;
    }

    // Getter for the course list
    public List<Course> getCourseList() {
        return courseList;
    }

    //Override clone to prevent cloning of the singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not supported for Singleton class");
    }

    //Prevent the singleton instance from being created during deserialization
    private Object readResolve() {
        return getInstance();
    }


    public static void main(String[] args) {
        
        CourseData courseData = CourseData.getInstance();

        
        List<Course> courses = courseData.getCourseList();

        // Display the courses
        for (Course course : courses) {
            System.out.println(course.getCourseName() + " - " + course.getCourseFee());
        }

        // Trying to create another instance will return the same instance
        CourseData anotherCourseData = CourseData.getInstance();
        System.out.println(courseData == anotherCourseData);  // Will print true, both are same instance
    }


}

