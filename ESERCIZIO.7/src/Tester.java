public class Tester {
    public static void main(String[] args) {
        Car car1 = new Car(4, 4, 30000, "Car");
        Boat boat1 = new Boat(32.5, 70, "Boat");

        car1.showVehicleDetails();
        car1.doVehicleSound();

        System.out.println("------------------------");

        boat1.showVehicleDetails();
        System.out.println(boat1.getBoatWeightAndSpeed());
        boat1.doVehicleSound();

        ;
    }
}
