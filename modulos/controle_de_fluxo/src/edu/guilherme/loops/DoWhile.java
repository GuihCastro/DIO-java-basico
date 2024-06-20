import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        } while(ringing());

        System.out.println("Alô!");
    }

    private static boolean ringing() {
        boolean answered = new Random().nextInt(3) == 1;
        System.out.println(answered ? "Atendeu!" : "esperando...");
        return ! answered;
    }
}
