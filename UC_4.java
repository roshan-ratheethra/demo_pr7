public class UC3 {
    public static void main(String[] args) {
        // Each line of the banner as arrays of segments
        String[] line1 = {"OOOO", "OOOO", "PPPPP", "SSSS"};
        String[] line2 = {"O  O", "O  O", "P   P", "S   "};
        String[] line3 = {"O  O", "O  O", "PPPPP", "SSSS"};
        String[] line4 = {"O  O", "O  O", "P   ", "    S"};
        String[] line5 = {"OOOO", "OOOO", "P   ", " SSSS"};

        // Join with spaces to form each line
        System.out.println(String.join("   ", line1));
        System.out.println(String.join("   ", line2));
        System.out.println(String.join("   ", line3));
        System.out.println(String.join("   ", line4));
        System.out.println(String.join("   ", line5));
    }
}
