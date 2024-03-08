package strategypattern;

public class RubberDuck extends Duck {
    public RubberDuck() {
        // RubberDuck cannot fly, squeaks, and floats
        super(new FlyNoWay(), new Squeak(), new Float());
    }

    @Override
    public void display() {
        System.out.println("Displaying Rubber Duck");
    }
}
 