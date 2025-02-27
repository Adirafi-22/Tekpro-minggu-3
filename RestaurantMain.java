import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Bakwan", 1000, 20);
        menu.tambahMenuMakanan("Cireng", 1000, 20);
        menu.tambahMenuMakanan("Tahu", 1000, 0);
        menu.tambahMenuMakanan("Molen", 1000, 20);

        menu.tampilMenuMakanan();

        while (true) {
            System.out.println("\n=== Pilihan ===");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Lihat Menu");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer newline

            if (pilihan == 1) {
                System.out.print("Masukkan nama makanan yang ingin dipesan: ");
                String namaMakanan = scanner.nextLine();

                System.out.print("Masukkan jumlah yang ingin dipesan: ");
                int jumlah = scanner.nextInt();

                menu.pesanMakanan(namaMakanan, jumlah);
            }
            else if (pilihan == 2) {
                menu.tampilMenuMakanan();
            }
            else if (pilihan == 3) {
                System.out.println("Terima kasih telah memesan di restoran kami!");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        }

        scanner.close();
    }
}
