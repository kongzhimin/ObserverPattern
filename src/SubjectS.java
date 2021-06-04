import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
    protected List<Observer0>observers;
    public SubjectS(){
        observers = new ArrayList<Observer0>();
    }
    public void Add(Observer0 observer){
        observers.add(observer);
    }
    public void Remove(Observer0 observer){
        observers.remove(observer);
    }
    public abstract void notifyObserver();
}
