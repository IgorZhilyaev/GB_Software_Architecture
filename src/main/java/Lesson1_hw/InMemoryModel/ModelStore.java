package Lesson1_hw.InMemoryModel;

import Lesson1_hw.ModelElements.*;

import java.util.ArrayList;

/**
 * класс хранилище моделей, сцен, источников света и камер
 */
public class ModelStore implements IModelChanger {


    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Scene> scenes = new ArrayList<Scene>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<Camera>();
    private ArrayList<IModelChangedObserver> changeObservers = new ArrayList<IModelChangedObserver>();

    /**
     * конструктор
     * @param texture
     */
    public ModelStore(Texture texture){
        models.add(new PoligonalModel(texture));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene<>(models.get(0), cameras.get(0)));
    }

    /**
     * метод интерфейса IModelChanger
     * @param sender
     */
    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    /**
     * получаем сцену по номеру
     * @param sceneNumber - номер сцены
     * @return
     */
    public Scene getScene(int sceneNumber){
        return scenes.get(sceneNumber);
    }
}
