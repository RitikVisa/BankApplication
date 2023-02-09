public interface bankInterface {

    int getBalance();
    String deposit(int amount);
    String withdraw(int amount,String password);
    double calculateIntrest(int time);

}
