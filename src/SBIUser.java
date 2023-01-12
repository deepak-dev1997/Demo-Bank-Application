import java.util.Objects;
import java.util.UUID;

public class SBIUser implements bankIntercface{
    private String name;
    private String account_No;
    private double balance;
    private String password;
    private static double roi;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.roi=6.5;

        this.account_No=String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_No() {
        return account_No;
    }

    public void setAccount_No(String account_No) {
        this.account_No = account_No;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRoi() {
        return roi;
    }

    public static void setRoi(double roi) {
        SBIUser.roi = roi;
    }

    @Override
    public double checkBalace() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "Updated balance is: "+balance;
    }

    @Override
    public String withdrawMoney(int money, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(money>balance){
                return "Insufficient balance";
            }
            else {
                balance=balance-money;
                return "Money withrawn   Updated balance is: "+balance;
            }
        }
        else {
            return "Wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*roi)/100;
    }
}
