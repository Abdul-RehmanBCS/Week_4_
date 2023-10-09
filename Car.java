import java.util.ArrayList;
import java.util.List;

public class Car {
    private String Id;
    private String model;
    private String brand;
    private double basePricePerDay;
    private boolean isAvailable;
    private Color color;
    public Car(String Id,Color color,String model,String brand,double basePricePerDay,boolean isAvailable){
        this.Id=Id;
        this.color=color;
        this.model=model;
        this.brand=brand;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=isAvailable;
    }
    public String getId(){
        return Id;
    }
    public String getModel(){
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public double calcPrice(int rentalDays){
        return basePricePerDay*rentalDays;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rentCar(){
        isAvailable=false;
    }
    public void returnCar() {
        isAvailable=true;
    }
    public Color getColor(){
        return color;
    }
}
