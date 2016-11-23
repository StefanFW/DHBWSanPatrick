package mods.crank.vehicles;

import game.Vehicle;

public class Forklift implements Vehicle {
    private String name = "Forklift";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: Check crank position
    }
}
