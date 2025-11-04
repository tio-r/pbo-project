package generalization;

public class Pasien extends Person {
    public Pasien(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pasien: " + nama + ", ID: " + id);
    }
}