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
        car.setName("Dacia");
        car.setColor("White");
        car.doorCount = 4;
        car.setMileage (7.5);
        car.running = true;

        double carTraveledDistance = car.accelerate(100, 2);





        System.out.println("Hello");
        System.out.println(car.toString());




        engine.manufacturer = "Microsoft";

        engine = null;




        Car car2 = new Car(new Engine());
        car2.setName("sfa");

        // some new content
    }
}
