// Apotek.java
import java.util.ArrayList;
import java.util.List;

public class Apotek {
    private String nama;
    private String alamat;
    private List<Staf> stafList; // Aggregation
    private List<Obat> obatList;

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.stafList = new ArrayList<>();
        this.obatList = new ArrayList<>();
    }

    public void tambahStaf(Staf staf) {
        stafList.add(staf);
    }

    public void tambahObat(Obat obat) {
        obatList.add(obat);
    }

    public Obat cariObat(String kode) {
        for (Obat o : obatList) {
            if (o.getKode().equals(kode)) {
                return o;
            }
        }
        return null;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Apotek: " + nama);
        System.out.println("Alamat: " + alamat);
    }

    public void infoObat() {
        System.out.println("Daftar Obat di Apotek:");
        for (Obat o : obatList) {
            System.out.println(o);
        }
    }

    public void tampilkanStaf() {
        System.out.println("Daftar Staf di Apotek:");
        for (Staf s : stafList) {
            s.tampilkanInfo();
        }
    }
}