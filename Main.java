public class Main {
    public static void main(String[] args) {
        final int PERIODS = 5;
        for (int i = 1; i <= PERIODS; i++) {
            invest.waitYears(YEARS);
            System.out.printf(
                    "The balance after %d years is %3.2f\n",
                    invest.getYears(), invest.getBalance());
        }
    }
}