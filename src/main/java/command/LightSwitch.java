package command;

public class LightSwitch {

    private Command lightCommand;

    private LightSwitch() {}

    public static LightSwitch ofCommand(Command command) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.setLightCommand(command);
        return lightSwitch;
    }

    public void flip() {
        this.lightCommand.execute();
    }

    private void setLightCommand(Command command) {
        this.lightCommand = command;
    }

}
