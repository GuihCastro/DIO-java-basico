public class BreakAndContinue {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number ++) {
            if (number == 3) break;
            System.out.println(number);
        }

        for (int number = 1; number <= 5; number ++) {
            if (number == 3) continue;
            System.out.println(number);
        }

        for (int number = 1; number <= 10; number ++) {
            boolean evenNumber = number % 2 == 0;
            if (!evenNumber) continue;
            System.out.println(number);
        }
    }
}
