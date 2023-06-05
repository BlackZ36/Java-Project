package Poly.Workshop5ex1;

class PhoneNumber {
    int area;
    String number;

    PhoneNumber() {
    }

    PhoneNumber(int a, String n) {
        this.area = a;
        this.number = n;
    }

    void display() {
        System.out.println( this.area + " - " + this.number);
    }
}

class IntPhoneNumber extends PhoneNumber {
    String countryCode;

    IntPhoneNumber() {
    }

    IntPhoneNumber(String cc, int a, String n) {
        super(a, n);
        this.countryCode = cc;
    }

    void display() {
        System.out.println(this.countryCode + " - " + this.area + " - " + this.number);
    }
}