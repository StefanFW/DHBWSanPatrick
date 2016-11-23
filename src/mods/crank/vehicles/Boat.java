package mods.crank.vehicles;

import game.Vehicle;

public class Boat implements Vehicle {
    private String name = "Boat";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: check tiller position
    }
}
