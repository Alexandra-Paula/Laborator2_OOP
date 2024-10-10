public class Vehicle {
    private String brand;
    private String model;
    private int year;// in kg;
    private double price;// in Eur;
    private int maxSpeed;

    public Vehicle(String brand, String model, int year, double price, int maxSpeed){
        this.brand = brand;
        this.model= model;
        this.year = year;
        this.price = price;
        this.maxSpeed= maxSpeed;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public double getPrice(){
        return this.price;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public void  setYear(int Year){
        this.year = year;
    }
    public void  setPrice(Double price){
        this.price = price;
    }
    public void  setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}

