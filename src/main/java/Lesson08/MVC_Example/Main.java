package Lesson08.MVC_Example;

import Lesson08.MVC_Example.Controller.Controller;
import Lesson08.MVC_Example.Controller.iGetModel;
import Lesson08.MVC_Example.Controller.iGetView;
import Lesson08.MVC_Example.Model.Model;
import Lesson08.MVC_Example.View.View;

public class Main {
    public static void main(String[] args) {

        /**
         * создаём экзкмпляры классов
         */
        iGetModel testModel = new Model();
        iGetView testView = new View();

        /**
         * создаём контроллер
         */
        Controller controllerItem = new Controller(testModel, testView);
    }

}

