public class Car extends Vehicle {

    public Car(String type) {
    super(type);
        System.out.println("Car constructor is working");
}

@Override
    public void move() {
    System.out.println("Car is moving");
}

@Override
    public void move(int speed) {
    System.out.println("Car is drving at " + speed + " km/h");
}
public void printMaxSpeed() {
    System.out.println("Max Speed of car: " + maxSpeed);
}

}
