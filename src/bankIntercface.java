public interface bankIntercface {
    double checkBalace();
    String addMoney(int amount);
    String withdrawMoney(int money,String password);
    double calculateInterest(int years);
}
