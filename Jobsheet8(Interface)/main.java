public class main {
    public static void main(String[] args) {
        
        TV tv = new TV("LED", 15, 120000, "Hitam", "Samsung");
        tv.naikkanVolume(4);
        System.out.println(tv.getInfo());

        
        Kipas kipas = new Kipas(1000000, "Putih", "LG", "Kipas Angin");
        System.out.println(kipas.getInfo()); 

        SmartFridge fridge = new SmartFridge(1500000, "Putih", "Samsung", 3, "IPS", 7);
        fridge.turunkanVolume(2);
        System.out.println(fridge.getInfo());
    }
}