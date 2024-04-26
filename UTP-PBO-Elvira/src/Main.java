import java.util.*;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Cinema c1 = new Cinema("Elvira cinema", 24);
        // static void menu() {
        
        int choice;
        do{
            System.out.println("----------------------------------");
            System.out.println(c1.getName());
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Pick your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Register to Our System");
                    System.out.print("Fullname : ");
                    String fullname = input.nextLine();
                    System.out.print("Email : ");
                    String email = input.nextLine();
                    System.out.print("Password : ");
                    String password = input.nextLine();
                    System.out.print("Initial Ballance : ");
                    int initialBallance = input.nextInt();
                    input.nextLine();
                    User user1 = new User(fullname, email, password, initialBallance);
                    System.out.println("Successfully registered User!");
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("Login to Our System");
                    System.out.println("Email : ");
                    String getEmail = input.nextLine();
                    System.out.println("Password : ");
                    String getPassword = input.nextLine();
                    boolean isLoggedIn = false;
                    for (String[] User : user1) {
                        if (user1.equals(user1.getEmail()) && user1.equals(user1.getPassword())) {
                            isLoggedIn = true;
                            break;
                        }
                    // }
            
                    if (isLoggedIn) {
                        System.out.println("Login berhasil!");
                    } else {
                        System.out.println("Login gagal!");
                        System.out.println("---------------------------------------------------------");
                        input.nextLine();
                    }
                }case 3:
                System.exit(0);
                
            }
        }while(choice != 3);
    
        
     }
    }

    // static void register(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("-----------------------------");
    //                 System.out.println("Register to Our System");
    //                 System.out.println("Fullname : ");
    //                 String fullname = input.nextLine();
    //                 System.out.println("Email : ");
    //                 String email = input.nextLine();
    //                 System.out.println("Password : ");
    //                 String password = input.nextLine();
    //                 System.out.println("Initial Ballance : ");
    //                 int initialBallance = input.nextInt();
    //                 input.nextLine();
    //                 User user1 = new User(fullname, email, password, initialBallance);
    //                 System.out.println("Successfully registered User!");
    // }
// }
// }
