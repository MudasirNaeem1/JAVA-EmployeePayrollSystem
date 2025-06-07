import java.util.Scanner;

interface iEditEmployee{
    void editEmployee(AddEmployee empInfo);
}

class EditEmployee implements iEditEmployee {
    Scanner s = new Scanner(System.in);
    public void editEmployee(AddEmployee empInfo){

        boolean empFound = false; int opt;
        System.out.println("EDIT EMPLOYEE INFORMATION\n");
        System.out.print("Enter your Employee Number for which you want to edit the information: ");
        String inputEmpNum = s.nextLine();

        for (int i=0 ; i<empInfo.addEmp.size() ; i++){
            if(inputEmpNum.equals(empInfo.addEmp.get(i).employeeNum)){
                System.out.println("Employee found!\n");
                System.out.println("Choose the option you want to edit the information for.");
                System.out.println("1. Employee Number");
                System.out.println("2. Employee Name");
                System.out.println("3. Father's Name");
                System.out.println("4. Contact Number");
                System.out.println("5. Qualification");
                System.out.println("6. Date of Joining");
                System.out.println("7. Date of End");
                System.out.println("8. Date of Birth");
                System.out.println("9. Address");
                System.out.println("10. Religion");
                System.out.println("11. Designation");
                System.out.println("12. Department");
                System.out.println("13. CNIC");
                System.out.print("\nEnter option: ");
                opt = s.nextInt();

                switch (opt){
                    case 1:{
                        System.out.print("Enter new Employee Number: ");
                        empInfo.addEmp.get(i).setEmployeeNum(s.next());
                        System.out.println("\nEmployee Number successfully changed to " + empInfo.addEmp.get(i).getEmployeeNum());
                        break;
                    }
                    case 2:{
                        System.out.print("Enter new Employee Name: ");
                        empInfo.addEmp.get(i).setEmployeeName(s.next());
                        System.out.println("\nEmployee Name successfully changed to " + empInfo.addEmp.get(i).getEmployeeName());
                        break;
                    }
                    case 3:{
                        System.out.print("Enter new Father's Name: ");
                        empInfo.addEmp.get(i).setFatherName(s.next());
                        System.out.println("\nFather's Name successfully changed to " + empInfo.addEmp.get(i).getFatherName());
                        break;
                    }
                    case 4:{
                        System.out.print("Enter new Contact Number: ");
                        empInfo.addEmp.get(i).setContactNum(s.next());
                        System.out.println("\nContact Number successfully changed to " + empInfo.addEmp.get(i).getContactNum());
                        break;
                    }
                    case 5:{
                        System.out.print("Enter new Qualification: ");
                        empInfo.addEmp.get(i).setQualification(s.next());
                        System.out.println("\nQualification successfully changed to " + empInfo.addEmp.get(i).getQualification());
                        break;
                    }
                    case 6:{
                        System.out.print("Enter new Date of Joining: ");
                        empInfo.addEmp.get(i).setDoj(s.next());
                        System.out.println("\nDate of Joining successfully changed to " + empInfo.addEmp.get(i).getDoj());
                        break;
                    }
                    case 7:{
                        System.out.print("Enter new Date of End: ");
                        empInfo.addEmp.get(i).setDoe(s.next());
                        System.out.println("\nDate of End successfully changed to " + empInfo.addEmp.get(i).getDoe());
                        break;
                    }
                    case 8:{
                        System.out.print("Enter new Date of Birth: ");
                        empInfo.addEmp.get(i).setDob(s.next());
                        System.out.println("\nDate of Birth successfully changed to " + empInfo.addEmp.get(i).getDob());
                        break;
                    }
                    case 9:{
                        System.out.print("Enter new Address: ");
                        empInfo.addEmp.get(i).setAddress(s.next());
                        System.out.println("\nAddress successfully changed to " + empInfo.addEmp.get(i).getAddress());
                        break;
                    }
                    case 10:{
                        System.out.print("Enter new Religion: ");
                        empInfo.addEmp.get(i).setReligion(s.next());
                        System.out.println("\nReligion successfully changed to " + empInfo.addEmp.get(i).getReligion());
                        break;
                    }
                    case 11:{
                        System.out.print("Enter new Designation: ");
                        empInfo.addEmp.get(i).setDesignation(s.next());
                        System.out.println("\nDesignation successfully changed to " + empInfo.addEmp.get(i).getDesignation());
                        break;
                    }
                    case 12:{
                        System.out.print("Enter new Department: ");
                        empInfo.addEmp.get(i).setDept(s.next());
                        System.out.println("\nDepartment successfully changed to " + empInfo.addEmp.get(i).getDept());
                        break;
                    }
                    case 13:{
                        System.out.print("Enter new CNIC: ");
                        empInfo.addEmp.get(i).setCnic(s.next());
                        System.out.println("\nCNIC successfully changed to " + empInfo.addEmp.get(i).getCnic());
                        break;
                    }
                }
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