import java.util.Scanner;

   class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("jaka choinka ma miec wysokosc: ");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i - 1; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < 2 * i + 1; a++) {
                System.out.print("%");
            }
            System.out.println();
        }
    }
}