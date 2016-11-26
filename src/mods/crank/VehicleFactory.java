package mods.crank;

import game.AbstractVehicleFactory;
import game.vehicles.Car;
import game.Terrain;
import game.Vehicle;
import mods.crank.vehicles.Boat;
import mods.crank.vehicles.Forklift;
import mods.crank.vehicles.Tank;

public class VehicleFactory extends game.VehicleFactory {
    @Override
    public Vehicle createVehicle(Terrain terrain) {
        switch (terrain){
            case WATER:
                return new Boat();

            case OFFROAD:
                return new Tank();

            case INDUSTRIAL:
                return new Forklift();

            default:
                return super.createVehicle(terrain);
        }
    }
}
