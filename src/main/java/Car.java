public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, String model, int year, double price, int maxSpeed, int numberOfDoors, String fuelType){
        super(brand, model, year, price, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public String toString() {
        return "****************************\n"+
                "Car: \n"+
                "****************************\n"+
                "brand = " + super.getBrand() +'\n'+
                "model = " + super.getModel() +'\n'+
                "year = " + super.getYear() +'\n'+
                "price = "+ super.getPrice()+"$"+'\n'+
                "maxSpeed = "+ super.getMaxSpeed()+" km/h"+'\n'+
                "number of Doors = "+ numberOfDoors +'\n'+
                "fuelType = "+ fuelType+'\n'+
                "****************************\n";
    }

}
