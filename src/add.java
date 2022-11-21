import java.util.Scanner;

public class add {
    int a,b;
    public add(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sn.nextInt();
        System.out.println("Enter Second Number:");
        b = sn.nextInt();
    }
    public void Show(){
        System.out.println(a+b);
    }
}
