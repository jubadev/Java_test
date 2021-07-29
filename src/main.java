import account.account;

public class main {
     public static void main(String[] args) {
         float som = 500;
         String nom = "juba";
         account juba = new account(nom,som);
         juba.deposit(200);
         juba.withdrawal(50);
         juba.printAccount();
         juba.printHistory();


    }
}
