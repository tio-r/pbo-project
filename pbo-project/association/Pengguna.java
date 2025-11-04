// BIDIRECTIONAL ASSOCIATION: Pengguna TAHU daftarResep.
package association;

import java.util.ArrayList;
import java.util.List;

public class Pengguna {
    public int idPengguna; 
    public String nama; 
    private List<ResepObat> daftarResep;  // daftarResep adalah atribut yang merujuk ke banyak objek ResepObat.

    public Pengguna(int id, String nama) { 
        this.idPengguna = id;
        this.nama = nama;
        this.daftarResep = new ArrayList<>();
    }

    public void tambahResep(ResepObat resep) {
        this.daftarResep.add(resep);
    }

    public List<ResepObat> getDaftarResep() {
        return daftarResep;
    }
}