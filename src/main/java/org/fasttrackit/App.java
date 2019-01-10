package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

/**
 * Hello world!
 *fdsafdas
 * fdsa
 * fdsa
 * fdsa
 * fdsa
 */

// this is a comment
public class App{
//{
   public static void main( String[] args ) {
//
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("White");
        car.doorCount = 4;
        car.setMileage (7.5);
        car.running = true;
       System.out.println(car.toString());
//
//        double carTraveledDistance = car.accelerate(100, 2);
//
//
//
//
//
//        System.out.println("Hello");
//        System.out.println(car.toString());
//
//
//
//
//        engine.manufacturer = "Microsoft";
//
//        engine = null;
//
//
//
//
//        Car car2 = new Car(new Engine());
//        car2.setName("sfa");
//
//        // some new content
//

Vehicle vehicle1 =  new Vehicle();
         vehicle1.vehicleCount ++ ;

         Vehicle vehicle2 = new Vehicle();
         vehicle2.vehicleCount = 2;

         Vehicle vehicle3 = new Vehicle();
         Vehicle.vehicleCount = 3;

       System.out.println("Vault from vehicle 1: " + vehicle1.vehicleCount);
       System.out.println("Value from vehicle 2: " + vehicle2.vehicleCount );
       System.out.println("Value from vehicle 3: " + vehicle3.vehicleCount);


       new AutoVehicle();

       new AutoVehicle(new Engine());

       vehicle1.accelerate(34.12);
       vehicle2.accelerate(130,0.8);

       new UFO().accelerate(130,0.8);

       // polymarphism ( an object cant take multiple forms)
       Vehicle ufo = new  UFO();
       // the type of the variable does NOT determine the object's behaviour
       ufo.accelerate(200,2);

        //The type of the variable determine what  methods can invoked
       // We might need type casting (see below)
       ((UFO) ufo) .concealCheating();



}
}
