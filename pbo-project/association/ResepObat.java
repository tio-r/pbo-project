// UNIDIRECTIONAL ASSOCIATION: ResepObat TAHU JadwalMinum.
package association;

import dependency.JadwalMinum;
import java.util.ArrayList;
import java.util.List;

public class ResepObat {
    private int idResep;
    private Pengguna pemilik; 
    
    private List<JadwalMinum> listJadwal;   // listJadwal adalah atribut yang merujuk ke banyak objek JadwalMinum.

    public ResepObat(int id, Pengguna p) {
        this.idResep = id;
        this.pemilik = p; 
        this.listJadwal = new ArrayList<>();
    }

    public Pengguna getPemilik() {
        return pemilik;
    }

    public int getIdResep() {
        return idResep;
    }
     
    public void tambahJadwal(JadwalMinum jadwal) {
        this.listJadwal.add(jadwal);
    }
    
    public List<JadwalMinum> getListJadwal() {
        return listJadwal;

    }
    
}