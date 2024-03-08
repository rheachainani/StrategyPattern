package strategypattern;

public class Float implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Floating on the water");
    }
}
 