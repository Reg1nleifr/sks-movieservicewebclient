package fhtw.technikumwien.sks.helpers;

import fhtw.sks.generated.Movie;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Flo & Stefan
 */
@XmlRootElement(name="movies")
public class MovieRootElement {
    private List<Movie> movies;

    public MovieRootElement() {
    }

    @XmlElement(name="movie")
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
