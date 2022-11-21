import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int op,a,b;
        Scanner sn = new Scanner(System.in);

        while(true){
            System.out.println("------Menu-----");
            System.out.println("| 1.Add        |");
            System.out.println("| 2.Subtract   |");
            System.out.println("| 3.Multiply   |");
            System.out.println("| 4.Divide     |");
            System.out.println("| 5.Exit       |");
            System.out.println("|______________|");

            System.out.println("Enter your Option:");
            op = sn.nextInt();

            if(op==1){
                    add obj1 = new add();
                    obj1.Show();
                    }
            else if(op==2){
                    sub obj2 = new sub();
                    obj2.Show();
                    }
            else if(op==3){
                    mul obj3 = new mul();
                    obj3.Show();
                    }
            else if(op==4){
                    div obj4 = new div();
                    obj4.Show();}
            else if(op==5){
                    System.out.println("ok bei");
                    System.exit(0);}
            else {
                System.out.println("Invalid Input");
            }
            }
        }

    }
