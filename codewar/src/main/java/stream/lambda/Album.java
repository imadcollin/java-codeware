package stream.lambda;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private int id;
    private  String name;
    private List<Movie> movies;

    public  Album(int id , String name){
        this.id=id;
        this.name=name;
        movies=new ArrayList<>();
    }
    public void addMovies(Movie movie){
        movies.add(movie);
    }
    public void deleteMovieById(String id) {
        if(movies.size()==0) System.out.println("No Movies in the Album");
        else {
            for (Movie movie: movies
            ) {
                if (movie.getId().equals(id)) {
                    movies.remove(movie);
                }
            }
        }
    }
    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovieByName(String name){
        if(name.length()==0) System.out.println("Please provide at leas one character");
        else {
            for (Movie movie :movies
            ) {
                if (movie.getName().equals(name)){
                    return  movie;
                }
            }
        }
        return  null;
    }

}
