package ip.syssrc.conditional;
public class RoleAccess {
/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211065- Asehpryanto Rari Parinding <Asehpryantorari@gmail.com>
 *
 */
<<<<<<< HEAD
 
=======
import java.util.Scanner;
 public class RoleAccess {
>>>>>>> 6289f98 (feat(conditional/RoleAccess): add 'java.util.Scanner' object)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0) {

            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");

        } else if (args.length == 1) {

            switch (args[0]) {
            case "Super Admin":
            case "Admin":
            case "User":
                isValidRole = true;
                break;
            }
            if (isValidRole) {
                switch (args[0]) {
                case "Super Admin":
                    menuIndex++;
                    System.out.printf("%d. Super Admin\n", menuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                    System.out.println();
                case "Admin":
                    menuIndex++;
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", menuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
                default:
                    menuIndex++;
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex++;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
                    break;
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
    }
}
=======
                int menuIndex = 0;
                int subMenuIndex = 0;
                boolean isValidRole = false;
            
                if (args.length == 0) {
                  System.out.println("What role you want to see ?");
                  System.out.println("For example, try 'Admin'.");
                } else if (args.length == 1) {
        
                    switch (args[0]) {
                        case "Super Admin":
                            isValidRole = true;
                            break;
                        case "Admin":
                            isValidRole = true;
                            break;
                        case "User":
                            isValidRole = true;
                            break;
                        default:
                            isValidRole = false;
                            break;
                    }
                    if (isValidRole == true) {
                        switch (args[0] ) {
                        case "Super Admin":
                            menuIndex = menuIndex + 1;
                            System.out.printf("%d. Super Admin\n", menuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                            System.out.println();
                        case "Admin":
                            menuIndex = menuIndex + 1;
                            subMenuIndex = 0;
                            System.out.printf("%d. Admin\n", menuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
                        default:
                            menuIndex = menuIndex + 1;
                            subMenuIndex = 0;
                            System.out.printf("%d. User\n", menuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                            subMenuIndex = subMenuIndex + 1;
                            System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
                            break;
                        }
                    } else {
                        System.out.println("Invalid Role");
                        System.out.println("Valid Role : Super Admin, Admin, User");
                    }
                } else {
                    System.out.println("Too many argument");
                }
        in.close();
    } 
}

>>>>>>> f186497 (feat(conditional/Cashier): add 'java.util.Scanner' object)
