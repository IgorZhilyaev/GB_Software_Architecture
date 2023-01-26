package Lesson06.HEXArchitecture.src.Domain;


import Lesson06.HEXArchitecture.src.Application.MovieApp;

public class Model {
    private MovieApp movieApp; // экземпляр ядра программы

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
     * запустить логику приложения
     * @param movieSearchRequest
     */
    public void Run(MovieSearchRequest movieSearchRequest)
    {
        movieApp.accept(movieSearchRequest); // принять запрос от пользователя
    }
}
