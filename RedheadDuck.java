package strategypattern;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        // RedheadDuck can fly with wings, quack, and swim normally
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("Displaying Redhead Duck");
    }
}
 