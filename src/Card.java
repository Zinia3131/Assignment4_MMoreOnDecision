import java.util.HashMap;
import java.util.Map;

public class Card {
    private String notation;
    private static final Map<String, String> VALUE_MAP = new HashMap<>();
    private static final Map<String, String> SUIT_MAP = new HashMap<>();

    static {
        VALUE_MAP.put("A", "Ace");
        VALUE_MAP.put("2", "2");
        VALUE_MAP.put("3", "3");
        VALUE_MAP.put("4", "4");
        VALUE_MAP.put("5", "5");
        VALUE_MAP.put("6", "6");
        VALUE_MAP.put("7", "7");
        VALUE_MAP.put("8", "8");
        VALUE_MAP.put("9", "9");
        VALUE_MAP.put("10", "10");
        VALUE_MAP.put("J", "Jack");
        VALUE_MAP.put("Q", "Queen");
        VALUE_MAP.put("K", "King");

        SUIT_MAP.put("D", "Diamonds");
        SUIT_MAP.put("H", "Hearts");
        SUIT_MAP.put("S", "Spades");
        SUIT_MAP.put("C", "Clubs");
    }

    // Constructor
    public Card(String notation) {
        this.notation = notation.toUpperCase();
    }


    public String getDescription() {

        if (notation.length() < 2) {
            return "Unknown";
        }

        String valuePart = notation.substring(0, notation.length() - 1); // Everything except the last character
        String suitPart = notation.substring(notation.length() - 1); // Last character

        String value = VALUE_MAP.get(valuePart);
        String suit = SUIT_MAP.get(suitPart);

        if (value == null || suit == null) {
            return "Unknown";
        }

        return value + " of " + suit;
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String input = scanner.nextLine();

        Card card = new Card(input);
        System.out.println(card.getDescription());
    }
}

