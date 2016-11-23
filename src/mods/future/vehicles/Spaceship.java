package mods.future.vehicles;

import game.Vehicle;

public class Spaceship implements Vehicle {
    private String name = "Spaceship";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: check jet engine
    }
}
