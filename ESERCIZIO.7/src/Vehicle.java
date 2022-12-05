public abstract class Vehicle {

    private String type;
    private int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Veichle type: " + type + "\nnumber of wheels: " + numberOfWheels);

    }

    public abstract void doVehicleSound();

    public String getType(){
        return type;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    public void setType (String type){
        this.type = type;
    }

}

