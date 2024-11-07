
public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(double harga, String warna, String merk, int jumlahPintu, String jenisLayar, int volume) {
        super(harga, warna, merk, jumlahPintu);
        this.volume = volume;
    }



    @Override
    public void naikkanVolume(int increment) {
       this.volume += increment;
    }

    @Override    
    public void turunkanVolume(int decrement) {
        this.volume -= decrement;
    }

    public int getVolume() {    
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return super.getInfo() + ", Volume: " + volume;
    }

}
