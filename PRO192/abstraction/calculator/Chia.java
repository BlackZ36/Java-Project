package abstraction.calculator;

public class Chia extends calculator{

    @Override
    public void tinhtoan(int a, int b) {
        System.out.println("a / b = " + ( (float)a/(float)b ) );        
    }

}