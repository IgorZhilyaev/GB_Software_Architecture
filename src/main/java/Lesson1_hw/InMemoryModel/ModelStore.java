package Lesson1_hw.InMemoryModel;

import Lesson1_hw.ModelElements.Camera;
import Lesson1_hw.ModelElements.Flash;
import Lesson1_hw.ModelElements.PoligonalModel;
import Lesson1_hw.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelCanger {

    private Collection<PoligonalModel> models;

    private Collection<Scene> scenes;

    private Collection<Flash> flashes;

    private Collection<Camera> cameras;

    private Collection<ModelChangedObserver> changedObservers = new ArrayList<>();

     @Override
    public void RegisterModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void NotifyChange() {

    }


}
