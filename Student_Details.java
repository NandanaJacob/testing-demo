public class Student_Details extends Teaching_Staff {
    private String studentId;
    private String studentName;
    private String mobileNumber;
    private String emailId;
    private String[] teacherCodes;
    
    public Student_Details(String deptCode, String deptName, String building, int foundedYear,
                         String teacherId, String teacherName, String qualification, String dateOfJoining,
                         String studentId, String studentName, String mobileNumber, String emailId, String[] teacherCodes) {
        super(deptCode, deptName, building, foundedYear, teacherId, teacherName, qualification, dateOfJoining);
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.teacherCodes = teacherCodes;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("Department Code: " + deptCode);
        System.out.println("Teacher Codes:");
        for (int i = 0; i < teacherCodes.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + teacherCodes[i]);
        }
    }
}