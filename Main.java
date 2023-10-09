import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome To Car Rental System.");
        CarRentalSystem carRentalSystem=new CarRentalSystem();
        Car car1 = new Car("c01",Color.Red,"Civic","Honda",100,true);
        Car car2 = new Car("c02", Color.Blue,"Camry","Toyota",120,true);
        Car car3 = new Car("c03",Color.Black,"Benz","Mercedes",200,true);
        Car car4 = new Car("c04",Color.White,"e tron gt","Audi",250,true);
        Car car5 = new Car("c05",Color.Grey,"Allroad","Audi",300,true);
        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);
        carRentalSystem.addCar(car4);
        carRentalSystem.addCar(car5);

        carRentalSystem.menu();

    }
}
