package mods.future;

import game.Terrain;
import game.Vehicle;
import mods.future.vehicles.Spaceship;
import mods.future.vehicles.Tardies;
import mods.future.vehicles.Zeppelin;

public class VehicleFactory extends game.VehicleFactory {
    @Override
    public Vehicle createVehicle(Terrain terrain){
        switch (terrain){
            case SKY:
                return new Zeppelin();

            case SPACE:
                return new Spaceship();

            case TRANSDIMENSIONAL:
                return new Tardies();

            default:
                return super.createVehicle(terrain);
        }
    }
}
