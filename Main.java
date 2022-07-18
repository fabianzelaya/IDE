public class Main {
    public static void main(String[] args) {
        int x = 0;
        int previous;
        do {
            previous = x;
            x = in.nextInt();
            sum = sum + x;
        } while (x != 0 && previous != x);
    }
}