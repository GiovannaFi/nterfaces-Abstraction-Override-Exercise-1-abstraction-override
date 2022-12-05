public class Car extends Vehicle{
    @Override
    public void doVehicleSound() {
        System.out.println(getType() + "'s sound: bruum");
    }
    private int numberOfDoors;
    private int carPrice;

    public Car(int wheels, int doors, int price, String type){
        setNumberOfWheels(wheels);
        setType(type);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("This car costs: " + carPrice + "$, number of doors: " + numberOfDoors + ", number of wheels: " + getNumberOfWheels());
    }

}
