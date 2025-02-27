import java.util.ArrayList;
import java.util.List;

abstract class Car {
    private String model;
    private String driver;
    private List<String> passengers;

    public Car(String model, String driver) {
        this.model = model;
        this.driver = driver;
        this.passengers = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null)
            this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        if (driver != null)
            this.driver = driver;
    }

    public List<String> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void setPassengers(List<String> passengers) {
        if (passengers != null)
            this.passengers = new ArrayList<>(passengers);
    }

    public void addPassenger(String passenger) {
        if (passengers.size() < 3) {
            passengers.add(passenger);
        } else {
            System.out.println("Capacitate maxima atinsa pentru " + model);
        }
    }

    public void addPassenger(String... newPassengers) {
        for (String passenger: newPassengers) {
            addPassenger(passenger);
        }
    }
    //sterge sus daca e

    public abstract void detalii();
}

class electric extends Car {
    private int battery;

    public electric(String model, String driver, int battery) {
        super(model, driver);
        this.battery = battery;
    }

    public void detalii() {
        System.out.println("Modelul este " + getModel() + " soferul este " + getDriver() + " bateria este " + battery + "%");
        System.out.println("Pasagerii sunt: " + getPassengers());
    }
}

class combustie extends Car {
    private int combustibil;

    public combustie(String model, String driver, int combustibil) {
        super(model, driver);
        this.combustibil = combustibil;
    }

    public void detalii() {
        System.out.println("Modelul este " + getModel() + " soferul este " + getDriver() + " combustibilul in L este: " + combustibil);
        System.out.println("Pasagerii sunt: " + getPassengers());
    }
}

public class lab1 {
    public static void main(String[] args) {
        electric eCar1 = new electric("Dacia", "Ionel", 34);
        electric eCar2 = new electric("Tesla", "Mihai", 98);

        combustie cCar1 = new combustie("BMW", "Cosmin", 11);
        combustie cCar2 = new combustie("Audi", "Bogdan", 12);

        eCar1.addPassenger("Ioan", "Mircea","Bogdanel","Cioci");

        eCar2.addPassenger("Ioana");
        eCar2.addPassenger("Mihaela");
        eCar2.addPassenger("Maria");
        eCar2.addPassenger("Andrei");

        cCar1.addPassenger("Gigel");
        cCar1.addPassenger("Adrian");

        cCar2.addPassenger("Petru");
        cCar2.addPassenger("Victor");

        eCar1.detalii();
        eCar2.detalii();
        cCar1.detalii();
        cCar2.detalii();
    }
}