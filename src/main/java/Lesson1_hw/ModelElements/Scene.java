package Lesson1_hw.ModelElements;

import java.util.Collection;

public class Scene {

    static int counter = 0;
    private int id;
    private Collection <PoligonalModel> models;
    private Collection <Flash> flashes;
    private Collection <Camera> cameras;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Scene.counter = counter;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }


    {
        id = ++counter;
    }
}
