public class SavingsAccount {
    //define o saldo
    int balance;
    
    //define o construtor
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    //método para verificar o saldo
    public void checkBalance(){
      System.out.println("Hello!");
      System.out.println("Your balance is "+balance);
    }
    
    //método para depositar valores
    public void deposit(int amountToDeposit){
      balance = amountToDeposit + balance;
      System.out.println("You just deposited " + amountToDeposit);
    }
    
    //métodos para retiradas
    public int withdraw(int amountToWithdraw){
      balance = balance - amountToWithdraw;
      System.out.println("You just withdrew " + amountToWithdraw);
      return amountToWithdraw;
    }
    
    public String toString(){
      return "This is a savings account with " + balance + " saved.";
    }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      savings.checkBalance();
      
      //Withdrawing:
      savings.withdraw(300);
      
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
      
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
      
      //Check balance:
      savings.checkBalance();
      
      System.out.println(savings);
    }       
  }
  