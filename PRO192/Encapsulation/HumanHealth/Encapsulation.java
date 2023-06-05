package Encapsulation.HumanHealth;

public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        // using setters of Human
        h1.setHeight(1.65f);
        h1.setWeight(68);
        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in h");
    } 
}
