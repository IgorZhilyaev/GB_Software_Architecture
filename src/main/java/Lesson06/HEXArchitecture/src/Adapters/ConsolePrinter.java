package Lesson06.HEXArchitecture.src.Adapters;


import Lesson06.HEXArchitecture.src.Application.IPrintMovieReviews;
import Lesson06.HEXArchitecture.src.Domain.MovieReview;


import java.util.List;

/**
 * вывод обзоров в консоль
 */
public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
