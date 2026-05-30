package programs.soliddesignprinciples.dependencyinversionprinciple.problem;

public class LedLight {
    public void turnOn() {
        System.out.println("On");
    }
}

class Switch {
    LedLight light = new LedLight();

    public void operate() {
        light.turnOn();
    }
}

/*
Switch is tightly coupled to LED light
 */
