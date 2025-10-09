// PembayaranTunai.java
public class PembayaranTunai implements Pembayaran {
    @Override
    public void prosesPembayaran(float jumlah) {
        System.out.println("Pembayaran tunai sebesar Rp" + jumlah);
    }
}