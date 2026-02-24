public class UC_4 {

    // Function to print banner using array + loop
    public static void printBanner() {
        // Store all banner lines in a single array
        String[] bannerLines = {
            String.join("   ", "  *****  ", "  *****  ", " ****** ", "  ***** "),
            String.join("   ", " **   ** ", " **   ** ", " **   **", " **     "),
            String.join("   ", "**     **", "**     **", " **   **", " **     "),
            String.join("   ", "**     **", "**     **", " ****** ", "  ****  "),
            String.join("   ", "**     **", "**     **", " **     ", "     ** "),
            String.join("   ", " **   ** ", " **   ** ", " **     ", " **   **"),
            String.join("   ", "  *****  ", "  *****  ", " **     ", "  ***** ")
        };

        // Loop through and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner();
    }
}
