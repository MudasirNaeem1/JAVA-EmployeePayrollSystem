interface iDisplayAllEmployees {
    void displayAllEmployees(AddEmployee empInfo);
}

public class DisplayAllEmployees implements iDisplayAllEmployees {

    public void displayAllEmployees(AddEmployee empInfo){
        System.out.println("DISPLAY ALL EMPLOYEE'S DATA\n");
        for (int i=0 ; i< empInfo.addEmp.size() ; i++){
            System.out.println("Employee Number: " + empInfo.addEmp.get(i).getEmployeeNum());
            System.out.println("Employee Name: " + empInfo.addEmp.get(i).getEmployeeName());
            System.out.println("Father's Name: " + empInfo.addEmp.get(i).getFatherName());
            System.out.println("Contact Number: " + empInfo.addEmp.get(i).getContactNum());
            System.out.println("Qualification: " + empInfo.addEmp.get(i).getQualification());
            System.out.println("Date of Joining: " + empInfo.addEmp.get(i).getDoj());
            System.out.println("Date of End: " + empInfo.addEmp.get(i).getDoe());
            System.out.println("Date of Birth: " + empInfo.addEmp.get(i).getDob());
            System.out.println("Address: " + empInfo.addEmp.get(i).getAddress());
            System.out.println("Religion: " + empInfo.addEmp.get(i).getReligion());
            System.out.println("Designation: " + empInfo.addEmp.get(i).getDesignation());
            System.out.println("Department: " + empInfo.addEmp.get(i).getDept());
            System.out.println("CNIC number: " + empInfo.addEmp.get(i).getCnic());
            System.out.println("\nX-------------------------X-------------------------------X\n");
        }
        System.out.println("Returning back to Main Menu...\n");
    }
}