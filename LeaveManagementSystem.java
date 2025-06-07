import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

interface iLeaveManagementSystem {
    void leaveManagementSystem(AddEmployee empInfo, Employee emp);
}

class Employee {
    int totalLeaves; int leavesTaken; int deductionAmount;

    public Employee() {
        this.totalLeaves = 5; // Total leaves allowed without deduction
        this.leavesTaken = 0;
        this.deductionAmount = 0;
    }
}

class LeaveManagementSystem implements iLeaveManagementSystem {

    public void leaveManagementSystem(AddEmployee empInfo, Employee emp) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLEAVE MANAGEMENT SYSTEM MENU:");
            System.out.println("1. Apply for Leave");
            System.out.println("2. Display Leave Record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    applyForLeave(empInfo, emp);
                    break;
                case 2:
                    displayLeaveRecord(empInfo, emp);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        System.out.println("\nX-------------------------X-------------------------------X\n");
        System.out.println("Exiting Leave Management System...");
    }

    public void applyForLeave(AddEmployee empInfo, Employee employee) {
        boolean empFound = false;
        Scanner s = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("\nAPPLY FOR LEAVE\n");
        System.out.print("Enter Employee Number for which you want to apply leave: ");
        String inputEmpNum = s.nextLine();

        for (int i = 0; i < empInfo.addEmp.size(); i++) {
            if (inputEmpNum.equals(empInfo.addEmp.get(i).employeeNum)) {
                System.out.println("\nEmployee found!\n");
                System.out.print("Enter leave from (DD-MM-YYYY): ");
                String inputFromDate = s.nextLine();
                LocalDate fromDate = LocalDate.parse(inputFromDate, formatter);

                System.out.print("Enter leave till (DD-MM-YYYY): ");
                String inputToDate = s.nextLine();
                LocalDate toDate = LocalDate.parse(inputToDate, formatter);

                // Calculate total leave days
                int totalLeaveDays = (int) ChronoUnit.DAYS.between(fromDate.minusDays(1), toDate) + 1;

                // Deduction logic for leaves beyond the allowed limit
                if (totalLeaveDays > employee.totalLeaves) {
                    int extraLeaves = totalLeaveDays - employee.totalLeaves;
                    employee.deductionAmount += extraLeaves * 1000;
                    totalLeaveDays = employee.totalLeaves; // Cancel extra leaves beyond the allowed limit
                    System.out.println("Deduction Amount: Rs. " + employee.deductionAmount);
                }

                // Update employee's leave information
                employee.leavesTaken += totalLeaveDays;
                System.out.println("\nX-------------------------X-------------------------------X\n");
                System.out.println("Leave applied successfully...");
                System.out.println("Returning to Leave Management System Menu...\n");
                empFound = true;
                break;
            }
        }
    }

    public void displayLeaveRecord(AddEmployee empInfo, Employee employee) {
        Scanner s = new Scanner(System.in);
        System.out.println("DISPLAY LEAVE RECORD\n");

        System.out.print("Enter Employee Number for which you want to display leave record: ");
        String inputEmpNum = s.nextLine();

        for (int i = 0; i < empInfo.addEmp.size(); i++) {
            if (inputEmpNum.equals(empInfo.addEmp.get(i).employeeNum)) {
                System.out.println("\nEmployee found!\n");
                    System.out.println("Leave Record for Employee: " + empInfo.addEmp.get(i).employeeName);
                    System.out.println("Employee Number: " + empInfo.addEmp.get(i).employeeNum);
                    System.out.println("Total Leaves Allowed: " + employee.totalLeaves);
                    System.out.println("Leaves Taken: " + employee.leavesTaken);
                    System.out.println("Deduction Amount: Rs. " + employee.deductionAmount);
                    System.out.println("Unpaid Leaves Allowed: " + Math.max(0, employee.totalLeaves - employee.leavesTaken));
            }
        }
        System.out.println("\nX-------------------------X-------------------------------X\n");

        System.out.println("Returning to Leave Management System Menu...\n");
    }
}