public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats = new boolean[5][5];

    public Studio(String type){

    }
    public String getStudioInfo(){
        
    }

    public int isBooked(char row, int col){

    }

    public boolean reserve(char row, int col){

    }

    public String getType(){
        return type;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    private void setSeats(){

    }

}
