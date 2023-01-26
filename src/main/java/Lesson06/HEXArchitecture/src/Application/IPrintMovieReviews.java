package Lesson06.HEXArchitecture.src.Application;



import Lesson06.HEXArchitecture.src.Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    /**
     * метод записи того что мы отобразим пользователю
     * @param movieReviewList
     */
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
