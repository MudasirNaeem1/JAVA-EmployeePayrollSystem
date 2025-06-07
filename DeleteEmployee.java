import java.util.Scanner;

interface iDeleteEmployee {
    void deleteEmployee(AddEmployee empInfo);
}

public class DeleteEmployee implements iDeleteEmployee {
    Scanner s = new Scanner(System.in);
    public void deleteEmployee(AddEmployee empInfo){

        boolean empFound = false;
        System.out.println("DELETE ACCOUNT\n");
        System.out.print("Enter the Employee Number for which you want to delete the account: ");
        String inputEmpNum = s.nextLine();

        for (int i=0 ; i<empInfo.addEmp.size() ; i++){
            if(inputEmpNum.equals(empInfo.addEmp.get(i).employeeNum)){
                System.out.println("Employee found!\n");
                empInfo.addEmp.remove(i);
                System.out.println("Account Successfully deleted!");
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