class Pelanggan {
    private String nama;
    private String email;
    private String nomorTelepon;

    public Pelanggan(String nama, String email, String nomorTelepon) {
        this.nama = nama;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
}
