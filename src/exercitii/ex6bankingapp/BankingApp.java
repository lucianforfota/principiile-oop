package exercitii.ex6bankingapp;

public  class BankingApp {


    //Creează o aplicație de gestionare a conturilor deschise la o bancă pentru un client.
    //Clasa abstractă BankAccount
    //Atribute:
    //
    //balance (câți bani se află în cont, o valoare de tip double care semnifică suma în lei)
    //accountNumber
    //Metode:
    //
    //Metoda abstractă withdraw()
    //Metoda abstractă deposit()
    //Clasa StudentAccount (extinde BankAccount)
    //Atribute:
    //
    //maxDepositAmount - va trebui să nu își schimbe valoarea o dată ce a fost inițializată
    //Metode:
    //
    //Metoda withdraw() - se pot retrage maxim câți bani sunt în cont în momentul retragerii
    //Metoda deposit() - se pot depune maxim “maxDepositAmount” bani o dată
    //Clasa SpendingAccount (extinde BankAccount)
    //Atribute:
    //
    //maxWithdrawalAmount - poate să își schimbe valoarea o dată ce a fost inițializată
    //Metode:
    //
    //Metoda withdraw() - se pot retrage cu maxim “maxWithdrawalAmount” RON mai mult decât există în cont în momentul retragerii (exemplu: dacă în cont sunt 5000 de RON, iar maxWithdrawalAmount este 2000 RON, se pot retrage maxim 7000 RON)
    //Metoda deposit() - oricâți bani se pot depune în cont
    //Clasa Client
    //Atribute:
    //
    //firstName
    //lastName
    //accountList - adică un array care ține lista de conturi ale unei persoane
    //Metode:
    //
    //Metoda addAccount() - va da posibilitatea persoanei să adauge un cont în lista de conturi
    //Metoda listAccounts() - va printa accountNumber împreună cu balance pentru fiecare cont din listă
    //Metoda deposit() - va adăuga o anumită sumă de bani într-un cont
    //Metoda withdraw() - va retrage o anumită sumă de bani dintr-un cont
    //Metoda checkAccountDetails() - va printa toate detaliile unui anumit cont
    //Clasa BankingApp
    //Clasa va avea doar metoda main(), unde se va instanția o persoană și se vor testa metodele pe care le poate face persoana (adăugare cont, deposit, etc.).



    public static void main(String[] args) {
        //instantiez persoane ca sa testez functionalitatile

       /*StudentAccount sa = new StudentAccount("ROBTRL2324",300);
       StudentAccount s2 = new StudentAccount("ROBTRL2324",500);
       StudentAccount s2 = new SpendingAccount("ROBTRL2324",500);
       sa.deposit(700);

       sa.withdraw(400);

       s2.deposit(400);*/

        Client client = new Client("Ionut", "Ionut");
        try {
            client.deposit(20, "ROBTRL435345");
        }catch (OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }

    }
}
