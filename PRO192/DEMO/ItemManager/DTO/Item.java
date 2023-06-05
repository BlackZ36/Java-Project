package DTO;

import java.util.*;

public class Item {
    private int value;
    private String creator;
    Scanner sc = new Scanner(System.in);

    Item() {
    }

    Item(int v, String c) {
        this.value = v;
        this.creator = c;
    }

    // getter
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    // setter
    public void setValue(int v) {
        this.value = v;
    }

    public void setCreator(String c) {
        this.creator = c;
    }

    // other logic methods
    public void input() {
        System.out.print("Enter Value For Item: ");
        int v = sc.nextInt();
        while (v < 0) {
            System.out.print("Entered Value < 0. Please Try Again: ");
            v = sc.nextInt();
        }
        setValue(v);
        sc.nextLine();
        System.out.print("Enter Creator For The Item: ");
        String c = sc.nextLine();
        while (c.isEmpty()) {
            System.out.print("Please Re-Enter Valid Creator: ");
            sc.nextLine();
            c = sc.nextLine();
        }
        setCreator(c);
    }

    public void output() {
        System.out.println("Item Value: " + this.value);
        System.out.println("Item Creator: " + this.creator);
    }
}
