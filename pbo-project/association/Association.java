package association;

import dependency.JadwalMinum;

public class Association {
    public static void main(String[] args) {
        System.out.println("--- Mulai Simulasi Apotek Pintar PBO ---");

        // 1. Inisialisasi Objek Dasar
        Pengguna userAura = new Pengguna(101, "Aura"); 
        
        // 2. BIDIRECTIONAL ASSOCIATION (Pengguna <-> ResepObat)
        ResepObat resepA = new ResepObat(2001, userAura);
        userAura.tambahResep(resepA);      
        
        System.out.println("\n** BIDIRECTIONAL ASSOCIATION (PENGGUNA <-> RESEP) **");
        System.out.println("Pengguna: " + userAura.nama);
        System.out.println("Pemilik Resep " + resepA.getIdResep() + ": " + resepA.getPemilik().nama);
        System.out.println("---------------------------------------------------------");
        
        // 3. UNIDIRECTIONAL ASSOCIATION (ResepObat -> JadwalMinum)
        JadwalMinum jadwalPagi = new JadwalMinum("07:00"); 
        JadwalMinum jadwalMalam = new JadwalMinum("19:00");
        
        // Relasi ResepA menyimpan referensi ke Jadwal
        resepA.tambahJadwal(jadwalPagi);
        resepA.tambahJadwal(jadwalMalam);
        
        System.out.println("** UNIDIRECTIONAL ASSOCIATION (RESEP -> JADWAL) **");
        System.out.println("Resep " + resepA.getIdResep() + " memiliki " + resepA.getListJadwal().size() + " jadwal minum:");
        
        for (JadwalMinum j : resepA.getListJadwal()) {
             System.out.println("- Waktu: " + j.getWaktuMinum());
        }

        System.out.println("---------------------------------------------------------");

    }
}
