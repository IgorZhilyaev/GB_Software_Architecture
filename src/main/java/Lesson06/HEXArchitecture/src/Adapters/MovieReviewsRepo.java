package Lesson06.HEXArchitecture.src.Adapters;



import Lesson06.HEXArchitecture.src.Application.IFetchMovieReviews;
import Lesson06.HEXArchitecture.src.Domain.MovieReview;
import Lesson06.HEXArchitecture.src.Domain.MovieSearchRequest;

import java.util.*;

public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap; // репозиторий

    public MovieReviewsRepo() {
        initialize();
    } // инициализация

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    /**
     * создаём список, и добавляем 2 фильма
     */
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
