import java.util.ArrayList;
import java.util.List;

public class ResepObat {
    private int idResep;
    private Pengguna pemilik; 
    
    // UNIDIRECTIONAL ASSOCIATION: ResepObat TAHU JadwalMinum.
    // listJadwal adalah atribut yang merujuk ke banyak objek JadwalMinum.
    private List<JadwalMinum> listJadwal; 

    public ResepObat(int id, Pengguna p) {
        this.idResep = id;
        this.pemilik = p; 
        this.listJadwal = new ArrayList<>(); // Inisialisasi list
    }

    public Pengguna getPemilik() {
        return pemilik;
    }

    public int getIdResep() {
        return idResep;
    }
    
    // Method untuk menambah objek JadwalMinum ke list 
    public void tambahJadwal(JadwalMinum jadwal) {
        this.listJadwal.add(jadwal);
    }
    
    public List<JadwalMinum> getListJadwal() {
        return listJadwal;

    }
    }