package soal_1;

// Monster.java
public class Monster extends DamageableObject {
    private int ThreatLevel;
    private String Color;

    public Monster(String name, int maxHealth, int threatLevel, String color) {
        this.name = name;
        this.MaxHealth = maxHealth;
        setHealth(maxHealth);
        this.ThreatLevel = threatLevel;
        this.Color = color;
    }

    public String MakeNoise() {
        return name + " (Color: " + Color + ") makes a loud roar!";
    }

    @Override
    public void OnKilled() {
        System.out.println(name + " was defeated! Threat level: " + ThreatLevel);
    }

    // Getters and Setters for private attributes
    public int getThreatLevel() {
        return ThreatLevel;
    }

    public String getColor() {
        return Color;
    }
}
