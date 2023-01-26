package Lesson06.HEXArchitecture.src;


import Lesson06.HEXArchitecture.src.Adapters.ConsolePrinter;
import Lesson06.HEXArchitecture.src.Adapters.MovieReviewsRepo;
import Lesson06.HEXArchitecture.src.Adapters.UserCommand;
import Lesson06.HEXArchitecture.src.Application.IFetchMovieReviews;
import Lesson06.HEXArchitecture.src.Application.IPrintMovieReviews;
import Lesson06.HEXArchitecture.src.Application.IUserInput;
import Lesson06.HEXArchitecture.src.Application.MovieUser;
import Lesson06.HEXArchitecture.src.Domain.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo(); // создаём объект адаптера репозитория
        IPrintMovieReviews printMovieReviews = new ConsolePrinter(); // создаём объект адаптера принтера
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews); // создаём объект адаптера пользователя

        MovieUser movieUser = new MovieUser(userCommand); // создаём пользователя
        /**
         * создаём 2 сущности поиска
         */
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        /**
         * запускаем
         */
        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}