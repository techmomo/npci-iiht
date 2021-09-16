import com.mohsinkd786.designpattern.behavioral.*;
import com.mohsinkd786.designpattern.creational.*;
import com.mohsinkd786.designpattern.structural.*;

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


        // composite

        Shape circle = new Circle();
        Shape square = new Square();

        Drawing drawing = new Drawing();
        // add the shapes to the drawing board
        drawing.add(circle);
        drawing.add(square);

        drawing.draw("Red");

        // facade
        DbFacade.exportDB("SQL");

        // Bridge
        MyShape octa = new Octagon(new Yellow());

        MyShape myTriangle = new MyTriangle(new Blue());


        // Proxy
        Executor executor = new ExecutorProxy("admin","123");
        executor.run("Hello Proxy");


        // BEHAVIORAL PATTERNS

        // Template Method

        House house = new WoodenHouse();
        house.buildHouse();

        house = new ConcreteHouse();
        house.buildHouse();

        // Chain or responsibility

        ATMDispenserChain atmDispenserChain = new ATMDispenserChain();
        int amount = 5100;
        atmDispenserChain.getChain().dispense(new Currency(amount));


        /// Observer Pattern

        // subject
        Topic topic = new Topic();

        // define observers

        Observer observer1 = new TopicSubscriber("Obj1");
        Observer observer2 = new TopicSubscriber("Obj2");
        Observer observer3 = new TopicSubscriber("Obj3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);


        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        // send message

        topic.sendMessage("Hello How are you ");

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
*   a. Adapter : legacy / code base -> legacy adapter -> connect with -> latest app
*   b. Composite
*                   customer id  -> loan ->
*                                           -> personal
*                                           -> car
*                                           -> home
*
*                                -> card
*                                           -> credit card
*                                                       -> platinum
*                                                       -> diners
*                                           -> debit card
*                                -> Account ->
*                                               -> current
*                                               -> saving
*   c. Proxy
*   d. Flyweight
*   e. Facade       sports ->
*                               cricket ->
*                                           some rules
*                               volleyball ->
*                                           some rules
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
