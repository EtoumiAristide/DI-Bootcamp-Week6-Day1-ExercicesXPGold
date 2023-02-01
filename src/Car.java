/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day1 ExerciceXP | Exercice 2: Constructor Chaining
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Car() {
        make = "Ford";
        model = "Focus";
        year = 2018;
        color = "Bleu";
        price = 3500000;
    }

    public Car(String make, String model, int year) {
        this();

        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, String color, double price) {
        this(make, model, year);
        this.color = color;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
    }
}
