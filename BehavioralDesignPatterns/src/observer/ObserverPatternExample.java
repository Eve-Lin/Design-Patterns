package observer;

public class ObserverPatternExample {

    public static void main (String [] args) {


        Observer firstObserver = new Observer();
        Subject subj1 = new Subject();

        subj1.registerObserver(firstObserver);
        subj1.set_flag(5);
        subj1.unregisterObserver(firstObserver);
        subj1.set_flag(25);
    }
}

