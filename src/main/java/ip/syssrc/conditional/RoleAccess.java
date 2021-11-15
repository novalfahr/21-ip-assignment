package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211064 - Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
public class RoleAccess {

    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
            // Your magic is here
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
                    break;  
            }
            
            if (isValidRole) { 
                // Another magic
                switch (args[0]) { 
                    case "Super Admin":
                        menuIndex++;
                        subMenuIndex++;
                        System.out.printf("%d. Super Admin\n", menuIndex);
                        System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                        System .out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex++);
                        System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex++);
                    case "Admin":
                        menuIndex++;
                        subMenuIndex = 1;
                        System.out.printf("%d. Admin\n", menuIndex);
                        System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex++);
                    default:
                        menuIndex++;
                        subMenuIndex = 1;
                        System.out.printf("%d. User\n", menuIndex);
                        System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                        System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex++);
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
