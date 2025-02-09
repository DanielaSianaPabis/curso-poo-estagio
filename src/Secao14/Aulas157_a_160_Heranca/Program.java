package Secao14.Aulas157_a_160_Heranca;

public class Program {

    public static void main(String[] args) {
    /* Aula 157:
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);


        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount) {
            SavingAccount acc5  = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    */

    /*Aula 158:
        Account acc1 = new Account(1001, "Jose", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);

        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    */

    //Aula 160:
        Account x = new Account(1020, "Andres", 1000.0);
        Account y = new SavingAccount(1023, "Julia", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
    
}
