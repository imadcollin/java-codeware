package stream.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
    private final int id;
    private String name;
    private List<Movie> movies;

    public Album(int id, String name) {
        this.id = id;
        this.name = name;
        movies = new ArrayList<>();
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public void deleteMovieById(String id) {
        if (movies.size() == 0) System.out.println("No Movies in the Album");
        else {
        /*    for (Movie movie: movies
            ) {
                if (movie.getId().equals(id)) {
                    movies.remove(movie);
                }
            }

             */
            movies.stream().filter(movie -> movie.getId().equals(id)).collect(Collectors.toList());
        }
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieByName(String name) {
        if (name.length() == 0) System.out.println("Please provide at leas one character");
        else {
      /*      for (Movie movie :movies
            ) {
                if (movie.getName().equals(name)){
                    return  movie;
                }
            }
       */
            return movies.stream().filter(movie -> movie.getName().equals(name)).findAny().orElse(null);
        }

        return null;
    }

    public List<Movie> sortByName(List<Movie> list) {
     /*   Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return  (o1.getName().compareTo(o2.getName()));
            }
        });
*/
        list.sort(Comparator.comparing(Movie::getName));
        return list;
    }


}
