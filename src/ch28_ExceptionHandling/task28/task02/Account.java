package ch28_ExceptionHandling.task28.task02;

public class Account {
    int accountNumber;
   static double  balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
    }

    public  double paraEkle(double miktar){
       balance =  balance+miktar;
            return  balance;
    }

    public double paraCikar(double miktar){

        if(miktar>5000){
            System.out.println( "Günlük limiti aştınız");
        }
        balance=balance-miktar;
        return balance;
    }











}
