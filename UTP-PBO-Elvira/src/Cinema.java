import java.util.*;
public class Cinema {
    Scanner input = new Scanner(System.in);
    private String name;
    private User[] listUsers = new User[0];
    private Studio[] listStudio = new Studio[10];
    private int studioCapacity;

    public Cinema(String name, int studioCapacity){
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init(){

    }

    public boolean registerUser(User user){
        System.out.println("-----------------------------");
                    System.out.println("Register to Our System");
                    System.out.println("Fullname : ");
                    String fullname = input.nextLine();
                    System.out.println("Email : ");
                    String email = input.nextLine();
                    System.out.println("Password : ");
                    String password = input.nextLine();
                    System.out.println("Initial Ballance : ");
                    int initialBallance = input.nextInt();
                    input.nextLine();
                    // User user1 = new User(fullname, email, password, initialBallance);
                    // System.out.println("Successfully registered User!");
                    return false;     
    }

    public User authenticateUser(String email, String name){
        
    }

    public void displayListStudio(){

    }

    public void studioDetails(int studioNumber){

    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres){

    }

    public boolean bookTicket(User user, int studioNumber, char row, int col){

    }

    public String getName(){
        return name;
    }


}
