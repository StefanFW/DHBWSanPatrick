package game.vehicles;

import game.Vehicle;

public class Car implements Vehicle {

    private String name = "Car";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: Check steering wheel position
    }
}
