package Encapsulation.GuitarShop;

class Guitar {
    private String serialNumber;
    private int price;
    private String Builder;
    private String model;
    private String backWood;
    private String topWood;

    //ham tao khong tham so
    public Guitar(){
        this(null,0,null,null,null,null);
    }
    //ham tao co tham so
    public Guitar(String serialNumber,int price,String Builder,String model,String backWood,String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.Builder = Builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    //getter
    public String getSerialNumber(){
        return serialNumber;
    }

    public int getPrice(){
        return price;
    }
    
    public String getBuilder(){
        return Builder;
    }

    public String getModel(){
        return model;
    }

    public String getTopWoord(){
        return topWood;
    }

    public String getBackWood(){
        return backWood;
    }
    //setter
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setBuilder(String Builder){
        this.Builder = Builder;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setTopWood(String topWood){
        this.topWood = topWood;
    }
    public void setBackWood(String backWood){
        this.backWood = backWood;
    }

    //other method: creating sound
    public void createSound(){
        System.out.println("serialNumber:" + serialNumber);
        System.out.println("price:" + price);
        System.out.println("Builder:" + Builder);
        System.out.println("model:" + model);
        System.out.println("topWood" + topWood);
        System.out.println("backWood:" + backWood);
    }

}
