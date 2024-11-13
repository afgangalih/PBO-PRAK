package coba;

public class main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Zuhaid");
        HeroStrength hero2 = new HeroStrength("Ardi");
        hero1.display();
        hero2.display();

        //Polymorphism
        Hero hero3 = new HeroStrength("Ishak");
        hero3.display();

        // Error, karena Hero belum tentu HeroStrength, tetapi HeroStrength Sudah pasti Hero
        // HeroStrength hero4 = new Hero("asep");
        // hero4.display();
    }
}
