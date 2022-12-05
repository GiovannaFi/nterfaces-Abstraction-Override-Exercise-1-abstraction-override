public class Boat extends Vehicle{
    @Override
    public void doVehicleSound() {
        System.out.println(getType() + "'s sound: shuuush");

    }

    private double maxKnotsSpeed;
    private int boatKilosWeight;



    public Boat(double maxSpeed, int weight, String type){
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
        setType(type);
    }
    public String getBoatWeightAndSpeed(){
        return "Boat's max speed: " + maxKnotsSpeed + ", weight: " + boatKilosWeight + "kg.";
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
    }
}
