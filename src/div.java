import java.util.Scanner;

public class div {
    int a,b;
    public div(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sn.nextInt();
        System.out.println("Enter Second Number:");
        b = sn.nextInt();
    }

    public void Show(){
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
