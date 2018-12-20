package org.fasttrackit;

/**
 * Hello world!
 *fdsafdas
 * fdsa
 * fdsa
 * fdsa
 * fdsa
 */

// this is a comment
public class App 
{
    public static void main( String[] args ) {

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;

        double carTraveledDistance = car.accelerate(100, 2);





        System.out.println("Hello");
        System.out.println(car.toString());




        engine.manufacturer = "Microsoft";

        engine = null;




        Car car2 = new Car(new Engine());
        car2.name = "sfa";

        // some new content
    }
}
