public class UC5 {
    public static void main(String[] args) {

        String[] lines = {
            String.join("", "  **O**  ", "   **O**   ", "  ****P*** ", "  **S**  "),
            String.join("", " *     * ", "  *     *  ", "  *      * ", " *     * "),
            String.join("", " *     * ", "  *     *  ", "  *      * ", " **      "),
            String.join("", " *     * ", "  *     *  ", "  * ****** ", "   **** "),
            String.join("", " *     * ", "  *     *  ", "  *        ", "      ** "),
            String.join("", " *     * ", "  *     *  ", "  *        ", " *     * "),
            String.join("", "  *****  ", "   *****   ", "  *        ", "  *****  ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
