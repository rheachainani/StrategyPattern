package strategypattern;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // MallardDuck can fly with wings, quack, and swim normally
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("Displaying Mallard Duck");
    }
}
 