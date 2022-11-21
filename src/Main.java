import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int op,a,b;
        Scanner sn = new Scanner(System.in);

        while(true){
            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("Exit");

            System.out.println("Enter your Option:");
            op = sn.nextInt();

            switch (op) {
                case 1:
                    add obj1 = new add();
                    obj1.Show();
                    break;
                case 2:
                    sub obj2 = new sub();
                    obj2.Show();
                    break;
                case 3:
                    mul obj3 = new mul();
                    obj3.Show();
                    break;
                case 4:
                    System.out.println("div(a,b)");
                    break;
                case 5:
                    System.out.println("exit");
                    break;
            }
        }

    }
}
