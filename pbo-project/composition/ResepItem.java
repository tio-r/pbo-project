package composition;

import aggregation.Obat;

public class ResepItem {
    private Obat obat;
    private int jumlah;
    private float harga;

    public ResepItem(Obat obat, int jumlah, float harga) {
        this.obat = obat;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public Obat getObat() {
        return obat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void prosesPenguranganStok() {
        obat.kurangiStok(jumlah);
    }

    @Override
    public String toString() {
        return "ResepItem{" +
                "obat=" + obat.getNama() +
                ", jumlah=" + jumlah +
                ", harga=" + harga +
                '}';
    }
}