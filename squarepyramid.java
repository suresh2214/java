public class SquarePyramid {
    public static void main(String[] args) {
        int levels = 5; 

        for (int i = 1; i <= levels; i++) {
            // Print spaces
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }

                   for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
