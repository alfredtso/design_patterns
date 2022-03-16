package command;

public class LightSwtichSetup {
    public static void main(String[] args) {
        Light led = new Light();
        Command lightsOnCommand = LightsCommand.ofLight(led);
        LightSwitch lightSwitch = LightSwitch.ofCommand(lightsOnCommand);
        lightSwitch.flip();
        lightSwitch.flip();
    }
}
