package game;

import game.exceptions.GameModNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static AbstractVehicleFactory factory;
    
    public static void main(String[] args) throws GameModNotFoundException {
        factory = VehicleFactoryFactory.createVehicleFactory();

        createVehicle(Terrain.ROAD);
        createVehicle(Terrain.OFFROAD);
        createVehicle(Terrain.SKY);
        createVehicle(Terrain.SPACE);
        createVehicle(Terrain.TRANSDIMENSIONAL);
    }
    
    private static void createVehicle(Terrain terrain) throws GameModNotFoundException {
        Vehicle vehicle = factory.createVehicle(terrain);
        if(vehicle == null) {
            System.out.println("For the terrain " + terrain.toString() + " is no vehicle available");
        } else{
            System.out.println("Vehicle " + vehicle.getName() + " was created in terrain " + terrain.toString());
        }
    }
}
