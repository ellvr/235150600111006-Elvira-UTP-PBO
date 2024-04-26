public class User{
    private String email;
    private String password;
    private String fullName;
    private double ballance;
    private Ticket[] ticketList = new Ticket[0];
    private static int MaxTicket;

    public User(String email, String password, String fullName, double ballance){
        this.email = email;
        this.password = password;
        this.fullName =  fullName;
        this.ballance = ballance;
    }

    public boolean addTicket(Ticket ticket){
        return false;

    }

    public void displayAllTickets(){
        
    }

    public boolean isMatch(String email, String password){

    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getFulName(){
        return fullName;
    }

    public double getBallance(){
        return ballance;
    }

    public void setBallance(double ballance){
        this.ballance = ballance;
    }
}