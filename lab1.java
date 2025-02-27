import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Car {
    protected String model;
    protected String driver;
    protected List<String> passengers;

    public Car(String model, String driver) {
        this.model = model;
        this.driver = driver;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(String passenger) {
        if (passengers.size() < 3) {
            passengers.add(passenger);
        } else {
            System.out.println("Capacitate maxima atinsa pentru " + model);
        }
    }
    public abstract void detalii();
}
class electric extends Car {
    public electric(String model, String driver) {
        super(model, driver);
    }
    public void detalii() {
        System.out.println("Modelul este " + model + " soferul este " + driver);
        System.out.println("Pasagerii sunt:" + passengers);
    }
}
class combustie extends Car {
    public combustie(String model, String driver) {
        super(model, driver);
    }
    public void detalii() {
        System.out.println("Modelul este " + model + " soferul este " + driver);
        System.out.println("Pasagerii sunt:" + passengers);
    }
}
public class lab1 {
    public static void main(String[] args) {
    electric eCar1 = new electric("Dacia", "Ionel");
    electric eCar2 = new electric("Tesla", "Mihai");

    combustie cCar1 = new combustie("BMW", "Cosmin");

        }
    }
