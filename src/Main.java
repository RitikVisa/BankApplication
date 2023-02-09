import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter name : ");
       String name= sc.next();
        System.out.println("enter amount");
       int amount=sc.nextInt();
        System.out.println("enter password");
       String password= sc.next();

       SBIaccount ritik= new SBIaccount(name,amount,password);
        System.out.println("Your account number is : " + ritik.getAccNo());
        System.out.println("Your balance : " + ritik.getBalance());
        System.out.println("enter amount you want to deposit : ");
        int dep= sc.nextInt();
        System.out.println(ritik.deposit(dep));
        System.out.println("Your acc balance is : "+ritik.getBalance());
        System.out.println("Your account number is : " + ritik.getAccNo());
        System.out.println("enter amount you want to withdraw");

        int withdrawAmount = sc.nextInt();

        System.out.println("enter password");
        String enteredpasword=sc.next();

        System.out.println(ritik.withdraw(withdrawAmount,enteredpasword));
        System.out.println("your acc balance is : "+ ritik.getBalance());

        System.out.println("enter the years you want to calculate the return on interest");
        int years= sc.nextInt();


        System.out.println("interest on current balance " + ritik.getBalance() + " is " + ritik.calculateIntrest(years));



    }
}