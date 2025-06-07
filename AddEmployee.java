import java.util.ArrayList;
import java.util.Scanner;

interface iAddEmployee {
    void addEmployee();
}

class AddEmployee implements iAddEmployee {
    ArrayList<AddEmployee> addEmp = new ArrayList<>();
    protected String employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic;

    public AddEmployee(String employeeNum, String employeeName, String fatherName, String contactNum, String qualification, String doj, String doe, String dob, String address, String religion, String designation, String dept, String cnic) {
        this.employeeNum = employeeNum;
        this.employeeName = employeeName;
        this.fatherName = fatherName;
        this.contactNum = contactNum;
        this.qualification = qualification;
        this.doj = doj;
        this.doe = doe;
        this.dob = dob;
        this.address = address;
        this.religion = religion;
        this.designation = designation;
        this.dept = dept;
        this.cnic = cnic;
    }

    public AddEmployee() {
    }

    public void addEmployee() {
        Scanner s = new Scanner(System.in);
        System.out.println("EMPLOYEE PAYROLL SYSTEM");
        System.out.println("ADD EMPLOYEE INFORMATION\n");
        System.out.print("Employee Number: ");
        String employeeNum = s.nextLine();
        System.out.print("Employee Name: ");
        String employeeName = s.nextLine();
        System.out.print("Father's Name: ");
        String fatherName = s.nextLine();
        System.out.print("Contact Number: ");
        String contactNum = s.nextLine();
        System.out.print("Qualification: ");
        String qualification = s.nextLine();
        System.out.print("Date of Joining: ");
        String doj = s.nextLine();
        System.out.print("Date of End: ");
        String doe = s.nextLine();
        System.out.print("Date of Birth: ");
        String dob = s.nextLine();
        System.out.print("Address: ");
        String address = s.nextLine();
        System.out.print("Religion: ");
        String religion = s.nextLine();
        System.out.print("Designation: ");
        String designation = s.nextLine();
        System.out.print("Department: ");
        String dept = s.nextLine();
        System.out.print("CNIC number: ");
        String cnic = s.nextLine();

        addEmp.add(new AddEmployee(employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic));
        System.out.println("\nEmployee successfully added!");
        System.out.println("\nX-------------------------X-------------------------------X\n");
        System.out.println("Returning back to Main Menu...\n");
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

}

class Manager extends AddEmployee {
    private double grossSalary; private int grade;

    public Manager(String employeeNum, String employeeName, String fatherName, String contactNum, String qualification, String doj, String doe, String dob, String address, String religion, String designation, String dept, String cnic) {
        super(employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic);
        this.grossSalary = 200000;
        this.grade = 10;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class AsstManager extends AddEmployee {
    private double grossSalary; private int grade;

    public AsstManager(String employeeNum, String employeeName, String fatherName, String contactNum, String qualification, String doj, String doe, String dob, String address, String religion, String designation, String dept, String cnic) {
        super(employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic);
        this.grossSalary = 120000;
        this.grade = 11;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Executive extends AddEmployee {
    private double grossSalary; private int grade;

    public Executive(String employeeNum, String employeeName, String fatherName, String contactNum, String qualification, String doj, String doe, String dob, String address, String religion, String designation, String dept, String cnic) {
        super(employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic);
        this.grossSalary = 200000;
        this.grade = 12;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Officer extends AddEmployee {
    private double grossSalary; private int grade;

    public Officer(String employeeNum, String employeeName, String fatherName, String contactNum, String qualification, String doj, String doe, String dob, String address, String religion, String designation, String dept, String cnic) {
        super(employeeNum, employeeName, fatherName, contactNum, qualification, doj, doe, dob, address, religion, designation, dept, cnic);
        this.grossSalary = 200000;
        this.grade = 13;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}