package strategypattern;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        // DecoyDuck cannot fly, mute quack, and drowns
        super(new FlyNoWay(), new MuteQuack(), new Drown());
    }

    @Override
    public void display() {
        System.out.println("Displaying Decoy Duck");
    }
}
