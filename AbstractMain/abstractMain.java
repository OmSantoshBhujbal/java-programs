package AbstractMain;

    abstract class ATM{
         abstract void Withdrawal(int amount); 
         abstract void Deposit(int amt);
         void CheckBalance()
         {
            System.out.println("Balance is null");
         }
    }

    class AtmImplementation extends ATM{
        int width;
        int dep;
        @Override
        void Withdrawal(int amount)
        {
            System.out.println("You Withdrawed "+amount);
            width = amount;
        }
        @Override
        void Deposit(int amt){
            System.out.println("You Deposited "+amt);
            dep = amt;

        } 
        @Override
        void CheckBalance() {
            int totalBal = dep-width;
            System.out.println("Your Balance is"+totalBal);
        }
    }
    public class abstractMain{
        public static void main(String[] args) {
            AtmImplementation atmImplementation = new AtmImplementation();
            atmImplementation.Deposit(40000);
            atmImplementation.Withdrawal(20000);
            atmImplementation.CheckBalance();
        }


    }

