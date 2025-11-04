package dependency;

public class PillboxIoT {
    private String idPillbox; 

    public PillboxIoT(String id) {
        this.idPillbox = id;
    }

    // METHOD GETTER (PUBLIC) UNTUK MENGAKSES NILAI PRIVATE
    public String getIdPillbox() {
        return idPillbox;
    }

    public void eksekusiJadwal(JadwalMinum jadwal) {
        String waktu = jadwal.getWaktuMinum(); 
        System.out.println("Pillbox " + idPillbox + ": Memicu slot obat pada waktu " + waktu);
    }
}