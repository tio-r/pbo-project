// Resep.java
import java.util.ArrayList;
import java.util.List;

public class Resep {
    private String nomor;
    private List<ResepItem> items;

    public Resep(String nomor) {
        this.nomor = nomor;
        this.items = new ArrayList<>();
    }

    public void tambahItem(ResepItem item) {
        items.add(item);
    }

    public float hitungTotalHarga() {
        float total = 0;
        for (ResepItem item : items) {
            total += item.getHarga() * item.getJumlah();
        }
        return total;
    }

    public void prosesResep() {
        for (ResepItem item : items) {
            item.prosesPenguranganStok();
        }
        System.out.println("Resep nomor " + nomor + " diproses, total harga: " + hitungTotalHarga());
    }

    public void tampilkanResep() {
        System.out.println("Resep Nomor: " + nomor);
        for (ResepItem item : items) {
            System.out.println("\t" + item);
        }
        System.out.println("Total Harga: " + hitungTotalHarga());
    }
}