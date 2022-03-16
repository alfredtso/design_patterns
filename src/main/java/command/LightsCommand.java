package command;

public class LightsCommand implements Command {

    private Light light;

    public static LightsCommand ofLight(Light light) {
        LightsCommand lightsCommand = new LightsCommand();
        lightsCommand.light = light;
        return lightsCommand;
    }

    @Override
    public void execute() {
        light.turnOnOff();
    }

    @Override
    public void undo() {

    }

}
