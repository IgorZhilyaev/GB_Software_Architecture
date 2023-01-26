package Lesson06.HEXArchitecture.src.Application;


import Lesson06.HEXArchitecture.src.Domain.MovieReview;
import Lesson06.HEXArchitecture.src.Domain.MovieSearchRequest;

import java.util.List;

public interface IFetchMovieReviews {
    /**
     * запрашивает из репозитория всё содержимое
     * @param movieSearchRequest
     * @return
     */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
