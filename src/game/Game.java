package game;

import game.exceptions.GameModNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static List<Vehicle> vehicleList = new ArrayList<>();
    
    
    public static void main(String[] args) throws GameModNotFoundException {
        AbstractVehicleFactory factory = VehicleFactoryFactory.createVehicleFactory();

        addToVehicleList(factory.createVehicle(Terrain.ROAD));
        addToVehicleList(factory.createVehicle(Terrain.OFFROAD));
        addToVehicleList(factory.createVehicle(Terrain.SKY));
        addToVehicleList(factory.createVehicle(Terrain.SPACE));
        addToVehicleList(factory.createVehicle(Terrain.TRANSDIMENSIONAL));

        for(Vehicle vehicle : vehicleList){
            
            System.out.println(vehicle.getClass());
        }
    }
    
    private static void addToVehicleList(Vehicle vehicle){
        if(vehicle == null) {
            return;
        }
        
        vehicleList.add(vehicle);
    }
}
