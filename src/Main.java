import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name , balance and password");
        String name=sc.nextLine();
        double balance=sc.nextDouble();
        String password=sc.next();

        SBIUser newUser=new SBIUser(name, balance, password);

        //add money
        System.out.println(newUser.addMoney(100000));

        //withdraw money
        System.out.println("enter amount you want to withdraw");
        int addamt=sc.nextInt();
        System.out.println("enter your password");
        String pass=sc.next();
        System.out.println(newUser.withdrawMoney(addamt,pass));

        //rate of interest
        System.out.println("you will get as interest after 10 years "+ newUser.calculateInterest(10));


    }

}