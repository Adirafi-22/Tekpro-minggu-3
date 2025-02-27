public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public String getNamaMakanan(int index) {
        return namaMakanan[index];
    }

    public void setNamaMakanan(int index, String nama) {
        this.namaMakanan[index] = nama;
    }

    public double getHargaMakanan(int index) {
        return hargaMakanan[index];
    }

    public void setHargaMakanan(int index, double harga) {
        this.hargaMakanan[index] = harga;
    }

    public int getStok(int index) {
        return stok[index];
    }

    public void setStok(int index, int jumlah) {
        if (jumlah >= 0) {
            this.stok[index] = jumlah;
        } else {
            System.out.println("Error: Stok tidak bisa negatif!");
        }
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < namaMakanan.length) {
            setNamaMakanan(id, nama);
            setHargaMakanan(id, harga);
            setStok(id, stok);
            id++;
        } else {
            System.out.println("Menu penuh, tidak bisa menambahkan lebih banyak makanan.");
        }
    }

    public void tampilMenuMakanan() {
        System.out.println("=== Daftar Menu Makanan ===");
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(getNamaMakanan(i) + " [" + getStok(i) + "]\tRp. " + getHargaMakanan(i));
            }
        }
    }

    private boolean isOutOfStock(int index) {
        return getStok(index) == 0;
    }

    public void pesanMakanan(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (getNamaMakanan(i).equalsIgnoreCase(nama)) {
                if (getStok(i) >= jumlah) {
                    setStok(i, getStok(i) - jumlah);
                    System.out.println("Pesanan berhasil: " + jumlah + " " + nama);
                } else {
                    System.out.println("Pesanan gagal: stok " + nama + " tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Pesanan gagal: makanan tidak ditemukan.");
    }
}
