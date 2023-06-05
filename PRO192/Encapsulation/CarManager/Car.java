package Encapsulation.CarManager;

class Car {
    // Khai bao cac bien
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;
    
    // ham tao khong co tham so
    public Car() {
        this("", 0, false, false);
    }
    
    // ham tao co tham so
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    
    // getters
    public String getColour() {
        return colour;
    }
    
    public int getEnginePower() {
        return enginePower;
    }
    
    public boolean getConvertible() {
        return convertible;
    }
    
    public boolean getParkingBrake() {
        return parkingBrake;
    }
    
    // setters
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    
    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    // other logic methods
    public void pressStartButton() {
        System.out.println("   - You have pressed the start button.");

    }
    
    public void pressAcceleratorButton() {
        System.out.println("   - You have pressed the Accelerator button.");
    }
    
    public void output() {
        System.out.println("");
        System.out.println("   - Colour: " + colour);
        System.out.println("   - Engine power: " + enginePower);
        System.out.println("   - Convertible: " + convertible);
        System.out.println("   - Parking brake: " + parkingBrake);
    }
}