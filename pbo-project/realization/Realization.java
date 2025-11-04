package realization;

import aggregation.Apotek;
import aggregation.Obat;
import composition.Resep;
import composition.ResepItem;
import generalization.Staf;

public class Realization {
    public static void main(String[] args) {
        Apotek apotek = new Apotek("Apotek Naura Farma", "Jl. Kesehatan No. 1");

        Obat obat1 = new Obat("O001", "Paracetamol 500mg", 100);
        Obat obat2 = new Obat("O002", "Amoxicillin 250mg", 50);
        apotek.tambahObat(obat1);
        apotek.tambahObat(obat2);

        Staf staf1 = new Staf("S001", "Udin");

        Resep resep1 = new Resep("R001");
      
        ResepItem item1 = new ResepItem(apotek.cariObat("O001"), 10, 5000);
        ResepItem item2 = new ResepItem(apotek.cariObat("O002"), 5, 10000);
        resep1.tambahItem(item1);
        resep1.tambahItem(item2);

        System.out.println("\n--- Proses Resep ---");
        staf1.tampilkanInfo();
        resep1.prosesResep();

        System.out.println("\n--- Detail Resep ---");
        resep1.tampilkanResep();

        System.out.println("\n--- Stok Obat Setelah Pemrosesan ---");
        apotek.infoObat();

        System.out.println("\n--- Pembayaran ---");
        Pembayaran pembayaran = new PembayaranKartu();
        pembayaran.prosesPembayaran(resep1.hitungTotalHarga());
    }
}