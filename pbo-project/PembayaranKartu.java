// PembayaranKartu.java
public class PembayaranKartu implements Pembayaran {
    @Override
    public void prosesPembayaran(float jumlah) {
        System.out.println("Pembayaran dengan kartu sebesar Rp" + jumlah);
    }
}