package Poly.Workshop5ex2;

abstract class Person1 {
    private String name;

    Person1() {
        this.name = "";
    }

    Person1(String n) {
        this.name = n;
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }

    public abstract double getSalary();
}

class Officer extends Person1 {
    private double bSalary;

    Officer() {
        super();
        this.bSalary = 0.0;
    }

    Officer(String n, double s) {
        super(n);
        this.bSalary = s;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + this.getSalary());
    }

    public double getSalary() {
        return this.bSalary;
    }
}

class Worker extends Person1 {
    private double hours;
    private final double RATE = 5.5;
    private double salary;

    Worker(String n, int hrs){
        super(n);
        this.hours = hrs;
    }
    public void display() {
        super.display();
        System.out.println("Hours: " + this.hours);
        System.out.println("Rate: " + this.RATE);
        System.out.println("Salary: " + this.getSalary());
    }
    public double getSalary() {
        this.salary = this.hours * this.RATE;
        return this.salary;
    }

}