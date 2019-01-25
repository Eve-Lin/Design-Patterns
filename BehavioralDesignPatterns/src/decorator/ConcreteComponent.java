package decorator;

public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am from Concrete Component and I am closed for modifications");
    }
}
