import java.util.Scanner;

public class BioskopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar film
        Film[] daftarFilm = {
                new Film("Secret: Untold Melody", "Drama/Romance", 120, 50000),
                new Film("A Business Proposal", "Komedi/Romance", 110, 55000),
                new Film("Petaka Gunung Gede", "Horror/Thriller", 100, 60000),
                new Film("Coto vs Konro", "Komedi", 95, 45000),
                new Film("Nosferatu", "Horror", 130, 65000)
        };

        // Menampilkan daftar film
        System.out.println("=== Daftar Film yang Tersedia ===");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i].getJudul() +
                    " (" + daftarFilm[i].getGenre() + ") - " +
                    daftarFilm[i].getDurasi() + " menit - Rp " + daftarFilm[i].getHarga());
        }

        // Memilih film
        System.out.print("\nPilih film yang ingin Anda tonton (1-" + daftarFilm.length + "): ");
        int pilihanFilm = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (pilihanFilm < 1 || pilihanFilm > daftarFilm.length) {
            System.out.println("Pilihan tidak valid. Program berakhir.");
            return;
        }

        Film filmTerpilih = daftarFilm[pilihanFilm - 1];

        // Memasukkan data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan email pelanggan: ");
        String emailPelanggan = scanner.nextLine();

        System.out.print("Masukkan nomor telepon pelanggan: ");
        String nomorTeleponPelanggan = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, emailPelanggan, nomorTeleponPelanggan);

        // Menampilkan pilihan jadwal tayang
        String[] jadwalTayangOptions = {"12:00", "15:00", "18:00", "21:00"};
        System.out.println("\n=== Jadwal Tayang yang Tersedia ===");
        for (int i = 0; i < jadwalTayangOptions.length; i++) {
            System.out.println((i + 1) + ". " + jadwalTayangOptions[i]);
        }

        // Memilih jadwal tayang
        System.out.print("Pilih jadwal tayang (1-" + jadwalTayangOptions.length + "): ");
        int pilihanJadwal = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (pilihanJadwal < 1 || pilihanJadwal > jadwalTayangOptions.length) {
            System.out.println("Pilihan tidak valid. Program berakhir.");
            return;
        }

        String jadwalTayang = jadwalTayangOptions[pilihanJadwal - 1];

        // Memasukkan jumlah tiket dan nomor kursi
        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        System.out.print("Masukkan nomor kursi: ");
        String nomorKursi = scanner.nextLine();

        // Membuat objek tiket dan pemesanan
        Tiket tiket = new Tiket(filmTerpilih, jadwalTayang, nomorKursi);
        Pemesanan pemesanan = new Pemesanan(pelanggan, tiket, jumlahTiket);

        // Menampilkan detail pemesanan
        pemesanan.tampilkanDetailPemesanan();

        scanner.close();
    }
}
