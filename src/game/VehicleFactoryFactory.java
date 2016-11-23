package game;

import game.exceptions.GameModNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class VehicleFactoryFactory {
    static AbstractVehicleFactory createVehicleFactory() throws GameModNotFoundException {
        Properties modProperties = getProperties("mod");
        String mod = modProperties.getProperty("mod");

        String factory;

        if(mod.equals("none")){
            factory = "game";
        } else {
            factory = "mods." + mod;
        }

        factory += ".VehicleFactory";

        try {
            return (AbstractVehicleFactory) Class.forName(factory).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new GameModNotFoundException();
        }
    }



    private static Properties getProperties(String propertiesType){
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = Game.class.getResourceAsStream("properties/" + propertiesType + ".properties");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }
}
