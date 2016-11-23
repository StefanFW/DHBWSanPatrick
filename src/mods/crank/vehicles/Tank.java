package mods.crank.vehicles;

import game.Vehicle;

public class Tank implements Vehicle {
    private String name = "Tank";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: Check leverage position
    }
}
