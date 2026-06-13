public class BankAccount {
    private int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    public  void deposite(int ammount){
        int balance =  ammount ;
        System.out.println("Deposite balance:"+ ammount);
    }
    public void withDraw(int ammount){
        if(ammount <= balance){
        balance =  balance - ammount;
    System.out.println("WithDraw balance:"+ ammount);
    }else{
        System.out.println("Insufficient balance");
    }
}
public void getBalance(){
    System.out.println( "current balance:"+ balance);
}
public static void main(String[] args) {
    BankAccount account = new BankAccount(1000);
    account.deposite(500);
    account.withDraw(200);
    account.getBalance();

}
}
