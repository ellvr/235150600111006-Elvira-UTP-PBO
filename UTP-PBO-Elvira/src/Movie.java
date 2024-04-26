public class Movie {
    private String title;
    private double rating;
    private String[] genres = new String[0];

    public Movie(String title, double rating){

    }

    public Movie(String title, double rating, String[] genres){

    }

    public String getTitle(){
        return title;
    }

    public double getRating(){
        return rating;
    }

    public String[] getGenres(){
        return genres;
    }

    public void setGenres(String[] genres){
        this.genres = genres;
    }
}
