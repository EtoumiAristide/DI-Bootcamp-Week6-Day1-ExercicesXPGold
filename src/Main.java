public class Main {
    public static void main(String[] args) {
        //Exercice 1: Circle Constructor
        Circle circle1 = new Circle();
        circle1.setRadius(2.0);
        System.out.println("Radius of cicle 1: " + circle1.getRadius());
        System.out.println("Area of cicle 1: " + circle1.getArea());

        Circle circle2 = new Circle();
        circle1.setRadius(12);
        System.out.println("Radius of cicle 2: " + circle2.getRadius());
        System.out.println("Area of cicle 2: " + circle2.getArea());

        Circle circle3 = new Circle();
        circle1.setRadius(24);
        System.out.println("Radius of cicle 3: " + circle3.getRadius());
        System.out.println("Area of cicle 3: " + circle3.getArea());

        //Exercice 2: Constructor Chaining
        Car fordFocus = new Car();
        fordFocus.displayCarInfo();

        Car toyotaCorrola = new Car("Toyota", "Corrola", 2015);
        toyotaCorrola.displayCarInfo();

        Car suzikiVitara = new Car("Suziki", "Vitara", 2020, "Rouge", 17800000);
        suzikiVitara.displayCarInfo();

        //Exercice 3: Constructor Overloading
        Student student1 = new Student();
        student1.displayStudentInfo();

        Student student2 = new Student("Kacou Philippe", 26);
        student2.displayStudentInfo();

        Student student3 = new Student("Kanga Jocelin", 26, "Fullstack Angular/PHP", 'A');
        student3.displayStudentInfo();
    }
}