import java.util.Scanner;

public class TextAnalyzer {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");

            System.out.print("Pilihan Anda : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    masukkanTeks(scanner);
                    break;
                case 2:
                    hitungJumlahKarakter();
                    break;
                case 3:
                    hitungJumlahKata();
                    break;
                case 4:
                    cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        scanner.nextLine(); // Membersihkan buffer sebelumnya
        teks = scanner.nextLine();
        System.out.println("Teks berhasil dimasukkan.");
    }

    private static void hitungJumlahKarakter() {
        int jumlahKarakter = teks.length();
        System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
    }

    private static void hitungJumlahKata() {
        if (teks.isEmpty()) {
            System.out.println("Teks masih kosong. Masukkan teks terlebih dahulu.");
        } else {
            String[] kataArray = teks.split("\\s+");
            int jumlahKata = kataArray.length;
            System.out.println("Jumlah kata dalam teks: " + jumlahKata);
        }
    }

    private static void cariKata(Scanner scanner) {
        if (teks.isEmpty()) {
            System.out.println("Teks masih kosong. Masukkan teks terlebih dahulu.");
        } else {
            System.out.print("Masukkan kata yang dicari: ");
            String kataCari = scanner.next();
            int jumlahKemunculan = 0;

            String[] kataArray = teks.split("\\s+");
            for (String kata : kataArray) {
                if (kata.equalsIgnoreCase(kataCari)) {
                    jumlahKemunculan++;
                }
            }
            System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + jumlahKemunculan + " kali dalam teks.");
        }
    }
}
