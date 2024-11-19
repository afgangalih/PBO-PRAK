package soal_1;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Player
        Player player = new Player("Asep Saepudin", 100, 3);
        System.out.println("Player created: " + player.name);
        
        // Create a Monster
        Monster monster = new Monster("Buto Ijo", 150, 3, "Red");
        System.out.println("Monster created: " + monster.name);

        // Simulate damage
        player.TakeDamage(20);
        monster.TakeDamage(50);

        // Make noise
        System.out.println(monster.MakeNoise());

        // Kill both objects
        player.TakeDamage(90);
        monster.TakeDamage(100);
        monster.Despwan();
    }
}
