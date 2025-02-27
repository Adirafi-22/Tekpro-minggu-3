class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;
    private int jumlahTiket;

    public Pemesanan(Pelanggan pelanggan, Tiket tiket, int jumlahTiket) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
        this.jumlahTiket = jumlahTiket;
    }
    // Getter untuk pelanggan
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    // Getter untuk tiket
    public Tiket getTiket() {
        return tiket;
    }

    // Getter untuk jumlah tiket
    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void tampilkanDetailPemesanan() {
        System.out.println("=== Detail Pemesanan Tiket ===");
        System.out.println("Nama Pelanggan  : " + pelanggan.getNama());
        System.out.println("Email           : " + pelanggan.getEmail());
        System.out.println("Nomor Telepon   : " + pelanggan.getNomorTelepon());
        System.out.println("Film            : " + tiket.getFilm().getJudul());
        System.out.println("Genre           : " + tiket.getFilm().getGenre());
        System.out.println("Durasi          : " + tiket.getFilm().getDurasi() + " menit");
        System.out.println("Jadwal Tayang   : " + tiket.getJadwalTayang());
        System.out.println("Nomor Kursi     : " + tiket.getNomorKursi());
        System.out.println("Harga per Tiket : Rp " + tiket.getFilm().getHarga());
        System.out.println("Jumlah Tiket    : " + jumlahTiket);
        System.out.println("Total Harga     : Rp " + (tiket.getFilm().getHarga() * jumlahTiket));
    }
}
