package z01_eng.exercise2;

public class LightsApp {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, Lights World!");
        Lamp myLamp = new Lamp();
        myLamp.switchOn(); // Turns on the lamp
        myLamp.brighten(); // Increases the lamp's intensity by 1
        myLamp.dim(); // Decreases the lamp's intensity by 1
        myLamp.replaceBulb(); // Replaces the bulb if the lamp is off
    }
}

