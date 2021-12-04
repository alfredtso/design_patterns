package command;

public class Light {

    private boolean state;
    public Light() {}

    public void turnOnOff() {
        if (state) {
            System.out.println("Light's on !");
        } else {
            System.out.println("Light's off !");
        }

        state = !state;
    }
}
