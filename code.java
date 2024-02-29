public class Main {
    public static void main(String[] args) {
        Person person = new Person("An", 20);
        Car car = new Car("Toyota", "Camry", 2020);

        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("Car: " + car.getMake() + ", Model: " + car.getModel() + ", Year: " + car.getYear());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}