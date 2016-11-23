package game;

import game.vehicles.Car;

public class VehicleFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle createVehicle(Terrain terrain) {
        if(terrain == Terrain.ROAD) {
            return new Car();
        }
        else {
            return null;
        }
    }
}