package DTO;
import java.util.*;

public class Statue extends Item{
    private int height;
    private String material;
    Scanner sc = new Scanner(System.in);

    public Statue(){

    }
    Statue(int v,String c,int h,String m){
        super(v,c);
        this.height = h;
        this.material = m;
    }
    //getter
    public int getHeight(){
        return height;
    }
    public String getMaterial(){
        return material;
    }
    //setter
    public void setHeight(int h){
        this.height = h;
    }
    public void setMaterial(String m){
        this.material = m;
    }
    //other logic methods
    public void inputStatue(){
        super.input();
        try{
            System.out.print("Enter The Height For The Statue (>0): ");
            int h = sc.nextInt();
            if( h <= 0){
                throw new Exception();
            }
            setHeight(h);
            sc.nextLine();
            System.out.print("Enter The Material For The Statue: ");
            String m = sc.nextLine();
            if( m.isEmpty() ){
                throw new Exception();
            }
            setMaterial(m);
        } catch (Exception e) {
            System.out.println("Invalid Entered. Please Try Again");
        }
    }
    public void outputStatue(){
        System.out.println("Height: " + getHeight());
        System.out.println("Material: " + getMaterial());
    }
}

