class Film {
    private String judul;
    private String genre;
    private int durasi;
    private int harga;

    public Film(String judul, String genre, int durasi, int harga) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.harga = harga;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getHarga() {
        return harga;
    }
}
