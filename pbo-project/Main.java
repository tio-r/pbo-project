// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Apotek
        Apotek apotek = new Apotek("Apotek Sehat", "Jl. Kesehatan No. 1");
        apotek.tampilkanInfo(); // panggil method untuk tampilkan info apotek

        // Menambah Obat
        Obat obat1 = new Obat("O001", "Paracetamol 500mg", 100);
        Obat obat2 = new Obat("O002", "Amoxicillin 250mg", 50);
        apotek.tambahObat(obat1);
        apotek.tambahObat(obat2);

        // Menambah Staf
        Staf staf1 = new Staf("S001", "Budi");
        apotek.tambahStaf(staf1);

        // Tampilkan info Obat dan Staf
        apotek.infoObat();
        apotek.tampilkanStaf();

        // Buat Resep
        Resep resep1 = new Resep("R001");
        // Tambahkan item resep
        ResepItem item1 = new ResepItem(apotek.cariObat("O001"), 10, 5000);
        ResepItem item2 = new ResepItem(apotek.cariObat("O002"), 5, 10000);
        resep1.tambahItem(item1);
        resep1.tambahItem(item2);

        // Proses resep
        System.out.println("\n--- Proses Resep ---");
        staf1.tampilkanInfo();
        resep1.prosesResep();

        // Tampilkan detail resep
        System.out.println("\n--- Detail Resep ---");
        resep1.tampilkanResep();

        // Setelah proses, cek stok obat
        System.out.println("\n--- Stok Obat Setelah Pemrosesan ---");
        apotek.infoObat();

        // Demonstrasi Pembayaran
        System.out.println("\n--- Pembayaran ---");
        Pembayaran pembayaran = new PembayaranKartu();
        pembayaran.prosesPembayaran(resep1.hitungTotalHarga());
    }
}