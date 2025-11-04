package aggregation;

import generalization.Staf;

public class Aggregation {
    public static void main(String[] args) {
        Apotek apotek = new Apotek("Apotek Naura Farma", "Jl. Kesehatan No. 1");

        Obat obat1 = new Obat("O001", "Paracetamol 500mg", 100);
        Obat obat2 = new Obat("O002", "Amoxicillin 250mg", 50);
        apotek.tambahObat(obat1);
        apotek.tambahObat(obat2);

        Staf staf1 = new Staf("S001", "Udin");
        Staf staf2 = new Staf("S002", "Asep");
        apotek.tambahStaf(staf1);
        apotek.tambahStaf(staf2);

        System.out.println("\n--- Aggregation ---");
        apotek.tampilkanInfo();
        apotek.infoObat();
        apotek.tampilkanStaf();
    }
}
