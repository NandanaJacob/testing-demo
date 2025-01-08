public class Teaching_Staff extends Department {
    private String teacherId;
    private String teacherName;
    private String qualification;
    private String dateOfJoining;
    
    public Teaching_Staff(String deptCode, String deptName, String building, int foundedYear,
                        String teacherId, String teacherName, String qualification, String dateOfJoining) {
        super(deptCode, deptName, building, foundedYear);
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
    }
    
    public void displayTeacherDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Department Code: " + deptCode);
    }
}