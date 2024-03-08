# Duck Simulation Program

This Java program simulates the behavior of different types of ducks using the strategy pattern. The program is organized into several classes and interfaces, each representing different aspects of a duck's behavior.

## Classes and Interfaces

### Duck.java
- Abstract class representing a generic duck.
- Properties for fly behavior, quack behavior, and swim behavior.
- Defines methods for displaying, performing quack, fly, and swim actions, and setting behaviors.

### MallardDuck.java
- Extends Duck class.
- Represents a Mallard duck with specific fly, quack, and swim behaviors.
- Overrides the display method to show the Mallard duck.

### RedheadDuck.java
- Extends Duck class.
- Represents a Redhead duck with specific fly, quack, and swim behaviors.
- Overrides the display method to show the Redhead duck.

### RubberDuck.java
- Extends Duck class.
- Represents a Rubber duck with specific fly, quack, and swim behaviors.
- Overrides the display method to show the Rubber duck.

### DecoyDuck.java
- Extends Duck class.
- Represents a Decoy duck with specific fly, quack, and swim behaviors.
- Overrides the display method to show the Decoy duck.

### FlyBehavior.java
- Interface representing the fly behavior of ducks.
- Contains the `fly()` method.

### FlyWithWings.java
- Implements FlyBehavior.
- Represents flying with wings.

### FlyNoWay.java
- Implements FlyBehavior.
- Represents being unable to fly.

### QuackBehavior.java
- Interface representing the quack behavior of ducks.
- Contains the `quack()` method.

### Quack.java
- Implements QuackBehavior.
- Represents a typical quacking sound.

### Squeak.java
- Implements QuackBehavior.
- Represents a squeaking sound.

### MuteQuack.java
- Implements QuackBehavior.
- Represents a silent quack.

### SwimBehavior.java
- Interface representing the swim behavior of ducks.
- Contains the `swim()` method.

### Swim.java
- Implements SwimBehavior.
- Represents normal swimming.

### Float.java
- Implements SwimBehavior.
- Represents floating on the water.

### Drown.java
- Implements SwimBehavior.
- Represents drowning and inability to swim.

## Main.java
- Contains the `main` method for running the duck simulation.
- Creates instances of MallardDuck, RedheadDuck, RubberDuck, and DecoyDuck.
- Displays the ducks and their behaviors.
