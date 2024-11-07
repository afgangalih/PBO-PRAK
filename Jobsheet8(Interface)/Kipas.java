// Kipas.java

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(double harga, String warna, String merk, String jenis) {
        super(harga, warna, merk); // Memanggil konstruktor kelas induk
        this.jenis = jenis; // Menginisialisasi atribut jenis
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenis;
    }
}
