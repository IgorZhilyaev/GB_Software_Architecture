package Lesson1_hw.InMemoryModel;

public interface ModelCanger {
    void RegisterModelChanger(ModelChangedObserver o);
    void RemoveModelChanger(ModelChangedObserver o);
    void NotifyChange();
}
