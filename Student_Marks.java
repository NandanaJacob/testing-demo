public class Student_Marks extends Student_Details {
    private int semesterNumber;
    private int[] marks;
    private double total;
    private double average;
    
    public Student_Marks(String deptCode, String deptName, String building, int foundedYear,
                        String teacherId, String teacherName, String qualification, String dateOfJoining,
                        String studentId, String studentName, String mobileNumber, String emailId, String[] teacherCodes,
                        int semesterNumber, int[] marks) {
        super(deptCode, deptName, building, foundedYear, teacherId, teacherName, qualification, dateOfJoining,
              studentId, studentName, mobileNumber, emailId, teacherCodes);
        this.semesterNumber = semesterNumber;
        this.marks = marks;
        calculateTotalAndAverage();
    }
    
    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / marks.length;
    }
    
    public void displayMarksDetails() {
        System.out.println("\nMarks Details for " + getStudentName() + " (ID: " + getStudentId() + ")");
        System.out.println("Semester: " + semesterNumber);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + String.format("%.2f", average));
    }
}