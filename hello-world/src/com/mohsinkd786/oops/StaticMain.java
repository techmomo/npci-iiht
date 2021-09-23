package com.mohsinkd786.oops;

public class StaticMain {
    public static void main(String[] args) {

        Plant plant = new EatablePlant();
        plant.isEatable();

        //
        Plant.hasLeaves = true;
        Plant.process();

        //System.out.println(plant.eatable);

        Plant plant1 = new PoisonousPlant();
        plant1.isEatable();
        //System.out.println(plant1.eatable);

        System.out.println("Leaves "+Plant.hasLeaves);

        // heap :
                // perm gen  - method area => Metaspace
                //
        Parent parent = new Parent(12);
        parent.getId();

    }
}
