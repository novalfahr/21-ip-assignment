package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *  
 */
public class RoleAccess {

    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
  
            switch (args[0]) {
                case "Super Admin":
<<<<<<< HEAD
<<<<<<< HEAD
                case "Admin":
                case "User":
                    isValidRole = true;
                    break;
            }
            
            if (isValidRole) {
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
=======
                    isValidRole = true;
                    break;
=======
>>>>>>> ebf6ea2 (feat(conditional/RoleAccess.java): fix switch case)
                case "Admin":
                case "User":
                    isValidRole = true;
                    break;
<<<<<<< HEAD
                default:
                    isValidRole = false;
                    break;
            }
            if (isValidRole == true) {
=======
            }
            
            if (isValidRole) {
>>>>>>> 6c9e8a9 (feat(conditional\RoleAccess.java): fix 'if (isValidRole)' space indent)
                switch (args[0] ) {
<<<<<<< HEAD
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
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)
=======
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
>>>>>>> 27afa1b (feat(conditional\RoleAccess.java): fix 'if (isValidRole)' space indent)
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
<<<<<<< HEAD
=======
>>>>>>> e74f85d (feat(conditional/RoleAccess): add int menuIndex = 0;)
=======
        
>>>>>>> 22c0e13 (feat(conditional/RoleAccess): add 'MenuIndex' 'subMenuIndex' 'isValidRole' as variable)
=======
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)
    }
}
