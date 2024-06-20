public class ForArray {
    public static void main(String[] args) {
        String[] houseMembers = {"Mari", "Maggie", "Kurt", "Red", "Guts", "Gui"};

        System.out.println("Moram na casa:");

        for (String houseMember : houseMembers) {
            System.out.println(houseMember);
        }

        for (int x = 0; x < houseMembers.length - 1; x++) {
            System.out.println(houseMembers[x] + " manda em " + houseMembers[x+1]);
        }
    }
}
