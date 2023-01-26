package Lesson06.HEXArchitecture.src.Adapters;


import Lesson06.HEXArchitecture.src.Application.IFetchMovieReviews;
import Lesson06.HEXArchitecture.src.Application.IPrintMovieReviews;
import Lesson06.HEXArchitecture.src.Application.IUserInput;
import Lesson06.HEXArchitecture.src.Application.MovieApp;
import Lesson06.HEXArchitecture.src.Domain.Model;
import Lesson06.HEXArchitecture.src.Domain.MovieSearchRequest;

/**
 * команды которые присылает пользователь
 */
public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
