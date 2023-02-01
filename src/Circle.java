/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day1 ExerciceXP | Exercice 1: Circle Constructor
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
