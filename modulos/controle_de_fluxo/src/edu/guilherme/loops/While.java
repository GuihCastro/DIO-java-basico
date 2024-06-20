import java.util.concurrent.ThreadLocalRandom;;

public class While {
    public static void main(String[] args) {
        double funds = 50;
        System.out.println("Você tem " + funds + " dinheiros.");
        while (funds > 0) {
            Double itemValue = randomValue();
            if (itemValue > funds) itemValue = funds;
            System.out.println("Item no valor de " + itemValue + " adicionado ao carrinho");
            funds = funds - itemValue;
            System.out.println("Sobraram " + funds + " dinheiros.");
        }
        System.out.println("Você gastou todo o seu dinheiro!");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(5, 30);
    }
}
