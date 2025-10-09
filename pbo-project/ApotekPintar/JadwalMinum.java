// Class Independen (digunakan sebagai parameter di PillboxIoT)
public class JadwalMinum {
    private String waktuMinum;
    
    public JadwalMinum(String waktu) {
        this.waktuMinum = waktu;
    }
    
    public String getWaktuMinum() {
        return waktuMinum;
    }
}