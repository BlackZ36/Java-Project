package Poly.Workshop5ex2;

abstract class Person {
    private String name;

    Person(){
        this.name = "";
    }
    public Person(String n){
        this.name = n;
    }
    public void display(){
        System.out.println("Name: " + this.name);
    }
    public abstract double getSalary();

}

class Officer extends Person{
    private double Salary;

    Officer(){
        super();
        this.Salary = 0.0;
    }
    Officer(String n, double Salary){
        super(n);
        this.Salary = Salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: " + getSalary());
    }
    
    public double getSalary(){
        return getSalary();
    }
}

class Worker extends Person{
    private double hrs;
    private final double RATE = 5.5;
    private double salary;
    Worker(String n, int hrs){
        super(n);
        this.hrs = hrs;
    }
}
