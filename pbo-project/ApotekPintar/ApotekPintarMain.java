public class ApotekPintarMain {
    public static void main(String[] args) {
        System.out.println("--- Mulai Simulasi Apotek Pintar PBO ---");

        // 1. Inisialisasi Objek Dasar
        Pengguna userAura = new Pengguna(101, "Aura"); 
        PillboxIoT pillboxAura = new PillboxIoT("PBX-001");
        
        // 2. BIDIRECTIONAL ASSOCIATION (Pengguna <-> ResepObat)
        ResepObat resepA = new ResepObat(2001, userAura); // Resep tahu pemilik (Unidirectional 1)
        userAura.tambahResep(resepA);                     // Pengguna tahu resepnya (Unidirectional 2)
        
        System.out.println("\n** DEMO BIDIRECTIONAL ASSOCIATION (PENGGUNA <-> RESEP) **");
        System.out.println("Pengguna: " + userAura.nama);
        System.out.println("Pemilik Resep " + resepA.getIdResep() + ": " + resepA.getPemilik().nama);
        System.out.println("---------------------------------------------------------");
        
        // 3. UNIDIRECTIONAL ASSOCIATION (ResepObat -> JadwalMinum)
        JadwalMinum jadwalPagi = new JadwalMinum("07:00"); 
        JadwalMinum jadwalMalam = new JadwalMinum("19:00");
        
        // Relasi ResepA menyimpan referensi ke Jadwal
        resepA.tambahJadwal(jadwalPagi);
        resepA.tambahJadwal(jadwalMalam);
        
        System.out.println("** DEMO UNIDIRECTIONAL ASSOCIATION (RESEP -> JADWAL) **");
        System.out.println("Resep " + resepA.getIdResep() + " memiliki " + resepA.getListJadwal().size() + " jadwal minum:");
        
        for (JadwalMinum j : resepA.getListJadwal()) {
             System.out.println("- Waktu: " + j.getWaktuMinum());
        }

        System.out.println("---------------------------------------------------------");

        // 4. DEPENDENCY (PillboxIoT --> JadwalMinum)
        System.out.println("** DEMO DEPENDENCY (PILLBOX " + pillboxAura.getIdPillbox() + " -> JADWALMINUM) **");
        
        // PillboxIoT menggunakan (bergantung pada) objek JadwalMinum sebagai parameter
        pillboxAura.eksekusiJadwal(jadwalPagi); 
        pillboxAura.eksekusiJadwal(jadwalMalam); 
        
        System.out.println("---------------------------------------------------------");
    }
}