package programs.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("car");
        Car car = new Car("kar");
        //Car car1 = new Vehicle("kaar"); //compilation error
    }
}
