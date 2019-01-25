package observer;

public interface ISubject {

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();
}
