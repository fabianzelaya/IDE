public class Main {
    public static void main(String[] args) {
        int year = 0;
        int targetBalance = 20000;
        double balance = 0;
        double interest = 0.05;
        double RATE;

        /**
         * Flowchart of a while Loop:
         * 
         * balance < targetBalance -> False ->
         * -> True -> Increment year -> Calculate interest -> Add interest to balance;
         * REPEATING PROCESS.
         * 
         * A loop executes instructions repeatedly while a condition is true.
         */

        while (balance < targetBalance) {
            year++; // repeat yearly
            double interest = balance * RATE / 100;
            balance = balance + interest;
        }

        System.out.println(balance);
    }
}