public class Motorcycle extends Vehicle {
    private String motorcycleType;
    private double engineCapacity;

    public Motorcycle(String brand, String model, int year, double price, int maxSpeed, String motorcycleType, double engineCapacity){
        super(brand, model, year, price, maxSpeed);
        this.motorcycleType = motorcycleType;
        this.engineCapacity = engineCapacity;
    }
    public String getMotorcycleType(){
        return this.motorcycleType;
    }
    public double getEngineCapacity(){
        return this.engineCapacity;
    }
    public void  setMotorcycleType(String motorcycleType){
        this.motorcycleType = motorcycleType;
    }
    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity = engineCapacity;
    }
    public String toString() {
        return  "****************************\n"+
                "Motorcycle: \n"+
                "****************************\n"+
                "brand = " + super.getBrand() +'\n'+
                "model = " + super.getModel() +'\n'+
                "year = " + super.getYear() +'\n'+
                "price = "+ super.getPrice()+"$"+'\n'+
                "maxSpeed = "+ super.getMaxSpeed()+" km/h"+'\n'+
                "number of Doors = "+ motorcycleType +'\n'+
                "fuelType = "+ engineCapacity+" cc"+'\n'+
                "****************************\n";
    }

}


