import java.util.Scanner;

public class sub {
        int a,b;
        public sub(){
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter First Number:");
            a = sn.nextInt();
            System.out.println("Enter Second Number:");
            b = sn.nextInt();
        }
        public void Show(){
            System.out.println(a-b);
        }
    }

