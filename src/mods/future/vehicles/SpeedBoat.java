package mods.future.vehicles;

import game.Vehicle;

public class SpeedBoat implements Vehicle {
    private String name = "Speed-Boat";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void steer() {
        //TODO: check tiller position
    }
}
