package game.exceptions;

public class GameModNotFoundException extends Exception {
    private static final String message = "The GameMod set in the mod.properties file is not a valid GameMod";
    public GameModNotFoundException() {
        super(message);
    }
}
