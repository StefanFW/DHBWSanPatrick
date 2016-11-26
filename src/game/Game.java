package game;

import game.exceptions.GameModNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static AbstractVehicleFactory factory;
    
    public static void main(String[] args) throws GameModNotFoundException {
        System.out.println("\n\n               DHBW SanPatrick               \n");
        String output = String.format("|%045d|\n|        Terrain       |        Vehicle       |", 0).replace('0', '-');

        System.out.println(output);



        factory = VehicleFactoryFactory.createVehicleFactory();

        createVehicle(Terrain.ROAD);
        createVehicle(Terrain.OFFROAD);
        createVehicle(Terrain.WATER);
        createVehicle(Terrain.INDUSTRIAL);
        createVehicle(Terrain.SKY);
        createVehicle(Terrain.SPACE);
        createVehicle(Terrain.UNDERGROUND);
        createVehicle(Terrain.UNDERWATER);
        createVehicle(Terrain.TRANSDIMENSIONAL);



        output = String.format("|%045d|",0).replace('0', '-');
        System.out.println(output);
    }
    
    private static void createVehicle(Terrain terrain) throws GameModNotFoundException {
        Vehicle vehicle = factory.createVehicle(terrain);
        String vehicleName;
        if(vehicle == null) {
            vehicleName = "no vehicle available";
        } else{
            vehicleName = vehicle.getName();
        }

        String output = String.format("|%045d|\n| %-20s | %-20s |", 0, terrain.toString(), vehicleName).replace('0', '-');

        System.out.println(output);
    }
}
