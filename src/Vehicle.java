public class Vehicle {
protected int maxSpeed = 100;
String type;

public Vehicle(String type) {
    this.type = type;
    System.out.println("Vehicle type " + type);

}
public void move() {
    System.out.println("Vehicle is moving");
}

public final void Display() {
    System.out.println("Vehicle display method");

}

public void move(int speed) {
    System.out.println("Vehicle is moving at " + speed + " km/h");

}

}



