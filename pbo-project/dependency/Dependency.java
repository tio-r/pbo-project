package dependency;

public class Dependency {
    public static void main(String[] args) {

        PillboxIoT pillboxAura = new PillboxIoT("PBX-001");
        
        JadwalMinum jadwalPagi = new JadwalMinum("07:00"); 
        JadwalMinum jadwalMalam = new JadwalMinum("19:00");

        System.out.println("---------------------------------------------------------");

        System.out.println("** DEPENDENCY (PILLBOX " + pillboxAura.getIdPillbox() + " -> JADWALMINUM) **");
        
        // PillboxIoT menggunakan (bergantung pada) objek JadwalMinum sebagai parameter
        pillboxAura.eksekusiJadwal(jadwalPagi); 
        pillboxAura.eksekusiJadwal(jadwalMalam); 
        
        System.out.println("---------------------------------------------------------");
    }
}