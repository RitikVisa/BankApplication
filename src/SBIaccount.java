import java.security.SecureRandom;
import java.util.UUID;

public class SBIaccount implements bankInterface {

    private String name;
    private String accNo;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIaccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest= 9.0;
        this.accNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String deposit(int amount) {
        balance += amount;
        return "Paisa Hi paisa";
    }



    @Override
    public String withdraw(int amount,String enteredpassword) {
        if(enteredpassword.equals(this.password)){
         if(balance < amount){
             return "Insufficient balance";
         }else{
          this.balance-= amount;
             return "money deducted " + 500 + " remaining balance is : ";

         }
        }else{
            return "ye sab doglapan hai, password galat hai bhai";
        }

    }

    @Override
    public double calculateIntrest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
