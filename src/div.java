import java.util.Scanner;

public class div {
    float a,b;
    public div(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sn.nextFloat();
        System.out.println("Enter Second Number:");
        b = sn.nextFloat();
    }
    public void Show(){
        System.out.println(a/b);
    }
}
