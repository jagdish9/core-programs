package programs.soliddesignprinciples.dependencyinversionprinciple.solution;

public interface Switchable {
    void turnOn();
}

class LedLight implements Switchable {
    public void turnOn() {
    }
}

class CFL implements Switchable {
    public void turnOn() {
    }
}

class Switch {
    Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }
}