import java.util.ArrayList;

void main() {

Vehicle myCar = new Car("Model S");
myCar.move();
    ((Car) myCar).printMaxSpeed();
myCar.Display();
    System.out.println();
Car car = new Car("Swift");
car.move(80);
    System.out.println("===================");
Vehicle myBicycle = new Bicycle("Tornado 4000");
myBicycle.move();
    System.out.println();

Appliance appliance1 = new WashingMachine();
Appliance appliance2 = new Refridgerator();
appliance1.turnOn();
appliance2.turnOn();
    System.out.println();

Device myDevice = new Smartphone();
myDevice.start();

if (myDevice instanceof Smartphone) {
    Smartphone myPhone = (Smartphone) myDevice;
    myPhone.browseInternet();
}
    System.out.println();
ArrayList<Instrument> instruments = new ArrayList<>();
instruments.add(new Guitar());
instruments.add(new Piano());

for (Instrument instrument : instruments) {
    instrument.play();
}

}

