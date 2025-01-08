public class Department {
    protected String deptCode;
    protected String deptName;
    protected String building;
    protected int foundedYear;
    
    public Department(String deptCode, String deptName, String building, int foundedYear) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.building = building;
        this.foundedYear = foundedYear;
    }
    
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment Details:");
        System.out.println("Department Code: " + deptCode);
        System.out.println("Department Name: " + deptName);
        System.out.println("Building: " + building);
        System.out.println("Founded Year: " + foundedYear);
    }
}
