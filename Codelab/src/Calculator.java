import org.apache.commons.math3.special.Gamma;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    akarKuadrat(scanner);
                    break;
                case 2:
                    pangkat(scanner);
                    break;
                case 3:
                    logaritmaNatural(scanner);
                    break;
                case 4:
                    factorial(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("=== MENU KALKULATOR ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural (basis e)");
        System.out.println("4. Factorial");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void akarKuadrat(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.sqrt(angka);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + hasil);
    }

    private static void pangkat(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double pangkat = scanner.nextDouble();
        double hasil = Math.pow(angka, pangkat);
        System.out.println(angka + " ^ " + pangkat + " adalah " + hasil);
    }

    private static void logaritmaNatural(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
    }

    private static void factorial(Scanner scanner) {
        System.out.print("Masukkan angka untuk factorial: ");
        int angka = scanner.nextInt();
        double hasil = Gamma.gamma(angka + 1); // Menggunakan fungsi Gamma untuk factorial
        System.out.println("Factorial dari " + angka + " adalah " + hasil);
    }
}
