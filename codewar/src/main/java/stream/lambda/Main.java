package stream.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args ){
        Movie m1= new Movie("1","war");
        Movie m2= new Movie("2","cool");
        Movie m3= new Movie("3","aea");

        List<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        Album album1= new Album(1, "Action Movies");
        album1.addMovies(m1);
        album1.addMovies(m2);

        // get all movies
        album1.getAllMovies();
        System.out.println(album1.getAllMovies());
        //Get by name
        Movie myMovie= album1.getMovieByName("cool");
        System.out.println(myMovie.getName());

        // Remove movie
        album1.deleteMovieById("1");
        // Check the list
        album1.getAllMovies();
        System.out.println(album1.getAllMovies());

        album1.addMovies(m1);
        album1.addMovies(m2);
        album1.addMovies(m3);

       List<Movie> sortedList= album1.sortByName(movies);
        for (Movie movie:sortedList
             ) {
            System.out.println(movie.getName());

        }    }
}
