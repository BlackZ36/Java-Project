package abstraction.calculator;
import java.util.*;

public class abstractionIndex{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------- Calculator ----------------------------------");
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        Cong cong = new Cong();
        Tru tru = new Tru();
        Nhan nhan = new Nhan();
        Chia chia = new Chia();
        
        cong.tinhtoan(a,b);
        tru.tinhtoan(a,b);
        nhan.tinhtoan(a,b);
        chia.tinhtoan(a,b);

        System.out.println("--------------------------------------------------------------------------------");
    }
}
