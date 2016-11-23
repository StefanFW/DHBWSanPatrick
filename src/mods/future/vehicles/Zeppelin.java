package mods.future.vehicles;

import game.Vehicle;

public class Zeppelin implements Vehicle {
    private String name = "Zeppelin";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: check steering wheel position
    }
}
