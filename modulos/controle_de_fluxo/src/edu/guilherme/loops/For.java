public class For {
    public static void main(String[] args) {
        for (int sheeps = 1; sheeps <= 20; sheeps++) {
            String message = sheeps == 1 ? " sheep" : " sheeps";
            System.out.println(sheeps + message);
        }

        System.out.println("Finally fell asleep...");
    }
}
