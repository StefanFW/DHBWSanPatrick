package mods.future.vehicles;

import game.Vehicle;

public class Tardies implements Vehicle {
    private String name = "Tardies";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: do something mysterial
    }
}
