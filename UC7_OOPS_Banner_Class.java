import java.util.HashMap;

public class UC7_OOPS_Banner_Class {

    // Inner class (Character Pattern Storage)
    static class CharacterPattern {
        static HashMap<Character, String[]> map = new HashMap<>();

        static {
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

        static String[] get(char ch) {
            return map.get(ch);
        }
    }

    public static void main(String[] args) {

        String text = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char ch : text.toCharArray()) {
                String[] pattern = CharacterPattern.get(ch);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}