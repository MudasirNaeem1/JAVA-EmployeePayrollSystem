import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class LoginPanel {

    public void login() {

        int attempts = 0;
        int i=2;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        LocalDate date = LocalDate.now();
        DateTimeFormatter d_format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String F_date = date.format(d_format);

        System.out.println("\033[1m\033[4m\033[34mDate:\033[0m " + F_date);

        LocalTime time = LocalTime.now();
        DateTimeFormatter t_format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String F_time = time.format(t_format);

        System.out.println("\033[1m\033[34m\033[4mTime:\033[0m " + F_time);

        do {
            System.out.println("\n\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
            System.out.println("\t \t \t   \033[1m\033[35mEMPLOYEE PAYROLL SYSTEM\033[0m");
            System.out.println("   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501    ");
            System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501 \033[1m\033[35mEMPLOYEE AUTHENTICATION LOGIN\033[0m  \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501  ");
            System.out.print("\n\n   \033[35mENTER EMPLOYEE ID:\033[0m ");
            String username = scanner.next();

            System.out.print(" \n   \033[35mENTER PASSWORD:\033[0m ");
            String password = scanner.next();

            if (username.equals("1001") && password.equals("Manager_0"))
            {
                System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
                System.out.println("  \n\n   \033[32mWELCOME Ali Ahsan\033[0m");
                System.out.println("\n\n\n   \033[32mPress any key to continue...\033[0m");
                scanner.nextLine(); //Consume the newline character
                scanner.nextLine(); //Wait for user input
                break;
            }

            else if (username.equals("1002") && password.equals("A.man2"))
            {
                System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
                System.out.println("  \n\n   \033[32mWELCOME Zainab Shahab\033[0m");
                System.out.println("\n\n\n   \033[32mPress any key to continue...\033[0m");
                scanner.nextLine(); //Consume the newline character
                scanner.nextLine(); //Wait for user input
                break;
            }

            else if (username.equals("1003") && password.equals("Ex_1"))
            {
                System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
                System.out.println("  \n\n   \033[32mWELCOME Ahmed Ali\033[0m");
                System.out.println("\n\n\n   \033[32mPress any key to continue...\033[0m");
                scanner.nextLine(); //Consume the newline character
                scanner.nextLine(); //Wait for user input
                break;
            }

            else if (username.equals("1004") && password.equals("Ex_2"))
            {
                System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
                System.out.println("  \n\n   \033[32mWELCOME Hamdan Ahmed\033[0m");
                System.out.println("\n\n\n   \033[32mPress any key to continue...\033[0m");
                scanner.nextLine(); //Consume the newline character
                scanner.nextLine(); //Wait for user input
                break;
            }

            else
            {
                System.out.println("\n   \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501");
                if (i == 2)
                {
                    System.out.println("\n\n   \033[31mINVALID USERNAME OR PASSWORD...YOU HAVE JUST\033[0m " + i + " \033[31mTRIES REMAINING...\033[0m");
                    System.out.println("   PRESS ENTER TO TRY AGAIN...");
                }

                else if (i == 1)
                {
                    System.out.println("\n\n   \033[31mINVALID USERNAME OR PASSWORD...YOU HAVE ONLY\033[0m " + i + " \033[31mTRY REMAINING...\033[0m");
                    System.out.println("   PRESS ENTER TO TRY AGAIN...");
                }

                else
                {
                    System.out.println("\n\n   \033[31mINVALID USERNAME OR PASSWORD...NO TRIES LEFT\033[0m");
                    System.out.println("   \033[32mPRESS ENTER TO EXIT SYSTEM...\033[0m");
                }

                attempts++;
                scanner.nextLine(); //Consume the newline character
                scanner.nextLine(); //Wait for user input
            }

            i--;
        }
        while (attempts < 3);

        if (attempts == 3)
        {
            System.out.println("\n    \033[31mYou have entered the wrong username and password three times. Exiting...\033[0m");
            System.exit(0);
        }
    }
}