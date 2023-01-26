package Lesson06.HEXArchitecture.src.Application;



import Lesson06.HEXArchitecture.src.Domain.MovieReview;
import Lesson06.HEXArchitecture.src.Domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieApp {

    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    /**
     * метод который выполняет логику
     * @param movieSearchRequest
     */
    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest); //запрос к хранилищу оценок фильмов
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList)); // запуск фильтрации, т.е. нашей логики
        printMovieReviews.writeMovieReviews(randomReviews); // вывод
    }
}
