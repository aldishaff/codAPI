import java.util.Scanner;
import java.lang.Math;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Kalkulator ===");
            System.out.println("Pilih operasi:");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma Natural (basis e)");
            System.out.println("4. Factorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih Operasi (1/2/3/4/5) : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    akarKuadrat();
                    break;
                case 2:
                    pangkat();
                    break;
                case 3:
                    logaritmaNatural();
                    break;
                case 4:
                    factorial();
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

    private static void akarKuadrat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = sc.nextDouble();
        double hasil = Math.sqrt(angka);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + hasil);
    }

    private static void pangkat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = sc.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double pangkat = sc.nextDouble();
        double hasil = Math.pow(angka, pangkat);
        System.out.println(angka + " ^ " + pangkat + " adalah " + hasil);
    }

    private static void logaritmaNatural() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = sc.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
    }

    private static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka untuk factorial: ");
        int angka = sc.nextInt();
        long hasil = 1;

        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.println("Factorial dari " + angka + " adalah " + hasil);
    }
}
