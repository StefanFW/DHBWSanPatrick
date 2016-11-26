package mods.future.vehicles;

import game.Vehicle;

public class Tardis implements Vehicle {
    private String name = "Tardis";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: even the Doctor doesn't how to do it
    }
}
