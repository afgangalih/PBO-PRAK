
public class Kulkas  extends AlatElektronik{
    private int jumlahPintu;

    public Kulkas(double harga, String warna, String merk, int jumlahPintu) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getInfo() {
        return super.getInfo() + ", Jumlah Pintu: " + jumlahPintu;
    }
}
