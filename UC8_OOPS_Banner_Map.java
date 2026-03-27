import java.util.HashMap;
import java.util.Map;

public class UC8_OOPS_Banner_Map {

    // Map to store patterns
    static Map<Character, String[]> map = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String text = "OOPS";
        printBanner(text);
    }

    // Initialize patterns
    public static void initializePatterns() {

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        });

        map.put('S', new String[]{
            " *****",
            "*     ",
            "*     ",
            " *****",
            "      *",
            "      *",
            " *****"
        });
    }

    // Function to print banner
    public static void printBanner(String text) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}