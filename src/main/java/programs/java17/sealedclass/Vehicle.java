package programs.java17.sealedclass;

public sealed class Vehicle permits Car, Bike {
}

final class Car extends Vehicle {

}

final class Bike extends Vehicle {

}

class Truck {

}

/*
Why it matters
You control who can extend your class
Useful in domain modeling (e.g., Payment types)

Think: safer alternative to open inheritance
 */