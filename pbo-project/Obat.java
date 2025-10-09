// Obat.java
public class Obat {
    private String kode;
    private String nama;
    private int stok;

    public Obat(String kode, String nama, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Stok obat " + nama + " berkurang sebanyak " + jumlah);
        } else {
            System.out.println("Stok obat " + nama + " tidak cukup");
        }
    }

    @Override
    public String toString() {
        return "Obat{" + "kode='" + kode + '\'' + ", nama='" + nama + '\'' + ", stok=" + stok + '}';
    }
}