package Lesson1_hw.ModelElements;

import java.util.ArrayList;

/**
 * класс модель сцены
 */
public class Scene<Type1, Type2> {

    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    /**
     * конструктор
     * @param inputModels
     * @param inputCameras
     */
    public Scene(PoligonalModel inputModels, Camera inputCameras) {
        this.models.add(inputModels);
        this.cameras.add(inputCameras);
    }

    //заглушка
    public Type1 method1(Type1 t){
        return t;
    }

    //заглушка
    public Type2 method2(Type1 type1, Type2 type2){
        return type2;
    }
}
