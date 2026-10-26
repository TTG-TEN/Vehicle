public class Bicycle extends Vehicle{

    public Bicycle(String type) {
        super(type);
    }

@Override
    public void move() {
    System.out.println("Bicycle is pedaling");
}

}
