public class UC6_OOPS_Banner_Static {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }

    // O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // P
    public static String[] getP() {
        return new String[]{
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        };
    }

    // S
    public static String[] getS() {
        return new String[]{
            " *****",
            "*     ",
            "*     ",
            " *****",
            "      *",
            "      *",
            " *****"
        };
    }
}
