import javax.sound.midi.Soundbank;
import java.util.Scanner;

interface iSearchEmployee {
    void searchEmployee(AddEmployee empInfo);
}

public class SearchEmployee implements iSearchEmployee {
    Scanner s = new Scanner(System.in);
    public void searchEmployee(AddEmployee empInfo){

        boolean empFound = false;
        System.out.println("SEARCH EMPLOYEE\n");
        System.out.print("Enter your Employee Number for which you want to edit the information: ");
        String inputEmpNum = s.nextLine();

        for (int i=0 ; i<empInfo.addEmp.size() ; i++){
            if(inputEmpNum.equals(empInfo.addEmp.get(i).employeeNum)){
                System.out.println("Employee found!\n");
                System.out.println("Employee Details: \n");
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
                empFound = true;
                break;
            }
        }

        if (!empFound){
            System.out.println("Error: Employee not found.");
        }

        System.out.println("\nX-------------------------X-------------------------------X\n");
        System.out.println("Returning back to Main Menu...\n");
    }
}