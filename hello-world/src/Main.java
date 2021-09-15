import com.mohsinkd786.designpattern.creational.*;

public class Main {

    public static void main(String[] args)  throws Exception{
        System.out.println("Hello World!");

        //Singleton singleton = new Singleton();
        // eager
        Singleton singleton = Singleton.getInstance();

        // Lazy
        LazySingleton lazySingleton = LazySingleton.getInstance();

        // thread safe
        ThreadSingleton threadSingleton = ThreadSingleton.getInstance();

        // factory
        Vehicle car = VehicleFactory.getVehicle("CAR",100);
        Vehicle bike = VehicleFactory.getVehicle("BIKE",20);

        // abstract factory
        // factory of factories
        Vehicle car1 = VehicleAbsFactory.getVehicle(new CarFactory(),100);
        Vehicle bike1 = VehicleAbsFactory.getVehicle(new BikeFactory(),30);

        // builder
        Customer customer = new Customer
                .CustomerBuilder()
                .setEmail("email@gg.com")
                .setName("One")
                .setId(1)
                .setPhone(1234)
                .build();
        // prototype

        Employee emp1 = new Employee();
        emp1.loadProjects();

        // cloned object
        Employee clone1 = (Employee)emp1.clone();

        Employee clone2 = (Employee)emp1.clone();
    }
}


/*
* DESIGN PATTERNS:
*
* 1. Creational:
*   a. Singleton
*   b. Factory
*   c. Abstract Factory
*   d. Prototype
*   e.
* 2. Structural
*   a. Adapter
*   b. Composite
*   c. Proxy
*   d. Flyweight
*   e. Facade
*   f. Bridge
*   g. Decorator
*
* 3. Behavioral
*   a. Template Method
*   b. Mediator
*   c. Chain of Responsibility
*   d. Observer
*   e. Strategy
*   f. Command
*   g. State
*   h. Visitor
*   i. Interpretor
*   j. Memento
*   k. Iterator
*
*
*
*
* */
