package generalization;

public class Staf extends Person {
    public Staf(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Staf: " + nama + ", ID: " + id);
    }

    public String getId() {
        return null;
    }

    public String getNama() {
        return null;
    }
}