package Encapsulation.CarShopManager;

class CarDetail {
    private String name;
    private String model;
    private String manufacturer;
    private int optionsAvailable;
    private int enginePower;
    private int price;

    public CarDetail(){
        this("","","",0,0,0);
    }

    public CarDetail(String name, String model, String manufacturer, int optionsAvailable, int enginePower, int price) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.optionsAvailable = optionsAvailable;
        this.enginePower = enginePower;
        this.price = price;
    }

    //getter
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getOptionsAvailable(){
        return optionsAvailable;
    }

    public int getEnginePower(){
        return enginePower;
    }

    public int getPrice(){
        return price;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setOptionsAvailable(int optionsAvailable){
        this.optionsAvailable = optionsAvailable;
    }

    public void setEnginePower(int enginePower){
        this.enginePower = enginePower;
    }

    public void setPrice(int price){
        this.price = price;
    }

    //other methods
    public void Show(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Number of option that available: " + optionsAvailable);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------------------------------");
    }

    

}
