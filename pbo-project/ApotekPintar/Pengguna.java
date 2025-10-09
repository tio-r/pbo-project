import java.util.ArrayList;
import java.util.List;

public class Pengguna {
    public int idPengguna; 
    public String nama; 
    private List<ResepObat> daftarResep;

    //Menerima ID dan Nama
    public Pengguna(int id, String nama) { 
        this.idPengguna = id;
        this.nama = nama; // Inisialisasi atribut nama
        this.daftarResep = new ArrayList<>();
    }

    public void tambahResep(ResepObat resep) {
        this.daftarResep.add(resep);
    }

    public List<ResepObat> getDaftarResep() {
        return daftarResep;
    }
}