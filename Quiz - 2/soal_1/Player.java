package soal_1;

//Subclass damageAbleObject
public class Player extends DamageableObject {
    private int Score;
    private int LivesRemaining;

    public Player(String name, int maxHealth, int lives) {
        this.name = name;
        this.MaxHealth = maxHealth;
        setHealth(maxHealth);
        this.LivesRemaining = lives;
        this.Score = 0;
    }

    @Override
    public void OnKilled() {
        LivesRemaining--;
        System.out.println(name + " was killed! Lives remaining: " + LivesRemaining);
        if (LivesRemaining <= 0) {
            System.out.println(name + " is out of the game!");
        }
    }

    public void AddScore(int points) {
        Score += points;
        System.out.println(name + " scored! Total score: " + Score);
    }

    // Getters and Setters for private attributes
    public int getScore() {
        return Score;
    }

    public int getLivesRemaining() {
        return LivesRemaining;
    }
}

