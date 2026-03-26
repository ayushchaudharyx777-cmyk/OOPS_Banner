public class UC4_OOPS_Banner_Array {
    public static void main(String[] args) {

        String[] banner = {
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     *",
            "*     * *     * *     * *     *",
            "*     * *     * *****  * ***** ",
            "*     * *     * *      * *     ",
            "*     * *     * *      * *     ",
            " *****   *****   *      * ***** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}