//Name: Rhea Chainani
//PRN: 22070126086
//Batch: AIML-B1

package strategypattern;

public class Main {
 public static void main(String[] args) {
     // Creating ducks with different behaviors
     Duck mallardDuck = new MallardDuck();
     Duck redheadDuck = new RedheadDuck();
     Duck rubberDuck = new RubberDuck();
     Duck decoyDuck = new DecoyDuck();

     // Displaying ducks and their behaviors
     displayDuckDetails(mallardDuck);
     displayDuckDetails(redheadDuck);
     displayDuckDetails(rubberDuck);
     displayDuckDetails(decoyDuck);
 }

 private static void displayDuckDetails(Duck duck) {
     duck.display();
     duck.performQuack();
     duck.performFly();
     duck.swim();
     System.out.println();
 }
}
