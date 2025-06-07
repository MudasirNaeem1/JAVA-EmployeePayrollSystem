import java.util.Scanner;

interface iMainMenu{
    void displayMainMenu();
}
class MainMenu implements iMainMenu {
    Scanner s = new Scanner(System.in);
    AddEmployee empInfo = new AddEmployee();
    EditEmployee editEmp = new EditEmployee();
    DeleteEmployee deleteEmp = new DeleteEmployee();
    LeaveManagementSystem lms = new LeaveManagementSystem();
    DisplayAllEmployees displayAllEmp = new DisplayAllEmployees();
    SearchEmployee searchEmp = new SearchEmployee();
    Employee emp = new Employee();

    public void displayMainMenu() {
        char opt;
        do {
            System.out.println("EMPLOYEE PAYROLL SYSTEM\n");
            System.out.println("MAIN MENU");
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee Information");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display all Employee's Data");
            System.out.println("6. Apply for Leave");
            System.out.println("7. Exit Application");
            System.out.print("\nEnter your choice: ");
            opt = s.next().charAt(0);
            System.out.println();

            switch (opt){
                case '1':{
                    empInfo.addEmployee();
                    break;
                }
                case '2':{
                    editEmp.editEmployee(empInfo);
                    break;
                }
                case '3':{
                    searchEmp.searchEmployee(empInfo);
                    break;
                }
                case '4':{
                    deleteEmp.deleteEmployee(empInfo);
                    break;
                }
                case '5':{
                    displayAllEmp.displayAllEmployees(empInfo);
                    break;
                }
                case '6':{
                    lms.leaveManagementSystem(empInfo,emp);
                    break;
                }
                case '7':{
                    break;
                }
                default:{
                    System.out.println("Invalid Input! Enter values from 1-7\n");
                    break;
                }
            }
        }while (opt != '7');
        System.out.println("Thank you for using our Application.\nExiting Application...");
    }

}