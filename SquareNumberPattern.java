public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = scanner.nextInt();
   for (int i = 1; i <= n; i++) {       
            for (int j = 1; j <= n; j++) { 
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
