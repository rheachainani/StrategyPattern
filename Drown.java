package strategypattern;

public class Drown implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Drowning, unable to swim");
    }
}